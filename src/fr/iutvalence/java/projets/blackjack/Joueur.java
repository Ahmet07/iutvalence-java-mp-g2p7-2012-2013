package fr.iutvalence.java.projets.blackjack;

// FIXME corriger le commentaire
/**
 * On crée une classe Joueur avec toutes leurs caractéristiques.
 */
public class Joueur
{   
	// FIXME corriger le commentaire
	/**
	 * Déclaration du nom des joueurs pour distinguer chacun des joueurs.
	 */
	// FIXME le nom du joueur change t'il en cours de partie ?
	private String nomJoueur;
	
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
