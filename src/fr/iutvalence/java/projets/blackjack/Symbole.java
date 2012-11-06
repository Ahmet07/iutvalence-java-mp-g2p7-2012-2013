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
	 * Valeur de la carte ( 1 pour As, 2 pour DEUX ...)
	 */
	

	/**
	 * Tableau de caractères comportant le symoble des diffèrentes cartes
	 */
	public final static  String[] NOM_SYMBOLE = {"AS", "2",
	"3", "4", "5", "6", "7", "8", "9", "10", "VALET", "DAME", "ROI" };
	
	private final int symbole;
	
	private final int valeur;
	
	
	public Carte(COULEUR couleur, int symbole) {
		this.couleur = couleur;
		this.symbole = (symbole >= 1 && symbole <= 13 ? symbole : 0);
		this.valeur = this.symbole;
	}

	public Carte(COULEUR couleur, int rang, int valeur) {
		this.couleur = couleur;
		this.symbole = (symbole >= 1 && symbole <= 13 ? symbole : 0);
		this.valeur = valeur;
	}
	
	public COULEUR getCouleur() {
		return this.couleur;
	}

	public int getSymbole() {
		return this.symbole;
	}

	public int getValeur() {
		return this.valeur;
	}

	
	
	
	// FIXME (FIXED) compléter le commentaire
	/**
	 * Instancie un objet de la classe Symbole
	 * 
	 * @param s
	 *            représente le symbole de la carte
	 * @param v
	 *            représente la valeur de la carte
	 */
	public Symbole(char s, int v) throws SymboleInvalideException
	{
		if ((v > 0) && (v < 14))
		{
			this.symbole = s;
			this.valeur = v;
		}
		else
			throw new SymboleInvalideException();
	}
	
	
	
	public String getNomCouleur() {
		switch (this.couleur) {
			case PIQUE:
				return Carte.NOMS_COULEURS[0];
			case COEUR:
				return Carte.NOMS_COULEURS[1];
			case CARREAU:
				return Carte.NOMS_COULEURS[2];
			case TREFLE:
				return Carte.NOMS_COULEURS[3];
		}
		return "<erreur, la couleur de carte n'est pas correct>"; // impossible, mais nécessaire !
	}
	
	

	/**
	 * On retourne la carte si elle existe sinon, c'est que la valeur ne
	 * correspond pas au symbole, on renvoit donc la valeur null.
	 */
	public String getNomSymbole() {
		return Carte.NOM_SYMBOLE[this.symbole];
	}

	public String getNomComplet() {
	    if (getSymbole()==0) return getNomSymbole();
	    else return getNomSymbole() + " de " + getNomCouleur();
	}

}
