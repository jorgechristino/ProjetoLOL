package br.edu.unifei.ecot12.projetoLOL;

public abstract class Arma {
	private String tipo;
	private Dano dano;
	public Arma(Dano d) {
		dano = d;
	}
	public int danoAdicionalFisico() {
		return dano.danoAdicionalFisico();
	}
	public int danoAdicionalMagico() {
		return dano.danoAdicionalMagico();
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Dano getDano() {
		return dano;
	}
	public void setDano(Dano dano) {
		this.dano = dano;
	}
	
}
