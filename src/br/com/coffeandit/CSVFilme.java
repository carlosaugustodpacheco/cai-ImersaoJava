package br.com.coffeandit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFilme implements FilmeStrategy {
	
	private static final String CSV_FILE = "C:\\Users\\gt_pa\\eclipse-workspace\\ImersaoJava\\src\\movies.csv";
	
	@Override
	public List<FilmeDto> buscarFilmes() throws IOException {
		
		Path csvFile = Paths.get(CSV_FILE);
		List<FilmeDto> filmes = new ArrayList<>();
		if (Files.exists(csvFile)) {
			List<String> lines = Files.readAllLines(csvFile, StandardCharsets.UTF_8);  
				for (String line : lines) {
					String[] conteudo = line.split(",");
					FilmeDto filmeDto = new FilmeDto();
					filmeDto.setNome(conteudo[0]);
					filmeDto.setGenero(conteudo[1]);
					filmeDto.setEstudio(conteudo[2]);
					filmeDto.setPercentualAudiencia(Integer.parseInt(conteudo[3]));
					filmeDto.setLucratividade(Double.parseDouble(conteudo[4]));
					filmes.add(filmeDto);
		
				}
			} 
				
		return filmes;
	}
	
}
