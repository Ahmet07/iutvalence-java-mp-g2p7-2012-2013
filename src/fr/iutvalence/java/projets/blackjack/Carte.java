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
		
		 switch(this.symbole)
		 {
	     case AS:
	    	 this.valeur=1;
	    	 break;
	     case DEUX:
	    	 this.valeur=2;
	    	 break;
	     case TROIS:
	    	 this.valeur=3;
	    	 break;
	     case QUATRE:
	    	 this.valeur=4;
	    	 break;
	     case CINQ:
	    	 this.valeur=5;
	    	 break;
	     case SIX:
	    	 this.valeur=6;
	    	 break;
	     case SEPT:
	    	 this.valeur=7;
	    	 break;
	     case HUIT:
	    	 this.valeur=8;
	    	 break;
	     case NEUF:
	    	 this.valeur=9;
	    	 break;
	     case DIX:
	    	 this.valeur=10;
	    	 break;
	     case VALET:
	    	 this.valeur=10;
	    	 break;
	     case DAME:
	    	 this.valeur=10;
	    	 break;
	     case ROI:
	    	 this.valeur=10;
	    	 break;
		 }
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
