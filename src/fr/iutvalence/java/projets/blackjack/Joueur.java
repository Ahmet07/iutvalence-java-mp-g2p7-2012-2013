package fr.iutvalence.java.projets.blackjack;

/**
 * Création de la classe Joueur, avec un nom pour distinguer chaque joueur,
 * un nombre de jetons intial et identique pour tous au début de
 * la partie, ainsi que la main (les deux cartes que chaque joueur
 * possède pour pouvoir jouer). Chaque joueur a aussi la posibilité de miser.
 * 
 * @author Ozdemir Ahmet & Mezgueldi Samih
 */
public class Joueur
{   
	/**
	 * nom identifiant chaque joueur lors d'une partie
	 */
	private String nom;
	
	/**
	 * Argent que le joueur possède au début de la partie.
	 */
	private int nbArgent;

	
	/**
	 * Nombre de jetons par défaut.
	 */
	public final static int NBARGENT_DEFAUT = 200;
	
	 /**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	private Carte[] cartes;

	
	/** Le nombre de cartes actuellement possédées par le joueur */
	private int nbCartes;
	
	/**
	 * Nombre de jetons que le joueur mise au premier tour.
	 */
	private int nbArgentmisé;
	
	
	/**
	 * Booléen permettant de savoir si le joueur a misé tout son argent.
	 */
	private boolean estTapis;
	
	/**
	 * Booléen indiquant si un joueur est couché ou non.
	 */
	private boolean estCouché;
	
	/**
	 * Booléen indiquant si un joueur a perdu ou non la partie.
	 */
	private boolean a_perdu;
	
	
	/**
	 * Instancie un objet de la classe Joueur, de pseudonyme donné
	 * @param nom représente le pseudo du Joueur 
	 * @throws PaquetDeCartesInvalideException 
	 */
	public Joueur(String nom) throws PaquetDeCartesInvalideException
	{

		this.nom = nom;
		this.nbCartes = 0;
		this.cartes = new Carte[13];
		this.nbArgent = NBARGENT_DEFAUT;
		this.nbArgentmisé = 0;
		this.estTapis = false;
		this.a_perdu = false;

	}
	
	
	/**
	 * Permet de distribuer les cartes aux joueurs
	 * @param carte
	 */
	public void donnerCarte(Carte carte)
	{
		this.cartes[this.nbCartes]= carte;
		this.nbCartes++;
	}
	
	/**
	 * Permet de connaitre le score que le joueur possède 
	 * par rapport aux cartes qu'il a dans sa main
	 * @return score
	 */
	public int scoreMain()
	{
		int i = 0;
		int score = 0;
		while (i < this.nbCartes)
		{
			score = score + this.cartes[i].getvaleur();
			i++;
		}
		
		return score;
	}
	
	
	
	/**
	 * Enlève les cartes que le joueur possède actuellement, pour qu'il puisse
	 * en recevoir d'autres au tour suivant
	 * @param p un paquet de carte
	 * @throws PaquetDeCartesInvalideException 
	 */
	public void reinitialiserCartes( PaquetDeCartes p) throws PaquetDeCartesInvalideException {
		this.cartes = new Carte[]{p.tirerUneCarteAuHasard(), p.tirerUneCarteAuHasard()};
		this.nbCartes = 0;
	}
	
	/**
	 * Affiche le nom, le nombre de jeton et les cartes du joueur
	 */
	public String toString() {
		String str = "";
		str += "\n    > " + this.nom + " - Argent : " + this.nbArgent + " - Mise : " + this.nbArgentmisé;
		str += "\n      * Cartes : " + this.cartes[0].toString() + this.cartes[1].toString() + "\n";
		return str;
	}


	
	
	
	/**
	 * Permet à un joueur de miser de l'argent
	 * @param mise : argent que le joueur veut miser.
	 * @return : l'argent misée
	 */

	public int suivre (int mise)
	{
		
		
		if (mise > this.nbArgent)
		{
			
			this.nbArgentmisé += this.nbArgent;
			this.nbArgent = 0;
			this.estTapis = true;
			this.estCouché = false;
			return this.nbArgent;
		}
		else
		{
			
			this.nbArgentmisé += mise;
			this.nbArgent = this.nbArgent - mise;
			return mise;
		}
	}
	
	
// Les fonctions GETs	
	
	/**
	 * Retourne le nom du joueur
	 * 
	 * @return le nom du joueur
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Retourne les cartes du joueur sous forme de tableau
	 * @return les cartes du joueur sous forme de tableau
	 */
	public Carte[] getCartes() {
		return this.cartes;
	}
	
	/**
	 * Retourne le nombre de jetons actuel du joueur
	 * 
	 * @return le nombre de jeton du joueur
	 */
	public int getNbArgent() {
		return this.nbArgent;
	}
	
	/** Retourne le nombre actuel de cartes du joueur 
	 * @return le nombre de cartes du joueur */
	public int getNbCartes() {
		return this.nbCartes;
	}
	
	/**
	 * Retourne la quantité de jetons misés par le joueur durant ce tour de mise
	 * 
	 * @return la quantité de jetons misés par le joueur durant ce tour de mise
	 */
	public int getMise() {
		return this.nbArgentmisé;
	}

	/**
	 * Permet de savoir si un joueur a perdu ou non.
	 * @return : Un booléen indiquant si le joueur a perdu (vrai) ou non (faux).
	 */
	public boolean getTapis()
	{
		return this.estTapis;
	}
	
/**
 * Permet de déclarer un joueur comme perdant.
 * @param b : Un booléen indiquant si le joueur perd ou non.
 */
	public void setPerdu(boolean b)
	{
		this.a_perdu = b;
	}


/**
 * Permet de savoir si un joueur a perdu ou non.
 * @return : Un booléen indiquant si le joueur a perdu (vrai) ou non (faux).
 */
public boolean getPerdu()
{
	return this.a_perdu;
}


/**
 * Permet de se retirer de la manche.
 * @param b : Booléen permettant d'indiquer si un joueur est couché ou non.
 */
public void setCoucher(boolean b)
{
	this.estCouché = b;
}


/**
 * Permet de savoir si un joueur est s'est couché ou non.
 * @return : Un booléen indiquant si le joueur est couché (vrai) ou non (faux).
 */
public boolean getCoucher()
{
	return this.estCouché;
}

}
