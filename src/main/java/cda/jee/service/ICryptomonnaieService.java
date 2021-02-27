package cda.jee.service;

import java.util.List;
import java.util.Optional;

import cda.jee.modele.Cryptomonnaie;

public interface ICryptomonnaieService {

	List<Cryptomonnaie> getAll();

	Optional<Cryptomonnaie> getById(int id);

}
