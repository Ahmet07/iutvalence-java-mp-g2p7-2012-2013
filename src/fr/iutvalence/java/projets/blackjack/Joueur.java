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
	// FIXME (FIXED) cela ne peut pas être une constante
	private String nomJoueur;
	
	/**
	 * Nombre de jetons que le joueur possède au début de la partie.
	 */
	private int nbJetons;

	/**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	private MainJoueur cartesJoueur;
	
	
	/**
	 * Nombre de jetons que le joueur mise au premier tour.
	 */
	private int mise;
	
	// FIXME (FIXED) corriger le commentaire (à discuter)
	/**
	 * Instancie un objet de la classe Joueur
	 * @param nom représente le pseudo du Joueur 
	 */
	public Joueur(String nom)
	{
		this.nomJoueur = nom;
		this.cartesJoueur = new MainJoueur();
		this.nbJetons = 200;
		this.mise = 0;
	}

}
