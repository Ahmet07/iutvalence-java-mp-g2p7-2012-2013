// FIXME (FIXED) déplacer dans un autre paquetage

package fr.iutvalence.java.projets.blackjack.tests;

import fr.iutvalence.java.projets.blackjack.Carte;
import fr.iutvalence.java.projets.blackjack.Couleur;
import fr.iutvalence.java.projets.blackjack.Symbole;

/**
 * Test qui permet de créer une carte demandée
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class CreerCarte
{
		/**On affiche la carte sous forme d'une chaine de caractères
		 * ici, on obtient "Carte de couleur Trèfle et de symbole Valet"
		 * @param args
		 */
		public static void main (String[] args)
		{
			Carte c = new Carte( , , 11);
			System.out.println(c);
		}
}
