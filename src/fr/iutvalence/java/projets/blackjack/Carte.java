package fr.iutvalence.java.projets.blackjack;

public class Carte
{
	public final static int CARREAU = 1;
	public final static int COEUR = 2;
	public final static int PIQUE = 3;
	public final static int TREFLE = 4;
	
	public final static int AS = 1;
	public final static int DEUX = 2;
	public final static int TROIS = 3;
	public final static int QUATRE = 4;
	public final static int CINQ = 5;
	public final static int SIX = 6;
	public final static int SEPT = 7;
	public final static int HUIT = 8;
	public final static int NEUF = 9;
	public final static int DIX = 10;
	public final static int VALET = 11;
	public final static int DAME = 12;
	public final static int ROI = 13;
	
	
	private int couleur;
	private int valeur;
	private int symbole;
	
	public Carte(int c, int s, int v){

		this.couleur = c;
		this.symbole = s;				
		this.valeur  = v;
	}
	
	public String toString()
	{
		String s = "Carte de couleur "+ this.couleur;
		s += "et de valeur " + this.symbole;
		return s;
	}
	
}
