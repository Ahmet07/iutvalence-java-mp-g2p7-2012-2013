package fr.iutvalence.java.projets.blackjack;

/**
 *La classe Carte permet de définir toutes les caractéristiques d'une carte à jouer
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Carte
{
	/**
	 * couleur de la carte (carreau,coeur,pique ou trèfle)
	 */
	private final Couleur couleur;

	/**
	 * Valeur de la carte  ( 1 pour As, 2 pour DEUX ...)
	 */
	private final int valeur;

	/**
	 *  Symbole à la carte (Roi,dame,vallet,as...)
	 */
	private final Symbole symbole;
	
	/**
	 * Crée une nouvelle carte, de couleur, de symbole et de valeur donnés
	 * @param c représente la couleur de la carte 
	 * @param s représente le symbole de la carte
	 * @param v représente la valeur de la carte 
	 */
	
	public Carte(Couleur c,Symbole s,int v)
	{
		this.couleur = c;
		this.symbole = s;				
		this.valeur  = v;
	}
	
	/**
	 *Permet de visualiser une carte sous forme de chaine de caracteres 
	 *
	 */
	
	public String toString()
	{
		String s = "Carte de couleur "+ this.couleur;
		s += " et de symbole " + this.symbole;
		return s;
	}

}
