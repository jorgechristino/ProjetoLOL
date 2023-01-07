package br.edu.unifei.ecot12.projetoLOL;

public class GolpeFisico implements Golpe {
	//@Override
	public void golpear(Ser s1, Ser s2) {
		int df = s1.getStatus().getDanoFisico();
		int arm = s2.getStatus().getArmadura();
		if(df > arm)
			s2.getStatus().setVida(s2.getStatus().getVida() - df + arm);
	}
	
}
