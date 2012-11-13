package fr.iutvalence.java.projets.blackjack;

import java.util.Random;
import fr.iutvalence.java.projets.blackjack.PaquetDeCartes;

/**
 *La classe Partie va contenir
 *toutes les caractéristiques d'une partie
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Partie
{
    
	private PaquetDeCartes pioche;
	
	private static Random aleatoire = new Random(System.currentTimeMillis());
	
	// FIXME attributs, constructeurs, méthodes ?
	
	
	/**
	 * Retourne la carte du dessus du paquet de carte en la
	 * supprimant de celui-ci. Si le paquet de carte est vide retourne
	 * null.
	 * @param enleverLaCarte Faut-il extraire la carte du paquet de carte ?
	 * @return La carte du dessus du paquet de carte ou null si celui-ci
	 *         est vide
	 */
	public Carte tirerUneCarteDuPaquet() {
		if (this.pioche.getCartesRestantesPaquet() > 0) {
			Carte carte = (enleverLaCarte ? this.pioche.remove(this.pioche - 1)
						                  : this.pioche.get(this.pioche - 1));
			return carte;
		}
		else {
			return null;
		}
	}
	

}
