package fr.iutvalence.java.projets.blackjack;

public class Symbole
{
	/**
	 * Constante représentant la valeur "AS"
	 */	
	public final static int AS = 1;
	
	/**
	 * Constante représentant la valeur "DEUX"
	 */	
	public final static int DEUX = 2;
	
	/**
	 * Constante représentant la valeur "TROIS"
	 */	
	public final static int TROIS = 3;
	
	/**
	 * Constante représentant la valeur "QUATRE"
	 */	
	public final static int QUATRE = 4;
	
	/**
	 * Constante représentant la valeur "CINQ"
	 */	
	public final static int CINQ = 5;
	
	/**
	 * Constante représentant la valeur "SIX"
	 */	
	public final static int SIX = 6;
	
	/**
	 * Constante représentant la valeur "SEPT"
	 */	
	public final static int SEPT = 7;
	
	/**
	 * Constante représentant la valeur "HUIT"
	 */	
	public final static int HUIT = 8;
	
	/**
	 * Constante représentant la valeur  "NEUF"
	 */	
	public final static int NEUF = 9;
	
	/**
	 * Constante représentant la valeur  "DIX"
	 */	
	public final static int DIX = 10;
	
	/**
	 * Constante représentant la valeur  "VALLET"
	 */	
	public final static int VALET = 11;
	
	/**
	 * Constante représentant la valeur  "DAME"
	 */	
	public final static int DAME = 12;
	
	/**
	 * Constante représentant la valeur  "ROI"
	 */	
	public final static int ROI = 13;

	// FIXME (FIXED) réfélchir à la définition de cet attribut (statique/non statique)
	/**
	 *  Symbole à la carte (Roi,dame,vallet,as...)
	 */
	private final int symbole;
	
	
	
	// FIXME (FIXED) réfélchir à la définition de cet attribut (statique/non statique)
	/**
	 * Valeur de la carte  ( 1 pour As, 2 pour DEUX ...)
	 */
	private final int valeur;
	
	
	/**
	 *  On retourne la carte si elle existe
	 *  sinon, c'est que la valeur ne correspond pas au symbole,
	 *  on renvoit donc la valeur null.
	 */
	// FIXME (FIXED) déplacer dans une classe Symbole (avec les constantes)
		public String toString()
		{
		
			if ((s<1) || (s>13))
				return "La valeur de ce symbole n'est pas corecte.";
			else
				if ((s == 1) && (v == AS)) return "As"; 
			    if ((s == 2) && (v == DEUX)) return "Deux";
			    if ((s == 3) && (v == TROIS)) return "Trois"; 
			    if ((s == 4) && (v == QUATRE)) return "Quatre"; 
		        if ((s == 5) && (v == CINQ)) return "Cinq"; 
		        if ((s == 6) && (v == SIX)) return "Six";
		        if ((s == 7) && (v == SEPT)) return "Sept";
		        if ((s == 8) && (v == HUIT)) return "Huit";
		        if ((s == 9) && (v == NEUF)) return "Neuf";
		        if ((s == 10) && (v == DIX)) return "Dix"; 
		        if ((s == 11) && (v == VALET)) return "Valet"; 
		        if ((s == 12) && (v == DAME)) return "Dame";
		        if ((s == 13) && (v == ROI)) return "Roi"; 
		        else return null;
		// FIXME (FIXED) gérer les erreurs avec des exceptions
		}
		
		/**
		 * 
		 */
		public RecupererValeur()
		{

		}
}
