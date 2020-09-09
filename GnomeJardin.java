public class GnomeJardin extends NainJardin  implements SuperPouvoir{
	public GnomeJardin(int solidite){
		super(solidite);
	}

	public int subitCharme(int coup){
		if (this.sort()> -coup){
			return coup;
		}
		else{
		       	return -1;
		}
	}
	
	public double sort(){
		return Math.random()*this.solidite;	
	}
}
