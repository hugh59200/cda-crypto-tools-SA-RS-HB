package cda.jee.dao;

import java.util.List;
import java.util.Optional;
//This DAO class provides CRUD operations for the table CryptoMonnaie in the Database
public interface PortefeuilleDAO<T> {

	static final String  AFFICHER_PORTEFEUILLE="select * from PorteFeuille";
	static final String  UPDATE_PORTEFEUILLE="update PorteFeuille join CryptoMonnaie on CryptoMonnaie.Id_CryptoMonnaie  = PorteFeuille.Id_CryptoMonnaie \r\n"
			+ "set PorteFeuille.Id_CryptoMonnaie=?,nombreUnite=?,prix_Actuel=? where Id_PorteFeuille=?;";
	static final String  DELETE_FROM_PORTEFEUILLE="delete from PorteFeuille where Id_PorteFeuille=?";
	
	List<T> getAll();

	Optional<T> getById(int id);

}
