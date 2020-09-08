public class Sorcier extends Personnage{
	protected final double pouvoir;

	public Sorcier(String nom){
		this.nom = nom;
		this.pouvoir =Math.random();
	}

	
	public Sorcier(){
		this.pouvoir =Math.random();
	}

	public double getPouvoir(){
		return pouvoir;
	}
	
	public void attaque(Personnage p){
		if(!this.mort()){
		//	System.out.println("OK");
			int retour = p.subitCharme(-(int)Math.floor(this.getVie()*this.pouvoir));
			this.addVie(retour);
		}
	}	

	public int subitFrappe(int coup){
		this.addVie(coup);
		return (-(int)Math.floor(this.getVie()*this.pouvoir));
	}

	public int subitCharme(int coup){
		return 0;
	}
 }
