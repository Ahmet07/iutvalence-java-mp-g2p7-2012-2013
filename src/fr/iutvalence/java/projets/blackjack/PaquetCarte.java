package fr.iutvalence.java.projets.blackjack;

import java.util.Random;

// FIXME (FIXED) renommer la classe
public class PaquetCarte
{
	/**
	 * Tableau de cartes, composé au maximum de 52 cartes
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	private Carte[] paquet;
	
	/**
	 * Nombre de cartes actuellement dans le paquet
	 */
	//
	// FIXME (FIXED) renommer l'attribut
	private int cartesPaquet;
	
	/**
	 *Permet de choisir des cartes aléatoirement
	 * afin de distribuer la main de chaque joueur en debut de partie
	 */
	private static Random aleatoire = new Random(System.currentTimeMillis());
	
	
	/**
	 * Initialisation d'un paquet de 52 cartes
	 */
	public PaquetCarte()
	{
		int i=0,c,v;
		this.paquet = new carte[52];
		this.cartesPaquet = 52;
		for(c=1;c<=4;c++)
		{
			for(v=1;v<=13;v++)
			{
				paquet[i++] = new carte(v,c);			
			}
		}
	}
	
	
	/**
	 * Retourne le nombre de cartes restant dans le paquet
	 * @return le nombre de cartes restant dans le paquet
	 */
	// FIXME (FIXED) renommer la méthode
	public int cartesRestantesPaquet() {
		return cartesPaquet;
	}
	
	
	
	
}
