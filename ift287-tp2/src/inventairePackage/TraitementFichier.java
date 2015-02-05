package inventairePackage;

/**
 * Classe permettant l'ouverture du fichier
 */

import java.io.*;

public class TraitementFichier {

	public static void ouvrirFichier(String nomFichier) {
		try {
			BufferedReader in = new BufferedReader ( new FileReader(nomFichier));
			String str;
			
			while ((str = in.readLine()) != null) {
				System.out.println(str);
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
