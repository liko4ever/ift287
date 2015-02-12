package inventairePackage;

/**
 * Programme principal
 * Il s'occupe de l'appel de la classe menu principale
 * pour le bon fonctionnement du programme
 * 
 * @author Dominic Duchêne
 * @author Étienne Dussault
 * @author Nicolas Lamarche
 */


public class Inventaire {

	public static void main(String[] args){
		MenuPrincipal.startMenu(TraitementFichier.ouvrirFichier("BLOPPPPP"));
	}
}
