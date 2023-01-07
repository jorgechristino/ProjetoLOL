package br.edu.unifei.ecot12.projetoLOL;

public class GolpeMagico implements Golpe {
	//@Override
	public void golpear(Ser s1, Ser s2) {
		int dm = s1.getStatus().getDanoMagico();
		int resm = s2.getStatus().getResistenciaMagica();
		if(dm > resm)
			s2.getStatus().setVida(s2.getStatus().getVida() - dm + resm);
	}
	
}
