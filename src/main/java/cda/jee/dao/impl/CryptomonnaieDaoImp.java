package cda.jee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cda.jee.connexion.MyConnection;
import cda.jee.dao.CryptoMonnaieDao;
import cda.jee.modele.Cryptomonnaie;

public class CryptomonnaieDaoImp implements CryptoMonnaieDao {

	static final String AFFICHER_LISTE_CRYPTOMONNAIE = "select * from CryptoMonnaie order by Id_CryptoMonnaie;";
	static final String UPDATE_CRYPTOMONNAIE = "update CryptoMonnaie set nom?,label=?, prix_Actuel=? where Id_CryptoMonnaie=?";
	static final String DELETE_FROM_CRYPTOMONNAIE = "delete from CryptoMonnaie where Id_CryptoMonnaie=?";
	static final String AJOUTER_UNE_CRYPTOMONNAIE = "insert into CryptoMonnaie (nom, label, prix_Actuel) VALUES (?,?,?);";

	@Override
	public void ajouterCrypto(Cryptomonnaie crypto) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement(AJOUTER_UNE_CRYPTOMONNAIE);
				statement.setString(1, crypto.getNom());
				statement.setString(2, crypto.getLabel());
				statement.setString(3, crypto.getPrixActuel());
				statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

// ***************************************************************

	@Override
	public List<Cryptomonnaie> afficherCrypto() {

		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement statement = c
						.prepareStatement("select * from CryptoMonnaie order by Id_CryptoMonnaie;");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					Cryptomonnaie.getListCrypto().add(new Cryptomonnaie(r.getInt("Id_CryptoMonnaie"),
							r.getString("nom"), r.getString("label"), r.getString("prix_Actuel")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Cryptomonnaie.getListCrypto();
	}

	// ****************************************************************

	@Override
	public boolean modifierCrypto(Cryptomonnaie crypto) {
		boolean rowUpdated = false;
		try (Connection c = MyConnection.getConnection()) {
			PreparedStatement statement = c.prepareStatement(UPDATE_CRYPTOMONNAIE);
			statement.setString(1, crypto.getNom());
			statement.setString(2, crypto.getLabel());
			statement.setString(3, crypto.getPrixActuel());
			statement.setInt(4, crypto.getId());
			rowUpdated = statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	// ***************************************************************

	@Override
	public boolean supprimerCrypto(int id) {
		boolean rowUpdated = false;
		try (Connection c = MyConnection.getConnection()) {
			PreparedStatement statement = c.prepareStatement(DELETE_FROM_CRYPTOMONNAIE);
			statement.setInt(1, id);
			rowUpdated = statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
}
