package br.edu.unifei.ecot12.projetoLOL;

public class Batalha {
	private Ser ser1;
	private Ser ser2;
	private Golpe golpe;
	private Local local;
	public void executaGolpe(Ser s1, Ser s2) {
		if (golpe != null)
			golpe.golpear(s1, s2);
	}
	public Ser getSer1() {
		return ser1;
	}
	public void setSer1(Ser ser1) {
		this.ser1 = ser1;
	}
	public Ser getSer2() {
		return ser2;
	}
	public void setSer2(Ser ser2) {
		this.ser2 = ser2;
	}
	public Golpe getGolpe() {
		return golpe;
	}
	public void setGolpe(Golpe golpe) {
		this.golpe = golpe;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
}
