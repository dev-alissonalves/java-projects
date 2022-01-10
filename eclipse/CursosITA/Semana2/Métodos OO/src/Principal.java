
public class Principal {
	public static void main(String [] args) {
		Aluno a1 = new Aluno();
		
		a1.notaBim1 = 70;
		a1.notaBim2 = 70;
		a1.notaBim3 = 80;
		a1.notaBim4 = 65;
		
		System.out.println(a1.mediaAluno());
		System.out.println(a1.Resultado());
	}
}