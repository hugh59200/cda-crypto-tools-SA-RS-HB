package cda.jee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cda.jee.connexion.MyConnection;
import cda.jee.dao.CryptoDao;
import cda.jee.modele.Cryptomonnaie;

public class CryptoDaoImp implements CryptoDao<Cryptomonnaie> {

	@Override
	public void create(Cryptomonnaie crypto) {
		String request = "insert into CryptoMonnaie (nom, label, prix_Actuel) VALUES (?,?,?);";
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement(request);
				statement.setString(1, crypto.getNom());
				statement.setString(2, crypto.getLabel());
				statement.setFloat(3, crypto.getPrixActuel());
				statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<Cryptomonnaie> getAll() {
		String request = "select * from CryptoMonnaie order by Id_CryptoMonnaie;";
		ArrayList<Cryptomonnaie> listCrytomonnaie = new ArrayList<Cryptomonnaie>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement(request);
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					Cryptomonnaie crypto = new Cryptomonnaie(r.getInt(1), r.getString(2), r.getString(3),
							r.getFloat(4));
					listCrytomonnaie.add(crypto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return listCrytomonnaie;
		}
		return null;
	}

	@Override
	public boolean update(Cryptomonnaie crypto) {
		String request = "update CryptoMonnaie set nom?,label=?, prix_Actuel=? where Id_CryptoMonnaie=?";
		boolean rowUpdated = false;
		try (Connection c = MyConnection.getConnection()) {
			PreparedStatement statement = c.prepareStatement(request);
			statement.setString(1, crypto.getNom());
			statement.setString(2, crypto.getLabel());
			statement.setFloat(3, crypto.getPrixActuel());
			statement.setInt(4, crypto.getId());
			rowUpdated = statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	@Override
	public boolean delete(int id) {
		String request = "delete from CryptoMonnaie where Id_CryptoMonnaie=?";
		boolean rowUpdated = false;
		try (Connection c = MyConnection.getConnection()) {
			PreparedStatement statement = c.prepareStatement(request);
			statement.setInt(1, id);
			rowUpdated = statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
}
