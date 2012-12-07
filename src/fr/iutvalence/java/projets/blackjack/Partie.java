package fr.iutvalence.java.projets.blackjack;
import java.util.Scanner;
import fr.iutvalence.java.projets.blackjack.PaquetDeCartes;
import fr.iutvalence.java.projets.blackjack.Joueur;

/**
 *La classe Partie va contenir
 *toutes les caractéristiques d'une partie
 * @author Ozdemir Ahmet & Mezgueldi Samih
 *
 */
public class Partie
{
	/**
	 * Nombre de joueurs minimum pour débuter une partie.
	 */
	private final static int NB_JOUEURS_MIN = 1;


	/**
	 * Nombre de joueurs maximum dans la partie.
	 */
	private final static int NB_JOUEURS_MAX = 6;



	/**
	 * Les joueurs de la partie seront stocké dans un tableau de joueurs.
	 */
	private Joueur[] joueur;


	/**
	 * Nombre de joueurs présents dans la partie
	 */
	private int nbJoueurs;


	/**
	 * début de la partie, on initialise le tabluea de joueur pour y mettre des joueurs
	 */
	public Partie ()
	{
		this.joueur = new Joueur[NB_JOUEURS_MAX];
		this.nbJoueurs = 0;

	}


	/**
	 * Permet d'ajouter un joueur
	 * @param j : Le nom du joueur à rajouter dans la partie.
	 * @throws NbDeJoueursException : Nombre max de joueurs atteint.
	 */
	public void addJoueur (Joueur j) throws NbDeJoueursException
	{
		if (this.nbJoueurs > NB_JOUEURS_MAX)
			throw new NbDeJoueursException();

		this.joueur[this.nbJoueurs] = j;
		this.nbJoueurs++;

	}




	/**
	 * Permet de démarrer la partie de poker.
	 * @throws NbDeJoueursException : Nb de joueurs insuffisant ou trop élevé.
	 * @throws PlusDeCarteException :  
	 * @throws PaquetDeCartesInvalideException 
	 */
	public void demarrer() throws NbDeJoueursException, PlusDeCarteException, PaquetDeCartesInvalideException
	{
		if ((this.nbJoueurs < NB_JOUEURS_MIN) || (this.nbJoueurs > NB_JOUEURS_MAX))
			throw new NbDeJoueursException();

		int nbPerdants = 0;

		PaquetDeCartes p = new PaquetDeCartes();

		while (nbPerdants != (this.nbJoueurs- 1))
		{
			for (int i = 0; i < this.nbJoueurs; i++)
			{
				if (this.joueur[i].getPerdu() == false)
				{
					this.joueur[i].donnerCarte(p.tirerUneCarteAuHasard());
					this.joueur[i].donnerCarte(p.tirerUneCarteAuHasard());
					System.out.println(this.joueur[0].getNom() + " possède les cartes :\n" +
							this.joueur[0].getCartes()[0] + "\n" +
							this.joueur[0].getCartes()[1]+ "\n"
							+ " valeur total des cartes: "+
							this.joueur[0].scoreMain()+ "\n" +
							" argent disponible: " +
							this.joueur[0].getNbArgent()+ "\n");
				}
			}


			while ( nbPerdants < this.nbJoueurs)
			{

				for (int i = 0; i < this.nbJoueurs; i++)
				{
					if (this.joueur[i].getPerdu() == false)
						// Cas ou le joueur n'a pas encore perdu.
					{
						if (this.joueur[i].getNbArgent() == 0)
							// Cas ou le joueur n'a plus d'argent.
						{
							this.joueur[i].setPerdu(true);
							nbPerdants++;
						}
					}
				}

				p.reinitialiserPaquet();

			}
		}
	}




	/**
	 * Correspond à un tour de mise au poker.
	 */
	public void tourDeMise()
	{
		int plusGrosseMise = 50;



		for (int j = 0; j < this.nbJoueurs; j++)

		{
			if (this.joueur[j].getPerdu() == false)

			{
				if (this.joueur[j].getMise() != plusGrosseMise)
				{

					Scanner sc = new Scanner(System.in);
					System.out.println("Il vous reste " + this.joueur[j].getNbArgent() + " argent.");
					System.out.println(this.joueur[j].getNom() +", quelle action voulez vous réaliser ?\n" +
							"	1 - Miser " + (plusGrosseMise - this.joueur[j].getMise()) +
							"	2 - Coucher");
					int rep = sc.nextInt();

					while (rep != 1 & rep != 2)
					{
						rep = sc.nextInt();
					}

					int argentEnJeu = 0;

					if (rep == 2)
					{
						argentEnJeu = this.joueur[j].suivre(plusGrosseMise - this.joueur[j].getNbArgent());
					}


					if (rep == 2)
					{
						this.joueur[j].setCoucher(true);
					}
					System.out.println("Le joueur s'est couché \n");

				}
			}
		}
	}
}



