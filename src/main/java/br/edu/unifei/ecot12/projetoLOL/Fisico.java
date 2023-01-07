package br.edu.unifei.ecot12.projetoLOL;

public class Fisico implements Dano {
	private int danoFisico;
	public int danoAdicionalFisico() {
		return danoFisico;
	}
	public int danoAdicionalMagico() {
		return 0;
	}
	public int getDanoFisico() {
		return danoFisico;
	}
	public void setDanoFisico(int danoFisico) {
		this.danoFisico = danoFisico;
	}
	
}
