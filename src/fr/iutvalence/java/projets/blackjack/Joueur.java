package fr.iutvalence.java.projets.blackjack;

/**
 * Création de la classe Joueur, avec un nom pour distinguer chaque joueur,
 * un nombre de jetons intial et identique pour tous au début de
 * la partie, ainsi que la main (les deux cartes que chaque joueur
 * possède pour pouvoir jouer). Chaque joueur a aussi la posibilité de miser.
 */
public class Joueur
{   
	// FIXME (FIXED) corriger le commentaire
	/**
	 * Déclaration d'un unique nom pour identifier chaque joueur lors d'une partie
	 */
	// FIXME (FIXED) réfléchir à l'utilisation du mot-clé static (à discuter)
	private final static String nomJoueur;
	
	/**
	 * Nombre de jetons que le joueur possède au début de la partie.
	 */
	//FIXME (FIXED) renommer l'attribut
	private int nbJetons;

	/**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	// FIXME (FIXED) renommer l'attribut
	private MainJoueur CartesJoueur;
	
	
	/**
	 * Nombre de jetons que le joueur mise au premier tour.
	 */
	private int mise;
	
	// FIXME (FIXED) écrire un commentaire
	/**
	 * Un joueur est caractérisé par son nom, sa main, ses jetons et sa mise
	 */
	public Joueur(String nom)
	{
		this.nomJoueur = nom;
		this.CartesJoueur = new MainJoueur();
		this.nbJetons = 0;
		this.mise = 0;
	}

}
