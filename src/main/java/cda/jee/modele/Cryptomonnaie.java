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

	private int id;
	private String nom;
	private String label;
	private float prixActuel;
}
