package inventairePackage;

/**
 * Classe permettant l'ouverture du fichier
 */

import java.io.*;
import java.util.Vector;

public class TraitementFichier {
	static int indexDeb;
	static int indexFin;

	public static Vector<Joueur> ouvrirFichier(String nomFichier) {
		Vector<Joueur> nouvJoueurs = new Vector<Joueur>();
		
		try {
			BufferedReader in = new BufferedReader ( new FileReader(nomFichier));
			String str, idJoueur, nomJoueur, nomCarte, lieuCarte;
			int nbCartes = 0, anneeCarte = 0;
			
			while ((str = in.readLine()) != null) {		
				indexDeb = 0;
				indexFin = 0;
				
				idJoueur = stringCutter(str,1);
				nomJoueur = stringCutter(str,3);
				nbCartes = Integer.parseInt(stringCutter(str,3));
				
				
				Joueur nouvJoueur = new Joueur(idJoueur,nomJoueur,nbCartes);
				
				for(int i = 0; i < nbCartes; ++i){
					nomCarte = stringCutter(str,3);
					lieuCarte = stringCutter(str,3);
					anneeCarte = Integer.parseInt(stringCutter(str,3));
					
					nouvJoueur.ajouterCarte(nomCarte, lieuCarte, anneeCarte);
				}
				
				nouvJoueurs.add(nouvJoueur);
			}
			
			in.close();
		}
		catch (IOException e) {
			creationFichier(nomFichier);
			System.out.println("Le fichier était inexistant.\nUn nouveau fichier a été créé.");
		}
		
		return nouvJoueurs;
	}
	
	private static String stringCutter(String str, int iCutter){
		indexDeb = indexFin + iCutter;
		indexFin = str.indexOf(";", indexDeb) - 1;
		System.out.println(indexDeb);
		System.out.println(indexFin);
		System.out.println(str.substring(indexDeb, indexFin));
		return str.substring(indexDeb, indexFin);
	}
	
	public static void creationFichier(String nomFichier){
		try {
			BufferedWriter out = new BufferedWriter (new FileWriter(nomFichier));
			out.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
