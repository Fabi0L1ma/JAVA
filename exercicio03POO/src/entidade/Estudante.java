package entidade;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaNota() {
		return (nota1 + nota2 + nota3);
	}
	
	public double pontosFaltando() {
		if(mediaNota() < 60) {
			return 60 - mediaNota();
		}else {
			return 00.0; 
		}
	}

}
