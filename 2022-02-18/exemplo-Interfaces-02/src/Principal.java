import java.util.ArrayList;

public class Principal {
	
	public static Aluno getAluno(Aluno aluno) { 
		return aluno;
	}
	
	public static void main(String[] args) {

		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = Principal.getAluno(new AlunoRecode());
		aluno1.setMatricula("1111");
		aluno1.setNome("Oswaldo");
		aluno1.setTeste(10);
		aluno1.setProva(10);
		
		Aluno aluno2 = Principal.getAluno(new AlunoRecode());
		aluno2.setMatricula("2222");
		aluno2.setNome("Gisele");
		aluno2.setTeste(10);
		aluno2.setProva(10);
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		
		Aluno aluno;
		
		aluno = (Aluno)listaAlunos.get(0);
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Nome: "  + aluno.getNome());
		System.out.println("Média: "  + aluno.getMedia());
		
		aluno = (Aluno)listaAlunos.get(1);
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Nome: "  + aluno.getNome());
		System.out.println("Média: "  + aluno.getMedia());	
	}
}
