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
	private int idCryptoMonnaie;
	private String nomCryptoMonnaie;
	private String label;
	private float prixActuel;
	private boolean delta;	

}