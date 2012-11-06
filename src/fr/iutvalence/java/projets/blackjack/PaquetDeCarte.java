package fr.iutvalence.java.projets.blackjack;

import java.util.Random;

// FIXME (FIXED) renommer la classe
public class PaquetDeCarte
{
	/**
	 * Tableau de cartes, composé au maximum de 52 cartes
	 */
	private Carte[] paquet;
	
	/**
	 * Nombre de cartes actuellement dans le paquet
	 */
	//
	// FIXME (FIXED) renommer l'attribut
	private int cartesRestantesDuPaquet;
	
	/**
	 * Permet de choisir des cartes aléatoirement
	 * afin de distribuer la main de chaque joueur en debut de partie
	 */
	private static Random aleatoire = new Random(System.currentTimeMillis());
	
	
	/**
	 * Initialisation d'un paquet de 52 cartes
	 */
	public PaquetDeCarte()
	{
		int i=0,c,v;
		this.paquet = new Carte[52];
		this.cartesRestantesDuPaquet = 52;
		for(c=1;c<=4;c++)
		{
			for(v=1;v<=13;v++)
			{
				if(v=1)
				{
					s = AS;
				}
				if(v=11)
				{
					s = VALET;
				}
				if(v=12)
				{
					s = DAME;
				}
				if(v=13)
				{
					s = ROI;
				}
				paquet[i] = new Carte(v,c);
				i++;
			}
		}
	}
	
	
	/**
	 * Retourne le nombre de cartes restant dans le paquet
	 * @return le nombre de cartes restant dans le paquet
	 */
	public int getCartesRestantesPaquet() 
	{
		return cartesRestantesDuPaquet;
	}
}