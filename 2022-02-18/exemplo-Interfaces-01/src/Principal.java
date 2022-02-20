
public class Principal {
	
	public static Aluno getAluno(Aluno aluno) { 
		return aluno;
	}
	
	public static void main(String[] args) {

		Aluno aluno = Principal.getAluno(new AlunoRecode());
		
		aluno.setMatricula("1111");
		aluno.setNome("Oswaldo");
		aluno.setTeste(10);
		aluno.setProva(10);
		
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Nome: "  + aluno.getNome());
		System.out.println("Média: "  + aluno.getMedia());
		
	}

}
