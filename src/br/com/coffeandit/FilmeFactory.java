package br.com.coffeandit;

public class FilmeFactory {
	
	private FilmeFactory() {
		
	}
	public static FilmeStrategy criarFabrica(final FilmeFactoryEnum type) {
		if (type.equals (FilmeFactoryEnum.FILE)) {
			return new CSVFilme();
		} else if (type.equals(FilmeFactoryEnum.DATABASE)) {
			// TODO Implementar a factory por banco de dados.
		return null;
	}
		throw new IllegalArgumentException("Fabrica não encontrada");
	}
}
