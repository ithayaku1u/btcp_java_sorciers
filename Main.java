public class Main{
	private static int combattantS = 5;
	private static int combattantM = 5;
	private static int combattantT = combattantS + combattantM;

	public static void main(String[] args){
		Personnage[] tableau = new Personnage[combattantT];
		preparation(tableau);
		etat(tableau);

		for(int i=0; i<5; i++){//5 est le nombre de Round
			int attaque = (int)(Math.random()*combattantT);
			int def = (int)(Math.random()*combattantT);
			
			if (attaque == def){
	
				def = (def+1)%10;
			}

			tableau[attaque].attaque(tableau[def]);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			etat(tableau);
		}
		Magicien M0 = new Magicien();
		Sorcier S0 = new Sorcier();
		M0.addVie(100);
		S0.addVie(100);
		S0.attaque(M0);

		System.out.println(M0.getVie());
		System.out.println(S0.getVie());
		System.out.println(S0.getPouvoir());
	}
	
		

	public static void etat(Personnage[] tableau){
		for(Personnage p : tableau){
			System.out.println(p);
		}
	}

	public static void preparation(Personnage[] tableau){
		for (int i=0; i<combattantS;i++){
			tableau[i] = new Sorcier();
			tableau[i].addVie((int)Math.floor(Math.random()*100));
		}
			
		for (int i=combattantM; i<combattantT;i++){
			tableau[i] = new Monstre();
			tableau[i].addVie((int)Math.floor(Math.random()*100));
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
