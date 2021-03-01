package cda.jee.dao;

import java.util.ArrayList;

import cda.jee.modele.Cryptomonnaie;

public interface CryptoDao<T> {

	void create(T t);

	ArrayList<Cryptomonnaie> getAll();

	boolean update(Cryptomonnaie crypto);

	boolean delete(int id);
}
