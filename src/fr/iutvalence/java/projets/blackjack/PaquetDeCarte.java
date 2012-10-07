package fr.iutvalence.java.projets.blackjack;

import java.util.Random;

// FIXME renommer la classe
public class PaquetDeCarte
{
	/**
	 * Tableau de cartes, composé au maximum de 52 cartes
	 */
	// FIXME respecter les conventions d'écriture
	private Carte[] Paquet;
	
	/**
	 * Nombre de cartes actuellement dans le paquet
	 */
	//
	// FIXME respecter les conventions d'écriture
	private int Nb_carte_du_Paquet;
	
	// FIXME corriger le commentaire
	/**
	 * Choisi les cartes aléatoirement
	 */
	private static Random aleatoire = new Random(System.currentTimeMillis());
	
	
	/**
	 * Initialisation d'un paquet de 52 cartes
	 */
	// FIXME définir un "vrai" constructeur
	public Nouveau_Paquet_52()
	{
		int i=0,c,v;
		this.Paquet = new Carte[52];
		this.Nb_carte_du_Paquet = 52;
		for(c=1;c<=4;c++)
		{
			for(v=1;v<=13;v++)
			{
				Paquet[i++] = new Carte(v,c);			
			}
		}
	}
	
	
	/**
	 * Retourne le nombre de cartes restant dans le paquet
	 * @return le nombre de cartes restant dans le paquet
	 */
	// FIXME respecter les conventions d'écriture
	public int Nb_carte_RESTANTES_du_Paquet() {
		return Nb_carte_du_Paquet;
	}
	
	
	
	
}
