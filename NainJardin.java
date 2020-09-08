public class NainJardin implements Victime{
	int solidite;

	public NainJardin(){
	}
	public NainJardin(int sol){
		this.solidite = sol;
	}

	public int subitFrappe(int coup){
		if (solidite < coup){
			int copie = solidite;
			solidite = 0;
			return -copie;
		}
		else{
			return - coup;
		}
	}

	public int subitCharme(int coup){
		return -1; 
	}
	

}
