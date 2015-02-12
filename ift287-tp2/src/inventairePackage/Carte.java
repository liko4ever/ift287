package inventairePackage;

/**
 * Classe comportant les informations des cartes
 */


public class Carte {
	private String titreCarte; //[50];	/* titre de la carte. Taille max 50*/
	private String nomEquipe; //[30]; 	/* Le nom de l’équipe à laquelle le jouer appartient sur cette carte */
	private int anneeSortie; 		/* annee de sortie de la carte*/
	
	Carte(String titre, String nom, int annee){
		editer(titre, nom, annee);
	}
	
	Carte(){
		editer("", "", 0);
	}

	public void editer(String titre, String nom, int annee){
		titreCarte = titre;
		nomEquipe = nom;
		anneeSortie = annee;
	}
	
}
