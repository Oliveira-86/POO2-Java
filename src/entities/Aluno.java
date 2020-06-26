package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public void notaFinal() {
		
		media = (nota1*3 + nota2*3.5 + nota3*3.5)/3;		
		
		if(media >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FALIED");
		}
		//return media;
		
	}
	
	public String toString() {
		return "Grade Final!"  + String.format("%.2f", notaFinal()) ;
	}
}
