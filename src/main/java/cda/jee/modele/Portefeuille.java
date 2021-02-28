package cda.jee.modele;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Portefeuille {
	private int idPortefeuille;
	private int NombreUnite;
	private float prixAchat;
	private LocalDate dateAchat;	
}
