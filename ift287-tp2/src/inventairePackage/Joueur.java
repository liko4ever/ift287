package inventairePackage;

/**
 * Classe comportant les informations du joueur
 * ainsi que le nombre de carte � son actif
 */

public class Joueur {
private
	String cle; 		/* cl� d'enregistrement du joueur. Taille max 16*/
	String nomJoueur;	/* nom du joueur qui appara�t sur la carte.  Taille max 128 caract�res*/
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
