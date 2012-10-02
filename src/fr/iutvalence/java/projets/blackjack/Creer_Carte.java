package fr.iutvalence.java.projets.blackjack;

/**
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Creer_Carte
{


		/**
		 * @param args
		 */
		public static void main (String[] args){
			
			Carte c = new Carte(Carte.TREFLE, Carte.CINQ, 5);
			System.out.println(c.toString());
		} 				


}
