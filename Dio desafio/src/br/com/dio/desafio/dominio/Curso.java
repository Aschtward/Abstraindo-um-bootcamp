package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	

	public double calcularXp() {
		return XP_PADRAO*cargaHoraria;
	}	
	
	
	public Curso() {

	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String toString() {
		return "Curso Titulo= " + getTitulo()
				+ ", descricao= " + getDescricao()
				+ ", Carga Horaria= " + cargaHoraria;
	}	
	
}
