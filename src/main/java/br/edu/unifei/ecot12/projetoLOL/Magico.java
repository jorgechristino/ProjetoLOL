package br.edu.unifei.ecot12.projetoLOL;

public class Magico implements Dano {
	private int danoMagico;
	public int danoAdicionalFisico() {
		return 0;
	}
	public int danoAdicionalMagico() {
		return danoMagico;
	}
	public int getDanoMagico() {
		return danoMagico;
	}
	public void setDanoMagico(int danoMagico) {
		this.danoMagico = danoMagico;
	}
	
}
