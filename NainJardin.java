public class NainJardin implements Victime{
	int solidite;

	public NainJardin(){
	}

	public String toString(){
		return "Nain de Jardin, Solidite :" + this.solidite;
	}

	public NainJardin(int sol){
		this.solidite = sol;
	}

	public int subitFrappe(int coup){
		//J ai pris une convention bizarre pour coup qui est négatif
		if (solidite < -coup){
			int copie = solidite;
			solidite = 0;
			return -copie;
		}
		else{
			return coup;
		}
	}

	public int subitCharme(int coup){
		return -1; 
	}
	

}
