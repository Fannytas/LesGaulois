package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 � 10.");
		panoramix.parler( "Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Obelix", 10);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU ... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
