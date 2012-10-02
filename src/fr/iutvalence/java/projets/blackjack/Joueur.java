package fr.iutvalence.java.projets.blackjack;

/**
 * On crée une classe Joueur avec toutes leurs caractéristiques.
 */
public class Joueur
{   
	/**
	 * Déclaration du nom des joueurs pour distinguer chacun des joueurs.
	 */
	private String nomJoueur;
	
	/**
	 * Nombre de jeton que le joueur possède au début de la partie.
	 */
	private int nbJeton;

	/**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	private MainJoueur CarteDuJoueur;
	
	
	/**
	 * Nombre de jeton que le joueur mise au premier tour.
	 */
	private int mise;
	
	
	public Joueur(String nom)
	{
		this.nomJoueur = nom;
		this.CarteDuJoueur = new MainJoueur(2);
		this.nbJeton = 0;
		this.mise = 0;
	}

}
