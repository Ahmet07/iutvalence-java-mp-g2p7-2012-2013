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
	 * Déclaration de le symbole AS
	 */
	AS_ONZE(11), 
	
	
	/**
	 * Déclaration de le symbole ROI
	 */
	ROI(10),
	
	/**
	 * Déclaration de le symbole DAME
	 */
	DAME(10),
	
	/**
	 * Déclaration de le symbole VALET
	 */
	VALET(10),
	
	/**
	 * Déclaration de le symbole DIX
	 */
	DIX(10),
	
	/**
	 * Déclaration de le symbole NEUF
	 */
	NEUF(9),
	
	/**
	 * Déclaration de le symbole HUIT
	 */
	HUIT(8),
	
	/**
	 * Déclaration de le symbole SEPT
	 */
	SEPT(7),
	
	/**
	 * Déclaration de le symbole SIX
	 */
	SIX(6), 
	
	/**
	 * Déclaration de le symbole CINQ
	 */
	CINQ(5),
	
	/**
	 * Déclaration de le symbole QUATRE
	 */
	QUATRE(4),
	
	/**
	 * Déclaration de le symbole TROIS
	 */
	TROIS(3),
	
	/**
	 * Déclaration de le symbole DEUX
	 */
	DEUX(2),
	
	/**
	 * Déclaration de le symbole AS
	 */
	AS(1);
	
	/**
	 * 
	 */
	private int value;

	/**
	 * @param v
	 */
	private Symbole(int v)
	{
		this.value = v;
	}	
	
	/**
	 * @return la valeur
	 */
	public int getValue()
	{
		return this.value;
	}
	
	/**
	 * Retourne la couleur sous forme de chaine de caractères
	 * 
	 */
	public String toString()
	{
	if (this.equals(AS_ONZE)) return "As(11)";
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
	if (this.equals(AS)) return "As";
	
	else 
		return null;
	}
}
