public class Magicien extends Sorcier implements SuperPouvoir{
	// inutile car le constructeur de Sorcier s applique ?
	/*public Magicien(String nom){
		super(nom);
	}*/

	public double getPouvoir(){
		return extra*this.pouvoir;
	}

	public double sort(){
		return Math.random()*this.getPouvoir();
	}

	public int subitCharme(int coup){
		return (int)(coup*this.sort());
	}
	

}
