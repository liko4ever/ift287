package inventairePackage;

/**
 * Classe du menu principale
 * Il permet l'accès aux différentes fonction du programme
 *
 */
import java.util.*;


public class MenuPrincipal {
	
	private static void afficherMenu(){
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
		
		
	private static boolean choisirFonction(){
		Scanner in = new Scanner(System.in);
		
			switch (in.next()){
				//Pour sortir
				case "0":
					System.out.println("Option Selectionne: 0. Sortir\n");
					
					in.close();
					System.out.println("Merci d'avoir utiliser le système de gestion d'inventaire de carte.\n");
					return false;
				//Appel de Ajouter
				case "1":
					System.out.println("Option Selectionne: 1. Ajout d'un joueur\n");
					
					break;
				//Appel de Afficher	
				case "2":
					System.out.println("Option Selectionne: 2. Afficher l'information d'un joueur\n");
					
					break;
				//Appel de Mise a Jour
				case "3":
					System.out.println("Option Selectionne: 3. Mise à Jour de l'information d'un joueur\n");
					
					break;
				//Appel de Effacer
				case "4":
					System.out.println("Option Selectionne: 4. Suppression d'un enregistrement\n");
					
					break;
				//Appel de la liste
				case "5":
					System.out.println("Option Selectionne: 5. Liste des joueurs\n");
					
					break;
				//Appel de sauvegarde
				case "6":
					System.out.println("Option Selectionne: 6. Sauvegarde\n");
					
					break;
			}
		
		in.close();
		return true;	
	}
	
	
	public static void startMenu(){
		do{
			afficherMenu();
			
		}while(choisirFonction());
	}

}
