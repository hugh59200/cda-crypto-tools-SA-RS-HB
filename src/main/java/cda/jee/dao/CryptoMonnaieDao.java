package cda.jee.dao;

import java.util.List;

import cda.jee.modele.Cryptomonnaie;

public interface CryptoMonnaieDao {

	public void ajouterCrypto(Cryptomonnaie crypto);
	
	public List<Cryptomonnaie> afficherCrypto();

	public boolean modifierCrypto(Cryptomonnaie crypto);
	
	public boolean supprimerCrypto(int id);
}
