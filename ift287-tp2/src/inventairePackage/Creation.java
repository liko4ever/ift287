package inventairePackage;


/**
 * Classe permettant de créé un nouvel enregistrement
 */

import java.util.*;

public class Creation {
	
	public static void creationJoueur(Vector<Joueur> listeJoueurs){
		
		System.out.println("Entrer la clé d'identification du joueur:");
		Scanner idJoueur = new Scanner(System.in);
		
		System.out.println("\nEntrer le nom du joueur:");
		Scanner nom = new Scanner(System.in);
		
		System.out.println("\nCombien de carte? :");
		Scanner nbCarte = new Scanner(System.in);
		
		Joueur nouvJoueur = new Joueur(idJoueur.toString(), nom.toString(), nbCarte.nextInt());
		
		for(int i=1; i <= nbCarte.nextInt();i++){
			nouvJoueur.ajouterCarte(creationCarte(i));
		}
		
		idJoueur.close();
		nom.close();
		nbCarte.close();
	}

	
	public static Carte creationCarte(int numCarte){
	
		System.out.println("\nEntrer le titre de la carte " + numCarte + " :");
		Scanner titreCarte = new Scanner(System.in);
		
		System.out.println("\nEntrer l'équipe de la carte " + numCarte + " :");
		Scanner equipeCarte = new Scanner(System.in);
		
		System.out.println("\nEntrer l'année de parution de la carte " + numCarte + " :");
		Scanner anneeCarte = new Scanner(System.in);
		
		titreCarte.close();
		equipeCarte.close();
		anneeCarte.close();
		
		return new Carte(titreCarte.toString(),equipeCarte.toString(),anneeCarte.nextInt());
	}
	
	
	
	
}
