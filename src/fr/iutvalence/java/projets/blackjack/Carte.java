package fr.iutvalence.java.projets.blackjack;

/**
 *La classe Carte permet de définir toutes les caractéristiques d'une carte à jouer
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Carte
{
	// FIXME supprimer les constantes, elles sont déjà définies dans Couleur
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
	

	// FIXME utiliser le type Couleur
	/**
	 * couleur de la carte (carreau,coeur,pique ou trèfle)
	 */
	private final int couleur;

	/**
	 * Valeur de la carte  ( 1 pour As, 2 pour DEUX ...)
	 */
	private final int valeur;

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
	
	// FIXME  compléter/corriger le commentaire (la méthode ne crée pas de carte)
	/**
	 *Permet de créer une carte sous forme de chaine de caracteres
	 */
	public String toString()
	{
		String s = "Carte de couleur "+ couleurToString(this.couleur);
		s += " et de symbole " + symboleToString(this.symbole);
		return s;
	}

}
