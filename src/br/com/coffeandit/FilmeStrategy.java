package br.com.coffeandit;

import java.io.IOException;
import java.util.List;

public interface FilmeStrategy {
	
	public List<FilmeDto> buscarFilmes() throws IOException;

}
