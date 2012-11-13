package fr.iutvalence.java.projets.blackjack;

/**
 * Création de la classe Joueur, avec un nom pour distinguer chaque joueur,
 * un nombre de jetons intial et identique pour tous au début de
 * la partie, ainsi que la main (les deux cartes que chaque joueur
 * possède pour pouvoir jouer). Chaque joueur a aussi la posibilité de miser.
 */
public class Joueur
{   
	/**
	 * nom identifiant chaque joueur lors d'une partie
	 */
	private String nom;
	
	/**
	 * Nombre de jetons que le joueur possède au début de la partie.
	 */
	private int nbJetons;

	/**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	private MainJoueur cartes;
	
	
	/**
	 * Nombre de jetons que le joueur mise au premier tour.
	 */
	private int mise;
	
	/**
	 * Instancie un objet de la classe Joueur, de pseudonyme donné
	 * @param nom représente le pseudo du Joueur 
	 */
	public Joueur(String nom)
	{
		this.nom = nom;
		this.cartes = new MainJoueur();
		this.nbJetons = 200;
		this.mise = 0;
	}

}
