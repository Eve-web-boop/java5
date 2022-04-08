package POO;

public class Cachorro extends Animal {
	
	private String correr;

	public Cachorro(String nome, int idade, String Som, String correr) {
		super(nome, idade, Som);
		this.correr = correr;
	}

public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public void imprimirCachorro () {
		System.out.println("\n Nome:"+getNome()+ "\n Idade:"+ getIdade()+"\nSom: "+getSom()+"\n O que ele gosta de fazer: "+ correr);
	}
	

}