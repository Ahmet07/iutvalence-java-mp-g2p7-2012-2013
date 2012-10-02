package fr.iutvalence.java.projets.blackjack;

/**
 * @author Ozdemir Ahmet & Mezgueldi Samih
 * 
 *La classe Carte permet de définir toutes les caractéristiques d'une carte à jouer
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
	
	
	

	/**
	 * Constante représentant la valeur "AS"
	 */	
	public final static int AS = 1;
	
	/**
	 * Constante représentant la valeur "DEUX"
	 */	
	public final static int DEUX = 2;
	
	/**
	 * Constante représentant la valeur "TROIS"
	 */	
	public final static int TROIS = 3;
	
	/**
	 * Constante représentant la valeur "QUATRE"
	 */	
	public final static int QUATRE = 4;
	
	/**
	 * Constante représentant la valeur "CINQ"
	 */	
	public final static int CINQ = 5;
	
	/**
	 * Constante représentant la valeur "SIX"
	 */	
	public final static int SIX = 6;
	
	/**
	 * Constante représentant la valeur "SEPT"
	 */	
	public final static int SEPT = 7;
	
	/**
	 * Constante représentant la valeur "HUIT"
	 */	
	public final static int HUIT = 8;
	
	/**
	 * Constante représentant la valeur  "NEUF"
	 */	
	public final static int NEUF = 9;
	
	/**
	 * Constante représentant la valeur  "DIX"
	 */	
	public final static int DIX = 10;
	
	/**
	 * Constante représentant la valeur  "VALLET"
	 */	
	public final static int VALET = 11;
	
	/**
	 * Constante représentant la valeur  "DAME"
	 */	
	public final static int DAME = 12;
	
	/**
	 * Constante représentant la valeur  "ROI"
	 */	
	public final static int ROI = 13;
	
	
	
	
	// FIXME corriger le commentaire
	// FIXME une carte peut-elle changer de couleur ?	
	/**
	 * Declaration de l'entier couleur
	 */
	private int couleur;

	// FIXME une carte peut-elle changer de valeur ?
	// FIXME corriger le commentaire
	/**
	 * Declaration de l'entier valeur
	 */
	private int valeur;
	
	// FIXME corriger le commentaire
	// FIXME une carte peut-elle changer de symbole ?
	/**
	 * Declaration de l'entier symbole
	 */
	private int symbole;
	
	// FIXME corriger le commentaire
	/**
	 * Composition d'une carte
	 */
	public Carte(int c, int s, int v)
	{
		this.couleur = c;
		this.symbole = s;				
		this.valeur  = v;
	}
	
	
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
	
	// FIME écrire un commentaire
	public String toString()
	{
		String s = "Carte de couleur "+ couleurToString(this.couleur);
		s += " et de valeur " + this.symbole;
		return s;
	}

}
