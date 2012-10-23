package fr.iutvalence.java.projets.blackjack;

/**
 * La classe symbole définie les symboles de chaque carte
 * 
 * @author ozdemira
 * 
 */
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
	 * Constante représentant la valeur "NEUF"
	 */
	public final static int NEUF = 9;

	/**
	 * Constante représentant la valeur "DIX"
	 */
	public final static int DIX = 10;

	/**
	 * Constante représentant la valeur "VALLET"
	 */
	public final static int VALET = 11;

	/**
	 * Constante représentant la valeur "DAME"
	 */
	public final static int DAME = 12;

	/**
	 * Constante représentant la valeur "ROI"
	 */
	public final static int ROI = 13;

	/**
	 * Symbole sur la carte (Roi, dame, valet, as...)
	 */
	private final int symbole;

	/**
	 * Valeur de la carte ( 1 pour As, 2 pour DEUX ...)
	 */
	private final int valeur;

	// FIXME (FIXED) compléter le commentaire
	/**
	 * Instancie un objet de la classe Symbole
	 * 
	 * @param s
	 *            représente le symbole de la carte
	 * @param v
	 *            représente la valeur de la carte
	 */
	public Symbole(int s, int v) throws SymboleInvalideException
	{
		if ((v > 0) && (v < 14))
		{
			this.symbole = s;
			this.valeur = v;
		}
		else
			throw new SymboleInvalideException();
	}

	/**
	 * On retourne la carte si elle existe sinon, c'est que la valeur ne
	 * correspond pas au symbole, on renvoit donc la valeur null.
	 */
	public String toString()
	{
		if ((symbole < 1) || (symbole> 13))
			return "La valeur de ce symbole n'est pas corecte.";
		else
		{
			if ((symbole == 1) && (valeur == AS))
				return "As";
			if ((symbole == 2) && (valeur == DEUX))
				return "Deux";
			if ((symbole == 3) && (valeur == TROIS))
				return "Trois";
			if ((symbole == 4) && (valeur == QUATRE))
				return "Quatre";
			if ((symbole == 5) && (valeur == CINQ))
				return "Cinq";
			if ((symbole == 6) && (valeur == SIX))
				return "Six";
			if ((symbole == 7) && (valeur == SEPT))
				return "Sept";
			if ((symbole == 8) && (valeur == HUIT))
				return "Huit";
			if ((symbole == 9) && (valeur == NEUF))
				return "Neuf";
			if ((symbole == 10) && (valeur == DIX))
				return "Dix";
			if ((symbole == 11) && (valeur == VALET))
				return "Valet";
			if ((symbole == 12) && (valeur == DAME))
				return "Dame";
			if ((symbole == 13) && (valeur == ROI))
				return "Roi";
		}
		return null;
	}

}
