package inventairePackage;

/**
 * Classe comportant les informations du joueur
 * ainsi que le nombre de carte � son actif
 */
import java.util.Vector;

public class Joueur {
private
	String cle; 		/* cl� d'enregistrement du joueur. Taille max 16*/
	String nomJoueur;	/* nom du joueur qui appara�t sur la carte.  Taille max 128 caract�res*/
	int nombreCartes; 		/* Indique combien de cartes de ce joueur il y en a Maximum 20 */
	Vector<Carte> cartes = new Vector<Carte>();
	
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
	
	public void ajouterCarte(Carte nouvCarte){
		cartes.add(nouvCarte);
		nombreCartes++;
	}
	
	public void ajouterCarte(String nomCarte, String lieuCarte, int anneeCarte){
		cartes.add(new Carte(nomCarte, lieuCarte, anneeCarte));	
		nombreCartes++;
	}
		
}
