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
	public Cryptomonnaie(int idCryptoMonnaie, String nomCryptoMonnaie, String label, float prixActuel, boolean delta) {
		super();
		this.idCryptoMonnaie = idCryptoMonnaie;
		this.nomCryptoMonnaie = nomCryptoMonnaie;
		this.label = label;
		this.prixActuel = prixActuel;
		this.delta = delta;
	}
	public Cryptomonnaie(int idCryptoMonnaie, String nomCryptoMonnaie, String label, float prixActuel) {
		super();
		this.idCryptoMonnaie = idCryptoMonnaie;
		this.nomCryptoMonnaie = nomCryptoMonnaie;
		this.label = label;
		this.prixActuel = prixActuel;
	}
	private int idCryptoMonnaie;
	private String nomCryptoMonnaie;
	private String label;
	private float prixActuel;
	private boolean delta;	
	public List<Cryptomonnaie> cryptomonnaie = new ArrayList<>();/*pour tester affichage HTML*/
}
