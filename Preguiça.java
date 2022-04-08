package POO;

public class Preguiça extends Animal
{

	
	private String correr;

	public Preguiça(String nome, int idade, String Som, String subir, String correr) {
		super(nome, idade, Som);

		this.correr=correr;
	}

	
	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}


	public void imprimirPreguiça() {
		System.out.println("\n Nome:"+getNome()+ "\n Idade:"+ getIdade()+"\nSom: "+getSom()+"\n O que ele gosta de fazer:"+ correr);
	}

}