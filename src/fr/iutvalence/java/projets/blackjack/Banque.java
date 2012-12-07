package fr.iutvalence.java.projets.blackjack;

import fr.iutvalence.java.projets.blackjack.Carte;

/**
 * @author Ozdemir Ahmet & Mezgueldi Samih
 * Classe qui créer la banque
 */
public class Banque
{
	
	 /**
	 *
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
	 * Nombre de jetons par défaut.
	 */
	public final static int NBARGENT_DEFAUT = 1000000;
	
	
	/**
	 * Argent que le joueur possède au début de la partie.
	 */
	private int nbArgent;
	
	
	/**
	 * @throws PaquetDeCartesInvalideException
	 */
	public Banque() throws PaquetDeCartesInvalideException
	{

		this.nbCartes = 0;
		this.cartes = new Carte[13];
		this.nbArgent = NBARGENT_DEFAUT;
		this.nbArgentmisé = 0;

    }
	
	/**
	 * Permet de distribuer les cartes à la banque
	 * @param carte
	 */
	public void donnerCarte(final Carte carte)
	{
		this.cartes[this.nbCartes]= carte;
		this.nbCartes++;
	}
	

	
	/**
	 * Permet de connaitre le score que la Banque possède
	 * par rapport aux cartes qu'elle possède
	 * @return score
	 */
	public int scoreBanque()
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
	 * Retourne la quantité de jetons misés par le joueur durant ce tour de mise
	 * 
	 * @return la quantité de jetons misés par le joueur durant ce tour de mise
	 */
	public int getMise() {
		return this.nbArgentmisé;
	}
	
	/**
	 * Retourne le nombre de jetons actuel du joueur
	 * 
	 * @return le nombre de jeton du joueur
	 */
	public int getNbArgent() {
		return this.nbArgent;
	}
	
	
	/**
	 * Retourne les cartes de la banque sous forme de tableau
	 * @return les cartes de la banque sous forme de tableau
	 */
	public Carte[] getCartes() {
		return this.cartes;
	}

}