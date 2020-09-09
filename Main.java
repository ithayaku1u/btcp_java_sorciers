public class Main{
	public static void main(String[] args){
		String[] nMonstre = {"Shrek", "Frankeinstein", "Dracula", "KingKong", "Yeti"};
		String[] nSorcier = {"Merlin", "MagicienDOZ","Gandalf","Gargamel","Albus"};
		int lenMonstre = 5;
		int lenSorcier = 5;
		int nbGnome = 1;
		int nbNain = 1;
		int totalPersonnage = lenMonstre + lenSorcier + nbGnome + nbNain;

		//On va tirer aléatoirement le nombre de magicien parmis les sorciers
		int lenMagicien = (int)Math.floor(Math.random()*lenSorcier);

		Victime[] tableau = new Victime[totalPersonnage];
		preparation(tableau, nMonstre, nSorcier, lenMagicien, nbGnome, nbNain);
		etat(tableau);

		for(int i=0; i<5; i++){//5 est le nombre de Round
			int attaque = (int)(Math.random()*totalPersonnage);
			int def = (int)(Math.random()*totalPersonnage);
			
			if (attaque == def){
				def = (def+1)%10;
			}
			Victime v_attaq = tableau[attaque];
			Victime v_def = tableau[def];

			if (v_attaq instanceof SuperPouvoir && v_def instanceof SuperPouvoir){
				System.out.println("--->Exces de magie -1 pour ceux sans pouvoir--->");
				//exces de magie tout les personnage basique perdent 1 points de VIE
				for(Victime v : tableau){
					if (v instanceof Sorcier || v instanceof Monstre){
						if (!(v instanceof Magicien)){
							((Personnage) v).addVie(-1);
						}
					}
				}
				etat(tableau);
			}
			if (v_attaq instanceof Personnage && v_def instanceof Personnage){
				System.out.println("---> " +((Personnage) v_attaq).getNom() + " attaque ---> " + ((Personnage) v_def).getNom() );
				((Personnage) v_attaq).attaque(v_def);
				System.out.println(((Personnage) v_attaq).getNom() + " pdv :" + ((Personnage) v_attaq).getVie());
				System.out.println(((Personnage) v_def).getNom() + " pdv : " + ((Personnage) v_def).getVie());
			}
			else if (v_attaq instanceof Personnage){
				System.out.println("---> " +((Personnage) v_attaq).getNom() + " attaque ---> " + v_def);
				((Personnage) v_attaq).attaque(v_def);
				System.out.println(((Personnage) v_attaq).getNom() + " pdv : " + ((Personnage) v_attaq).getVie());
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

		}
		System.out.println("FIN DE PARTIE : ");
		etat(tableau);
		/*
		Magicien M0 = new Magicien();
		Sorcier S0 = new Sorcier();
		M0.addVie(100);
		S0.addVie(100);
		S0.attaque(M0);

		System.out.println(M0.getVie());
		System.out.println(S0.getVie());
		System.out.println(S0.getPouvoir());
		*/
	}
	
		

	public static void etat(Victime[] tableau){
		for(Victime p : tableau){
			System.out.println(p);
		}
	}

	public static void preparation(Victime[] tableau, String[] nMonstre, String[] nSorcier, int lenMagicien, int nbGnome, int nbNain){
		int i = 0;
		for (String s : nSorcier){
			if (i < lenMagicien) {
				tableau[i] = new Magicien(s);
			}
			else {
				tableau[i] = new Sorcier(s);
			}
			((Personnage)tableau[i]).addVie((int) Math.floor(Math.random() * 100));
			i = i+1;
		}
			
		for (String m : nMonstre){
			tableau[i] = new Monstre(m);
			((Personnage)tableau[i]).addVie((int)Math.floor(Math.random()*100));
			i = i+1;
		}

		for(int j = i; j < i + nbNain; j++) {
			tableau[j] = new NainJardin((int)Math.floor(Math.random()*100));
		}
		for(int j = i + nbNain; j< i+nbNain+nbGnome; j++){
			tableau[j] = new GnomeJardin((int)Math.floor(Math.random()*100));
		}
		
		
	}
		/*
		Sorcier s = new Sorcier("S");
		Personnage m = new Monstre();
		s.addVie(10000);
		m.addVie(10000);
		System.out.println(s);
		System.out.println(m);
	
		s.attaque(m);
		System.out.println(s.getPouvoir());
		System.out.println(s);
		System.out.println(m);
		System.out.println(s.mort());
		
		m.attaque(s);
		System.out.println(s);
		System.out.println(m);


		m.attaque(m);
		System.out.println(m);
		*/


}
