public class Main{
	public static void main(String[] args){
		String[] nMonstre = {"Shrek", "Frankeinstein", "Dracula", "KinkKong", "Yeti"};
		String[] nSorcier = {"Merlin", "MagicienDOZ","Gandalf","Gargamel","Albus"};
		int lenMonstre = 5;
		int lenSorcier = 5;
		int totalPersonnage = lenMonstre + lenSorcier;

		Personnage[] tableau = new Personnage[totalPersonnage];
		preparation(tableau, nMonstre, nSorcier);
		etat(tableau);

		for(int i=0; i<5; i++){//5 est le nombre de Round
			int attaque = (int)(Math.random()*totalPersonnage);
			int def = (int)(Math.random()*totalPersonnage);
			
			if (attaque == def){
	
				def = (def+1)%10;
			}
			tableau[attaque].attaque(tableau[def]);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			etat(tableau);
		}
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
	
		

	public static void etat(Personnage[] tableau){
		for(Personnage p : tableau){
			System.out.println(p);
		}
	}

	public static void preparation(Personnage[] tableau, String[] nMonstre, String[] nSorcier){
		int i = 0;
		for (String s : nSorcier){
			tableau[i] = new Sorcier(s);
			tableau[i].addVie((int)Math.floor(Math.random()*100));
			i = i+1;
		}
			
		for (String m : nMonstre){
			tableau[i] = new Monstre(m);
			tableau[i].addVie((int)Math.floor(Math.random()*100));
			i = i+1;
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
