
public class Aluno {

	int notaBim1;
	int notaBim2;
	int notaBim3;
	int notaBim4;
	
	public int mediaAluno () {
		int total = 0;
		
		total += notaBim1;
		total += notaBim2;
		total += notaBim3;
		total += notaBim4;
		
		return total/4;
	}
	
	public boolean Resultado() {
		if(mediaAluno() >= 60)
			return true;
		return false;
	}
}
