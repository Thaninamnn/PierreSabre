package histoire;
import personnages.Humaiin;
import personnages.Commercantt;
public class histoiretp44 {
	

	



		public static void main(String[] args) {

			Humaiin prof = new Humaiin("Prof", "kombucha", 54);
			Commercantt marco = new Commercantt("Marco", 20);
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


