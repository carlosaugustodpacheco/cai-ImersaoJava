package br.com.coffeandit;

import java.util.stream.Stream;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		var filmeStrategy = FilmeFactory.criarFabrica(FilmeFactoryEnum.FILE);
		
		try {
			var filmeDtos = filmeStrategy.buscarFilmes();
			
			Stream<FilmeDto> filmeDtoStream = filmeDtos.stream()
				.filter(filmeDto -> {
					return filmeDto.getAnoLancamento() == 2009 &&
							filmeDto.getEstudio().contains("Universal");
				});
			filmeDtoStream
				.forEach(filmeDto -> {
				System.out.println(filmeDto);
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
