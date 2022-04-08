package POO;

public class TesteAnimal {
	

	public static void main(String[] args) {

    Cachorro Negão = new Cachorro("Negão",20,"late","correr");
    Cavalo PéDePano = new Cavalo("Pé de pano", 20,"relincha","dá coices");
    Preguiça Luluzinha = new Preguiça("Luluzinha",5,"balidos de tristeza", "subir em árvores");
   
    Negão.imprimirCachorro();
    
    PéDePano.imprimirCavalo();
    
    Luluzinha.imprimirPreguiça();
    
    
	}

}
