package br.edu.unifei.ecot12.projetoLOL;

public class ArmaSimples extends Arma {
	private int durabilidade;
	public ArmaSimples(Dano d) {
		super(d);
	}
	public int getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
	
}
