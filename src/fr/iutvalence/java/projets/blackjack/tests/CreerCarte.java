

package fr.iutvalence.java.projets.blackjack.tests;

import fr.iutvalence.java.projets.blackjack.Joueur;
import fr.iutvalence.java.projets.blackjack.Banque;
import fr.iutvalence.java.projets.blackjack.PaquetDeCartes;
import fr.iutvalence.java.projets.blackjack.PaquetDeCartesInvalideException;

/**
 * Test qui permet de créer une carte demandée
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class CreerCarte
{
		/**On affiche la carte sous forme d'une chaine de caractères
		 * ici, on obtient "Carte de couleur Coeur et de symbole Valet"
		 * @param args
		 * @throws PaquetDeCartesInvalideException 
		 */
		public static void main (String[] args) throws PaquetDeCartesInvalideException
		{
			Joueur[] js = new Joueur[]{new Joueur("jean"), new Joueur("paul")};
			Banque b = new Banque();
			


			PaquetDeCartes p = new PaquetDeCartes();

			js[0].donnerCarte(p.tirerUneCarteAuHasard());
			js[0].donnerCarte(p.tirerUneCarteAuHasard());
			js[1].donnerCarte(p.tirerUneCarteAuHasard());
			js[1].donnerCarte(p.tirerUneCarteAuHasard());
			b.donnerCarte(p.tirerUneCarteAuHasard());
			b.donnerCarte(p.tirerUneCarteAuHasard());
			
			
			System.out.println(js[0].getNom() + " possède les cartes :\n" +
												js[0].getCartes()[0] + "\n" +
												js[0].getCartes()[1]+ "\n"
												+ " valeur total des cartes: "+
												js[0].scoreMain()+ "\n" +
												" argent disponible: " +
												js[0].getNbArgent()+ "\n");
			
			
			System.out.println(js[1].getNom() + " possède les cartes :\n" +
											  js[1].getCartes()[0] + "\n" +
					                          js[1].getCartes()[1] + "\n"
					                          + " valeur total des cartes: "+
					                          js[1].scoreMain()+ "\n"+
											  " argent disponible: " +
											  js[1].getNbArgent()+ "\n");
			
			System.out.println("La banque possède les cartes :\n" +
					b.getCartes()[0] + "\n" +
					b.getCartes()[1]+ "\n"
					+ " valeur total des cartes: "+
					b.scoreBanque()+ "\n");
		
		}

}
