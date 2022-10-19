package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] inventaire = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert(force>=0);
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int forceAvant = force;
		force -= forceCoup;
		int forceApres = force;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert(forceAvant > forceApres);
	}
	
	private void mets(Equipement equipement) {
		inventaire[nbEquipement] = equipement;
		nbEquipement ++;
		System.out.println(" Le soldat " + getNom() + " s’équipe avec un " + equipement + " !");
	}
	
	private void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
			case 2 :
				System.out.println(" Le soldat " + getNom() + " est déjà bien protégé !");
				break;
			case 1 : 
				if (inventaire[0] == equipement)
				{
					System.out.println(" Le soldat " + getNom() + " possède déja un " + equipement + " !");
					break;
				}
				else {
					mets(equipement);
					break;
				}
			default : 
				mets(equipement);
				break;
			}
		}

	public static void main(String[] args) {
		Romain cesar = new Romain("Cesar", 6);
		System.out.println(cesar.prendreParole());
		cesar.parler("Bonjour");
		cesar.recevoirCoup(8);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
	}
}
