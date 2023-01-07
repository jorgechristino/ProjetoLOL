package br.edu.unifei.ecot12.projetoLOL;

public class Piltover extends Regiao {
	private int producaoTecnologia;
	private Piltover() {}
	private static Piltover instancia = new Piltover();
	public static Piltover getInstancia() {
		return instancia;
	}
	public int getProducaoTecnologia() {
		return producaoTecnologia;
	}
	public void setProducaoTecnologia(int producaoTecnologia) {
		this.producaoTecnologia = producaoTecnologia;
	}
	public static void setInstancia(Piltover instancia) {
		Piltover.instancia = instancia;
	}
	
}
