package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {

		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", 20);
		prof.direBonjour();

		prof.acheter("boisson", 12);
		prof.perdreArgent(12);

		prof.boire();

		prof.acheter("jeu", 2);
		prof.perdreArgent(2);

		prof.acheter("kimono", 50);

		marco.direBonjour();

		marco.seFaireExtorquer();

		marco.recevoir(15);

		marco.boire();

	}
}