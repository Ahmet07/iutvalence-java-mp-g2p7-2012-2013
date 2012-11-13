package fr.iutvalence.java.projets.blackjack;

/**
 * Enumération des couleurs (seulement 4 possibles)
 * @author ozdemira
 *
 */
public enum Couleur
{
	
	/**
	 * Déclaration de la couleur CARREAU
	 */
	CARREAU, 
	
	/**
	 * Déclaration de la couleur COEUR
	 */
	COEUR,
	
	/**
	 * Déclaration de la couleur PIQUE
	 */
	PIQUE,
	
	/**
	 * Déclaration de la couleur TREFLE
	 */
	TREFLE;
	
	
	// FIXME (FIXED) compléter/corriger le commentaire (ça ne veut rien dire)
	/**
	 * Retourne la couleur sous forme de chaine de caractères
	 * 
	 */
	public String toString()
	{
	if (this.equals(CARREAU)) return "Carreau";
	if (this.equals(COEUR)) return "Coeur";
	if (this.equals(PIQUE)) return "Pique";
	if (this.equals(TREFLE)) return "Trèfle";
	
	else 
		return null;
	}

}
