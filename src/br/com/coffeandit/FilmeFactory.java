package br.com.coffeandit;

public class FilmeFactory {
	
	private FilmeFactory() {
		
	}
	public static FilmeStrategy criarFabrica() {
		return new CSVFilme();
	}

}
