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
	 *  Symbole à la carte (Roi,dame,vallet,as...)
	 */
	private final Symbole symbole;
	
	/**
	 * Crée une nouvelle carte, de couleur, de symbole et de valeur donnés
	 * @param c représente la couleur de la carte 
	 * @param s représente le symbole de la carte
	 * @param v représente la valeur de la carte 
	 */
	
	public Carte(Couleur c, Symbole s)
	{
		this.couleur = c;
		this.symbole = s;
	}
		 	 
	
	/**
	 *Permet de visualiser une carte sous forme de chaine de caracteres 
	 *
	 **/
	
	
	public String toString()
	{
		String s = " "+ this.symbole;
		s += " de " + this.couleur;
		s +=" (valeur " + this.symbole.getValue() +")";
		return s;
	}
	
	

	/**
	 * @param c1 Carte à comparer avec deuxième
	 * @param c2 Carte à comparer avec la première
	 * @return une valeur permettant de savoir quelle carte est supérieur 
	 * à l'autre, ou si elles sont égales.
	 */
	public static int comparerCartes(Carte c1, Carte c2)
	{
		if (c1.symbole.getValue() > c2.symbole.getValue()) return 1;
		if (c1.symbole.getValue() < c2.symbole.getValue()) return -1;
		else return 0;
	}
	

	// Fonctions Gets
	
	/**
	 * @return le symbole de la carte
	 */
	public  Symbole getsymbole()
	{return this.symbole;}

	
	/**
	 * @return la couleur de la carte
	 */
	public Couleur getcouleur()
	{return this.couleur;}
	
	
	/**
	 * @return la valeur de la carte
	 */
	public int getvaleur()
	{return this.symbole.getValue();}
	
	
}


