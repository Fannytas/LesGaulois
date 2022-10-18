package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler( " Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le druide" + nom + " : ";
	}
	
	public  void preparerPotion() {
		Random object = new Random();
		int force = object.nextInt(effetPotionMax);
		while (force < effetPotionMin) {
			force = object.nextInt(effetPotionMax);
			
		}
		if (force > 7) {
			parler("J'ai pr�par� une super potion de force " + force);
		} else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est\r\n" + 
					"seulement de force " + force);

		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Ob�lix") {
			parler("Non, Ob�lix !... Tu n�auras pas de potion\r\n" + 
					"magique ! ");
		} else {
			gaulois.boirePotion(forcePotion);
		}
		
		
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
	
}
