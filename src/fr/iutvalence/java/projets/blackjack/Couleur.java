package fr.iutvalence.java.projets.blackjack;

public class Couleur
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
	 * couleur de la carte (carreau,coeur,pique ou trèfle)
	 */
	private final int couleur;
	
	// FIXME écrire le commentaire
	// FIXME utiliser les exceptions
	public Couleur (int v)
	{
		if ((v>0) && (v<5))
			this.couleur = v;
		else return "Erreur";
	}
	
	// FIXME définir un accesseur en lecture pour l'attribut
	
	// FIXME  compléter/corriger le commentaire (ça ne veut rien dire)
	/**
	 * La couleur de la carte par rapport à sa valeur
	 * @param v
	 * 
	 */
	private String toString(int v)
	{
	if (v == 1) return "Carreau";
	if (v == 2) return "Coeur";
	if (v == 3) return "Pique";
	if (v == 4) return "Trèfle";
	
	else return null;
	}

}
