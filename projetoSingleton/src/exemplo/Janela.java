package exemplo;

public class Janela {
	
	private static final Janela INSTANCE = new Janela();
	private static final String Teste = "Exemplo Singleton Privado";
	
	public static final String Singleton = "Exemplo Singleton Publico";
	
	private Janela() {
		
	}
	
	public static Janela getInstance() {
		return INSTANCE;
	}
	
	public static void Abrir() {
		System.out.println("Abrir Janela!");
	}
	
	public static void Fechar() {
		System.out.println("Fechar Janela!");
	}

}
