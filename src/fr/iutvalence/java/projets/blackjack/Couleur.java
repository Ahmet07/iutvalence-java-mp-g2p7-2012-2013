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
	
	// FIXME (FIXED) réfélchir à la définition de cet attribut (statique/non statique)
	/**
	 * couleur de la carte (carreau,coeur,pique ou trèfle)
	 */
	private final int couleur;
	
	// FIXME définir un constructeur
	
	
	// FIXME définir un accesseur en lecture pour l'attribut
	
	// FIXME (FIXED) compléter/corriger le commentaire
	// FIXME (FIXED) gérer les erreurs correctement (faire un choix, à discuter)
	/**
	 * @param v
	 * La couleur de la carte par rapport à sa valeur
	 */
	private String toString(int v)
	{
	if (v == 1) return "Carreau";
	if (v == 2) return "Coeur";
	if (v == 3) return "Pique";
	if (v == 4) return "Trèfle";
	
	else return "Erreur";
	}
	
	public Couleur (int v)
	{
		if ((v>0) && (v<5))
			this.couleur = v;
		else return "Erreur";
	}
}
