package br.edu.unifei.ecot12.projetoLOL;

public class Noxus extends Regiao {
	private int guerreiros;
	private Noxus() {}
	private static Noxus instancia = new Noxus();
	public static Noxus getInstancia() {
		return instancia;
	}
	public int getGuerreiros() {
		return guerreiros;
	}
	public void setGuerreiros(int guerreiros) {
		this.guerreiros = guerreiros;
	}
	
}
