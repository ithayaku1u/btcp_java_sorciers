public abstract class Personnage implements Victime{
	public String nom;
	protected int point;

	public Personnage(){
		//Constructeur par defaut au cas ou le nom n est pas precise
	}

	public Personnage(String nom){
		this.nom = nom;
	}

	public String toString(){
		if (this.point <= 0){
			return this.nom+" est mort.";
		}
		else{
			return "Je m'appelle " + this.nom +" et j'ai "+point+ " point(s) de vie.";
		}

	}

	public String getNom(){
		return this.nom;
	}

	public boolean mort(){
		return this.point<0;
	}

	public int getVie(){
		return this.point;
	}

	public void addVie(int n){
		this.point = this.point + n;
	}

	public abstract void attaque(Personnage p);
	//ce qui est dessous va faire partir de l'interface
	//public abstract int subitFrappe(int coup);
	//public abstract int subitCharme(int coup);

}
