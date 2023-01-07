package br.edu.unifei.ecot12.projetoLOL;

public class ArmaTecnologica extends Arma {
	private int preco;
	private Tecnologia tecnologia;
	public ArmaTecnologica(Dano d, Tecnologia t) {
		super(d);
		tecnologia = t;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Tecnologia getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(Tecnologia tecnologia) {
		this.tecnologia = tecnologia;
	}
	
	
}
