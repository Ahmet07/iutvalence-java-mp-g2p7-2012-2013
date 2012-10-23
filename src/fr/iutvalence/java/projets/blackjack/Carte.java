package fr.iutvalence.java.projets.blackjack;

/**
 *La classe Carte permet de définir toutes les caractéristiques d'une carte à jouer
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Carte
{
	// FIXME (FIXED) supprimer les constantes, elles sont déjà définies dans Couleur

	// FIXME (FIXED) utiliser le type Couleur
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
	
	
	//FIXME (FIXED) corriger le commentaire (dire quel est l'état  de l'objet créé)
	/**
	 * Instancie un objet de la classe Carte
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
	
	// FIXME (FIXED) compléter/corriger le commentaire (la méthode ne crée pas de carte)
	/**
	 *Permet de visualiser une carte sous forme de chaine de caracteres 
	 *en lui attribuant des paramètres prédéfinis.
	 */
	
	
	
	public String toString()
	{
		String s = "Carte de couleur "+ this.couleur;
		s += " et de symbole " + this.symbole;
		return s;
	}

}
