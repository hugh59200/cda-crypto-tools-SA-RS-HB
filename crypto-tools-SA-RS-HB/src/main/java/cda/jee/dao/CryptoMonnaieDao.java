package cda.jee.dao;

import java.util.List;
import java.util.Optional;
//This DAO class provides CRUD operations for the table CryptoMonnaie in the Database
public interface CryptoMonnaieDao<T> {

	static final String  AFFICHER_LISTE_CRYPTOMONNAIE="select * from CryptoMonnaie";
	static final String  UPDATE_CRYPTOMONNAIE="update CryptoMonnaie set nom?,label=?, prix_Actuel=? where Id_CryptoMonnaie=?";
	static final String  DELETE_FROM_CRYPTOMONNAIE="delete from CryptoMonnaie where Id_CryptoMonnaie=?";	
	static final String  AJOUTER_UNE_CRYPTOMONNAIE="insert into CryptoMonnaie (nom, label, prix_Actuel) VALUES (?,?,?);";
	
	List<T> getAll();

	Optional<T> getById(int id);

}
