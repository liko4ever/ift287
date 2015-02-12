package inventairePackage;

/**
 * Classe permettant l'ouverture du fichier
 */

import java.io.*;

public class TraitementFichier {

	public static void ouvrirFichier(String nomFichier) {
		try {
			BufferedReader in = new BufferedReader ( new FileReader(nomFichier));
			String str, idJoueur, nomJoueur;
			int indexDeb = 0, indexFin = 0,
					nbCartes = 0;
			
			while ((str = in.readLine()) != null) {
				
				indexDeb = str.indexOf("\"", indexFin);
				indexFin = str.indexOf("\"", indexDeb);
				idJoueur = str.substring(indexDeb, indexFin);
				
				indexDeb = str.indexOf("\"", indexFin);
				indexFin = str.indexOf("\"", indexDeb);
				nomJoueur = str.substring(indexDeb, indexFin);
				
				indexDeb = str.indexOf("\"", indexFin);
				indexFin = str.indexOf("\"", indexDeb);
				nbCartes = Integer.parseInt(str.substring(indexDeb, indexFin));
				
				Joueur nouvJoueur = new Joueur(idJoueur,nomJoueur,nbCartes);
				
				for(int i = 0; i < nbCartes; ++i){
					
				}
				
				
				str.ind
				System.out.println(i);
				i++;
			}
			
			in.close();
		}
		catch (IOException e) {
			creationFichier(nomFichier);
			System.out.println("Le fichier était inexistant.\nUn nouveau fichier a été créé.");
		}
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
