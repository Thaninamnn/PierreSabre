package personnages;

public class Yakuzza extends Humaiin {
	
		int reputation = 0;
		private String clan;

		public Yakuzza(String nom, String boissonFav, int argent, String clan) {
			super(nom, boissonFav, argent);
			this.clan = clan;
		}

		public void extorquer(Commercantt victime) {
			reputation++;
			int arg = victime.seFaireExtorquer();
			int argent = argent + arg;
			parler(" J’ai piqué les" + arg + " sous de Marco, ce qui me fait" + argent + "sous dans ma poche. Hi ! Hi !");

		}
	}

