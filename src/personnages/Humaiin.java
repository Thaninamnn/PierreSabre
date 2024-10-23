package personnages;

public class Humaiin {


	

	
		private String nom;
		private String boissonFav;
		private int argent;

		public Humaiin(String nom, String boissonFav, int argent) {

			this.nom = nom;
			this.boissonFav = boissonFav;
			this.argent = argent;
		}

		public String getNom() {
			return nom;
		}

		public int getArgent() {
			return argent;

		}

		public void direBonjour() {
			parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFav + ".");
		}

		public void boire() {
			parler("Mmmm, un bon verre de " + boissonFav + "! GLOUPS !");
		}

		public void parler(String texte) {
			System.out.println(nom + ": " + texte);
		}

		public void gagnerArgent(int gain) {
			argent = argent + gain;
		}

		public void perdreArgent(int perte) {
			argent = argent - perte;
		}

		public void acheter(String bien, int prix) {
			if (argent >= prix) {
				parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix
						+ " sous.");
			} else {
				parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à "
						+ prix + " sous.");
			}
		}

	}

