// FIXME déplacer dans un autre paquetage

package fr.iutvalence.java.projets.blackjack;


// FIXME compléter le commentaire
/**
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class CreerCarte
{
		// FIXME compléter le commentaire
		/**
		 * @param args
		 */
		public static void main (String[] args){
			
			Carte c = new Carte(Carte.TREFLE, Carte.VALET, 11);
			System.out.println(c.toString());
		} 				
}
