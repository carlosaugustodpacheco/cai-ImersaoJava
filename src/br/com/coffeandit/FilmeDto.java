package br.com.coffeandit;

public class FilmeDto {
	
	private String nome;
	private String genero;
	private String estudio;
	private int percentualAudiencia;
	private double lucratividade;
	private int aprovacaoPremio;
	private String faturamento;
	private int anoLancamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEstudio() {
		return estudio;
	}
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	public int getPercentualAudiencia() {
		return percentualAudiencia;
	}
	public void setPercentualAudiencia(int percentualAudiencia) {
		this.percentualAudiencia = percentualAudiencia;
	}
	public double getLucratividade() {
		return lucratividade;
	}
	public void setLucratividade(double lucratividade) {
		this.lucratividade = lucratividade;
	}
	public int getAprovacaoPremio() {
		return aprovacaoPremio;
	}
	public void setAprovacaoPremio(int aprovacaoPremio) {
		this.aprovacaoPremio = aprovacaoPremio;
	}
	public String getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(String faturamento) {
		this.faturamento = faturamento;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
}
