package cda.jee.modele;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cryptomonnaie {
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

}
