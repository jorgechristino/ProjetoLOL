package br.edu.unifei.ecot12.projetoLOL;

public class Zaun extends Regiao {
	private int poluicao;
	private Zaun() {}
	private static Zaun instancia = new Zaun();
	public static Zaun getInstancia() {
		return instancia;
	}
	public int getPoluicao() {
		return poluicao;
	}
	public void setPoluicao(int poluicao) {
		this.poluicao = poluicao;
	}
	
}
