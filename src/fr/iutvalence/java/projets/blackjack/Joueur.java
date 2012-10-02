package fr.iutvalence.java.projets.blackjack;

public class Joueur
{   
	private string Nom;
	
	
	
	/**
	 * Nombre de jeton que le joueur possède au début de la partie.
	 */
	private int NbJeton;

	/**
	 * Les deux cartes qui composent la main du joueur, différentes à chaque tour.
	 */
	private MainJoueur cartes_du_Joueur;
	
	
	/**
	 * Nombre de jeton que le joueur mise au premier tour.
	 */
	private int mise;
	
	
	public Joueur(String nom)
	{
		this.nom = nom;
		this.cartes_du_Joueur = new MainJoueur(2);
		this.NbJeton = 0;
		this.mise = 0;
	}

}
