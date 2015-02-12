package inventairePackage;

/**
 * Classe comportant les informations du joueur
 * ainsi que le nombre de carte à son actif
 */

public class Joueur {
private
	String cle; 		/* clé d'enregistrement du joueur. Taille max 16*/
	String nomJoueur;	/* nom du joueur qui apparaît sur la carte.  Taille max 128 caractères*/
	int nombreCartes; 		/* Indique combien de cartes de ce joueur il y en a Maximum 20 */
	
	Joueur(String idJoueur, String nom, int nbCarte){
		editer(idJoueur, nom, nbCarte);
	}
	
	Joueur(){
		editer("", "", 0);
		
	}
	
	public void editer(String idJoueur, String nom, int nbCarte){
		cle = idJoueur;
		nomJoueur = nom;
		nombreCartes = nbCarte;	
	}
		
}
