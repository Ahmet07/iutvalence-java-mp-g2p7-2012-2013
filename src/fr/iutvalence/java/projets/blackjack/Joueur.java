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
	// FIXME réfléchir à l'utilisation du mot-clé static (à discuter)
	private static String nomJoueur;
	
	/**
	 * Nombre de jetons que le joueur possède au début de la partie.
	 */
	//FIXME renommer l'attribut
	private int nbJeton;

	/**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	// FIXME renommer l'attribut
	private MainJoueur CarteDuJoueur;
	
	
	/**
	 * Nombre de jetons que le joueur mise au premier tour.
	 */
	private int mise;
	
	// FIXME écrire un commentaire
	public Joueur(String nom)
	{
		this.nomJoueur = nom;
		this.CarteDuJoueur = new MainJoueur(2);
		this.nbJeton = 0;
		this.mise = 0;
	}

}
