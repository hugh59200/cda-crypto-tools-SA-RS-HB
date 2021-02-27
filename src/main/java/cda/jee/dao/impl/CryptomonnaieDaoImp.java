package cda.jee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import cda.jee.connexion.MyConnection;
import cda.jee.dao.CryptoMonnaieDao;
import cda.jee.modele.Cryptomonnaie;

public class CryptomonnaieDaoImp<T> implements CryptoMonnaieDao {

	private List<Cryptomonnaie> cryptomonnaies;

	public CryptomonnaieDaoImp() {

	}

	@Override
	public List<Cryptomonnaie> getAll() {
		List<Cryptomonnaie> cryptomonnaie = new ArrayList<>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement(AFFICHER_LISTE_CRYPTOMONNAIE);
				ResultSet r = statement.executeQuery();
				while (r.next()) {
					cryptomonnaie.add(new Cryptomonnaie(r.getInt("Id_CryptoMonnaie"), r.getString("nom"), r.getString("label"), r.getFloat("prix_Actuel")));

					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return (List<Cryptomonnaie>) cryptomonnaie;
	}

	@Override
	public Optional<Cryptomonnaie> getById(int id) {
		return null;
	}

}
