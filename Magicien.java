public class Magicien extends Sorcier implements SuperPouvoir{

	public Magicien(String nom){
		super(nom);
	}

	public double getPouvoir(){
		return extra*this.pouvoir;
	}

	public double sort(){
		return Math.random()*this.getPouvoir();
	}

	public int subitCharme(int coup){
		return (int)(coup*this.sort());
	}

	public String toString(){
		String txt = super.toString() + " (Magicien)";
		return txt;

	}

}
