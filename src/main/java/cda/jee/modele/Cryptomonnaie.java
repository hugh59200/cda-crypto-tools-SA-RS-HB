package cda.jee.modele;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Cryptomonnaie {

	private int id;
	private String nom;
	private String label;
	private String prixActuel;
	private static List<Cryptomonnaie> listCrypto = new ArrayList<>();

	public static List<Cryptomonnaie> getListCrypto() {
		return listCrypto;
	}

	public static void setListCrypto(List<Cryptomonnaie> listCrypto) {
		Cryptomonnaie.listCrypto = listCrypto;
	}
}