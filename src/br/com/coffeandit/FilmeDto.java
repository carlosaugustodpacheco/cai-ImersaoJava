package br.com.coffeandit;

public class FilmeDto {
	
	@Override
	public String toString() {
		return "FilmeDto [nome=" + nome + ", genero=" + genero + ", estudio=" + estudio + ", percentualAudiencia="
				+ percentualAudiencia + ", lucratividade=" + lucratividade + ", aprovacaoPremio=" + aprovacaoPremio
				+ ", faturamento=" + faturamento + ", anoLancamento=" + anoLancamento + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estudio == null) ? 0 : estudio.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FilmeDto other = (FilmeDto) obj;
		if (estudio == null) {
			if (other.estudio != null)
				return false;
		} else if (!estudio.equals(other.estudio))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
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
