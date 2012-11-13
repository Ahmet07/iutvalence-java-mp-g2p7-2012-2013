package fr.iutvalence.java.projets.blackjack;

/**
 * La classe symbole définie les symboles de chaque carte
 * 
 * @author ozdemira
 * 
 */
public enum Symbole
{
	/**
	 * Déclaration de la couleur AS
	 */
	AS, 
	
	/**
	 * Déclaration de la couleur ROI
	 */
	ROI,
	
	/**
	 * Déclaration de la couleur DAME
	 */
	DAME,
	
	/**
	 * Déclaration de la couleur VALET
	 */
	VALET,
	
	/**
	 * Déclaration de la couleur DIX
	 */
	DIX,
	
	/**
	 * Déclaration de la couleur NEUF
	 */
	NEUF,
	
	/**
	 * Déclaration de la couleur HUIT
	 */
	HUIT,
	
	/**
	 * Déclaration de la couleur SEPT
	 */
	SEPT,
	
	/**
	 * Déclaration de la couleur SIX
	 */
	SIX, 
	
	/**
	 * Déclaration de la couleur CINQ
	 */
	CINQ,
	
	/**
	 * Déclaration de la couleur QUATRE
	 */
	QUATRE,
	
	/**
	 * Déclaration de la couleur TROIS
	 */
	TROIS,
	
	/**
	 * Déclaration de la couleur DEUX
	 */
	DEUX;
	
	
	
	/**
	 * Retourne la couleur sous forme de chaine de caractères
	 * 
	 */
	public String toString()
	{
	if (this.equals(AS)) return "As";
	if (this.equals(ROI)) return "Roi";
	if (this.equals(DAME)) return "Dame";
	if (this.equals(VALET)) return "Valet";
	if (this.equals(DIX)) return "10";
	if (this.equals(NEUF)) return "9";
	if (this.equals(HUIT)) return "8";
	if (this.equals(SEPT)) return "7";
	if (this.equals(SIX)) return "6";
	if (this.equals(CINQ)) return "5";
	if (this.equals(QUATRE)) return "4";
	if (this.equals(TROIS)) return "3";
	if (this.equals(DEUX)) return "2";
	
	else 
		return null;
	}
}
