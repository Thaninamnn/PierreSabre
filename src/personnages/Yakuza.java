package personnages;

public class Yakuza extends Humain {
	int reputation = 0;
	private String clan;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		reputation++;
		int arg = victime.seFaireExtorquer();
		int argent = argent + arg;
		parler(" J’ai piqué les" + arg + " sous de Marco, ce qui me fait" + argent + "sous dans ma poche. Hi ! Hi !");

	}
}
