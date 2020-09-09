public class Monstre extends Personnage{
	public Monstre(String nom){
		super(nom);
	}

	public void attaque(Personnage p){
		if (!this.mort()){	 
			int retour = p.subitFrappe((int)-Math.floor(this.getVie()/2));
			this.addVie(retour);
		}
		
	}

	public int subitFrappe(int coup){
		this.addVie(coup);
		return(-(int)Math.floor(this.getVie()/2));
	}

	public int subitCharme(int coup){
		this.addVie(coup);
		return (-(int)Math.floor(coup/2));
	}
}	
