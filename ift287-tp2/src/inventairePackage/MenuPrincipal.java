package inventairePackage;

/**
 * Classe du menu principale
 * Il permet l'accès aux différentes fonction du programme
 *
 */

public class MenuPrincipal {
	
	public static void afficherMenu(){
		System.out.println("Application de gestion de castes de baseball\n\n"
				+ "Voici la liste d'opérations valides :\n\n"
				+ "1. Ajouter un joueur\n"
				+ "2. Afficher l'information d'un joueur\n"
				+ "3. Mise à jour de l'information d'un joueur\n"
				+ "4. Effacer l'information d'un joueur\n"
				+ "5. Liste des joueurs\n"
				+ "6. Sauvegarde\n"
				+ "0. Sortir\n\n"
				+ "Votre sélection :");
	}

}
