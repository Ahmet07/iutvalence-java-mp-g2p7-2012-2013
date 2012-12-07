package fr.iutvalence.java.projets.blackjack;

import java.util.Random;

/**
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class PaquetDeCartes
{

	
	/**
	 * Tableau de cartes, composé au maximum de 52 cartes
	 */
	private Carte[] paquet;

	/**
	 * Nombre de cartes actuellement dans le paquet
	 */
	private int cartesRestantes;

	/**
	 * Permet de choisir des cartes aléatoirement afin de distribuer la main de
	 * chaque joueur en debut de partie
	 */
	private static Random aleatoire = new Random(System.currentTimeMillis());

	/**
	 * Initialisation d'un paquet de 52 cartes
	 */
	public PaquetDeCartes()
	{
		this.paquet = new Carte[] { new Carte(Couleur.CARREAU, Symbole.AS), new Carte(Couleur.CARREAU, Symbole.DEUX),
				new Carte(Couleur.CARREAU, Symbole.TROIS), new Carte(Couleur.CARREAU, Symbole.QUATRE),
				new Carte(Couleur.CARREAU, Symbole.CINQ), new Carte(Couleur.CARREAU, Symbole.SIX),
				new Carte(Couleur.CARREAU, Symbole.SEPT), new Carte(Couleur.CARREAU, Symbole.HUIT),
				new Carte(Couleur.CARREAU, Symbole.NEUF), new Carte(Couleur.CARREAU, Symbole.DIX),
				new Carte(Couleur.CARREAU, Symbole.VALET), new Carte(Couleur.CARREAU, Symbole.DAME),
				new Carte(Couleur.CARREAU, Symbole.ROI), new Carte(Couleur.COEUR, Symbole.AS),
				new Carte(Couleur.COEUR, Symbole.DEUX), new Carte(Couleur.COEUR, Symbole.TROIS),
				new Carte(Couleur.COEUR, Symbole.QUATRE), new Carte(Couleur.COEUR, Symbole.CINQ),
				new Carte(Couleur.COEUR, Symbole.SIX), new Carte(Couleur.COEUR, Symbole.SEPT),
				new Carte(Couleur.COEUR, Symbole.HUIT), new Carte(Couleur.COEUR, Symbole.NEUF),
				new Carte(Couleur.COEUR, Symbole.DIX), new Carte(Couleur.COEUR, Symbole.VALET),
				new Carte(Couleur.COEUR, Symbole.DAME), new Carte(Couleur.COEUR, Symbole.ROI),
				new Carte(Couleur.PIQUE, Symbole.AS), new Carte(Couleur.PIQUE, Symbole.DEUX),
				new Carte(Couleur.PIQUE, Symbole.TROIS), new Carte(Couleur.PIQUE, Symbole.QUATRE),
				new Carte(Couleur.PIQUE, Symbole.CINQ), new Carte(Couleur.PIQUE, Symbole.SIX),
				new Carte(Couleur.PIQUE, Symbole.SEPT), new Carte(Couleur.PIQUE, Symbole.HUIT),
				new Carte(Couleur.PIQUE, Symbole.NEUF), new Carte(Couleur.PIQUE, Symbole.DIX),
				new Carte(Couleur.PIQUE, Symbole.VALET), new Carte(Couleur.PIQUE, Symbole.DAME),
				new Carte(Couleur.PIQUE, Symbole.ROI), new Carte(Couleur.TREFLE, Symbole.AS),
				new Carte(Couleur.TREFLE, Symbole.DEUX), new Carte(Couleur.TREFLE, Symbole.TROIS),
				new Carte(Couleur.TREFLE, Symbole.QUATRE), new Carte(Couleur.TREFLE, Symbole.CINQ),
				new Carte(Couleur.TREFLE, Symbole.SIX), new Carte(Couleur.TREFLE, Symbole.SEPT),
				new Carte(Couleur.TREFLE, Symbole.HUIT), new Carte(Couleur.TREFLE, Symbole.NEUF),
				new Carte(Couleur.TREFLE, Symbole.DIX), new Carte(Couleur.TREFLE, Symbole.VALET),
				new Carte(Couleur.TREFLE, Symbole.DAME), new Carte(Couleur.TREFLE, Symbole.ROI) };
		this.cartesRestantes = 52;
	}



	/**
	 * Fonction permettant de retouner une carte au hasard
	 * 
	 * @return une carte aléatoire du paquet de cartes
	 * @throws PaquetDeCartesInvalideException
	 */
	public Carte tirerUneCarteAuHasard() throws PaquetDeCartesInvalideException
	{
		int nbAlea = aleatoire.nextInt(this.cartesRestantes);
		Carte aRet;

		if (this.cartesRestantes == 0)
		{
			throw new PaquetDeCartesInvalideException();
		}

		while (this.paquet[nbAlea] == null)
		{
			nbAlea = aleatoire.nextInt(this.cartesRestantes);
		}
		aRet = this.paquet[nbAlea];
		this.paquet[nbAlea] = null;

		return aRet;

	}
	
		
	// Fonctions Gets
	
	/**
	 * Retourne le nombre de cartes restant dans le paquet
	 * 
	 * @return le nombre de cartes restant dans le paquet
	 */
	public int getCartesRestantesPaquet()
	{
		return this.cartesRestantes;
	}
	
	
	
	/**
	 * Réinitialisation du paquet.
	 */
	public void reinitialiserPaquet()
	{
		this.cartesRestantes = 52;
	}

	
}
