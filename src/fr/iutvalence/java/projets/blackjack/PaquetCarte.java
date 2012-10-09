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
	// FIXME (FIXED) respecter les conventions d'écriture
	private int nbCartePaquet;
	
	// FIXME (FIXED) corriger le commentaire
	/**
	 * La variable "aléatoire" permet de choisir des cartes aléatoirement
	 * afin de distribuer la main de chaque joueur en debut de partie
	 */
	private static Random aleatoire = new Random(System.currentTimeMillis());
	
	
	/**
	 * Initialisation d'un paquet de 52 cartes
	 */
	// FIXME (FIXED) définir un "vrai" constructeur
	public PaquetCarte()
	{
		int i=0,c,v;
		this.paquet = new Carte[52];
		this.nbCartePaquet = 52;
		for(c=1;c<=4;c++)
		{
			for(v=1;v<=13;v++)
			{
				paquet[i++] = new Carte(v,c);			
			}
		}
	}
	
	
	/**
	 * Retourne le nombre de cartes restant dans le paquet
	 * @return le nombre de cartes restant dans le paquet
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	public int nbCarteRestantesPaquet() {
		return nbCartePaquet;
	}
	
	
	
	
}
