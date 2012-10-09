package fr.iutvalence.java.projets.blackjack;

/**
 *La classe Carte permet de définir toutes les caractéristiques d'une carte à jouer
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Carte
{
	
	
	/**
	 * Constante représentant la couleur "Carreau"
	 */	
	public final static int CARREAU = 1;
	
	/**
	 * Constante représentant la couleur "Coeur"
	 */	
	public final static int COEUR = 2;
	
	/**
	 * Constante représentant la couleur "Pique"
	 */	
	public final static int PIQUE = 3;
	
	/**
	 * Constante représentant la couleur "Trèfle"
	 */	
	public final static int TREFLE = 4;
	
	

		
	// FIXME (FIXED) réfélchir à la définition de cet attribut (statique/non statique)
	/**
	 * couleur de la carte (carreau,coeur,pique ou trèfle)
	 */
	private final int couleur;

	// FIXME (FIXED) réfélchir à la définition de cet attribut (statique/non statique)
	/**
	 * Valeur de la carte  ( 1 pour As, 2 pour DEUX ...)
	 */
	private final int valeur;

	// FIXME (FIXED) réfélchir à la définition de cet attribut (statique/non statique)
	/**
	 *  Symbole à la carte (Roi,dame,vallet,as...)
	 */
	private final int symbole;
	
	//FIXME corriger le commentaire (dire quel est l'état  de l'objet créé)
	/**
	 * Une carte est composée de sa couleur c, de sa valeur v et de son symbole s.
	 */
	public Carte(int c, int s, int v)
	{
		this.couleur = c;
		this.symbole = s;				
		this.valeur  = v;
	}
	
	
	// FIXME (FIXED) déplacer dans une classe Couleur (avec les constantes)
	/**
	 * @param v
	 * @return La couleur de la carte par rapport à sa valeur
	 */
	private String couleurToString(int v)
	{
	if (v == 1) return "Carreau";
	if (v == 2) return "Coeur";
	if (v == 3) return "Pique";
	if (v == 4) return "Trèfle";
	// FIXME gérer les erreurs avec des exceptions
	else return "Erreur";
	}
	
	// FIXME (FIXED) déplacer dans une classe Symbole (avec les constantes)
	private String symboleToString(int s)
	{
	if (s == 1) return "As";
	if (s == 2) return "Deux";
	if (s == 3) return "Trois";
	if (s == 4) return "Quatre";
	if (s == 5) return "Cinq";
	if (s == 6) return "Six";
	if (s == 7) return "Sept";
	if (s == 8) return "Huit";
	if (s == 9) return "Neuf";
	if (s == 10) return "Dix";
	if (s == 11) return "Valet";
	if (s == 12) return "Dame";
	if (s == 13) return "Roi";
	
	// FIXME gérer les erreurs avec des exceptions
	else return "Erreur";
	}
	
	// FIME(FIXED) écrire un commentaire
	/**
	 * @return Permet de créer une carte sous forme de chaine de caracteres
	 */
	public String toString()
	{
		String s = "Carte de couleur "+ couleurToString(this.couleur);
		s += " et de symbole " + symboleToString(this.symbole);
		return s;
	}

}
