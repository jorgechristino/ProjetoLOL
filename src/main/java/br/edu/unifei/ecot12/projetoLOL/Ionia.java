package br.edu.unifei.ecot12.projetoLOL;

public class Ionia extends Regiao {
	private int soldados;
	private Ionia() {}
	private static Ionia instancia = new Ionia();
	public static Ionia getInstancia() {
		return instancia;
	}
	public int getSoldados() {
		return soldados;
	}
	public void setSoldados(int soldados) {
		this.soldados = soldados;
	}	
}
