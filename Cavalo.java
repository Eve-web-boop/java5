package POO;

public class Cavalo extends Animal
{
	
private String correr;
	
	public Cavalo (String nome, int idade, String som, String correr) {
		
		super(nome, idade, som);
		this.correr = correr;
	}

	
	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}


	public void imprimirCavalo() { 
		System.out.println("\n Nome:"+getNome()+ "\n Idade:"+ getIdade()+"\nSom: "+getSom()+"\n O que ele gosta de fazer:"+ correr);
	}
	
}