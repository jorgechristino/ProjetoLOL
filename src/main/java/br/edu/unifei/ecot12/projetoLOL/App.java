package br.edu.unifei.ecot12.projetoLOL;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random r = new Random();
		Random x = new Random();
		int i;
		
		//Regioes
		Piltover piltover = Piltover.getInstancia();
		piltover.setRegime("Oligarquia Aristocratica");
		piltover.setNivelTecnologia("Alto");
		piltover.setProducaoTecnologia(500);
		
		Zaun zaun = Zaun.getInstancia();
		zaun.setRegime("Oligarquia Industrial");
		zaun.setNivelTecnologia("Alto");
		zaun.setPoluicao(75);
		
		Noxus noxus = Noxus.getInstancia();
		noxus.setRegime("Imperio Expansionista");
		noxus.setNivelTecnologia("Mediano");
		noxus.setGuerreiros(1650);

		Local placidio = new Local();
		placidio.setNome("Placidio de Navori");
		Local monasterio = new Local();
		monasterio.setNome("Monasterio Kinkou");
		
		Ionia ionia = Ionia.getInstancia();
		ionia.setRegime("Provincias Regionais");
		ionia.setNivelTecnologia("Baixo");
		ionia.getLocais().add(placidio);
		ionia.getLocais().add(monasterio);
		ionia.setSoldados(3000);

		//Arma1 - Rifle hextech
		Fisico f1 = new Fisico();
		f1.setDanoFisico(10);
		Hextech h1 = new Hextech();
		h1.setCristais(20);
		ArmaTecnologica pacificadora = new ArmaTecnologica(f1, h1);
		pacificadora.setTipo("Rifle");
		pacificadora.setPreco(1600);
		
		//Arma2 - Caduceu quimtech
		Magico m1 = new Magico();
		m1.setDanoMagico(8);
		Quimtech q1 = new Quimtech();
		q1.setVeneno(50);
		ArmaTecnologica caduceu = new ArmaTecnologica(m1, q1);
		caduceu.setTipo("Caduceu Magico");
		caduceu.setPreco(2000);
		
		//Arma3 - Arco  
		Fisico f2 = new Fisico();
		f2.setDanoFisico(7);
		ArmaSimples arco = new ArmaSimples(f2);
		arco.setTipo("Arco");
		arco.setDurabilidade(1000);
		
		//Seres
		Humano caitlyn = new Humano();
		caitlyn.setNome("Caitlyn");
		caitlyn.setAlcunha("Xerife de Piltover");
		caitlyn.setInteligencia(100);
		caitlyn.setRegiao(piltover);
		caitlyn.setStatus(new Status());
		caitlyn.getStatus().setDanoFisico(72);
		caitlyn.getStatus().setDanoMagico(20);
		caitlyn.getStatus().setResistenciaMagica(15);
		caitlyn.getStatus().setArmadura(20);
		caitlyn.getStatus().setVida(150);
		caitlyn.setArma(pacificadora);
		
		Humano renata = new Humano();
		renata.setNome("Renata Glasc");
		renata.setAlcunha("A Baronesa da Quimica");
		renata.setInteligencia(150);
		renata.setRegiao(zaun);
		renata.setStatus(new Status());
		renata.getStatus().setDanoFisico(5);
		renata.getStatus().setDanoMagico(52);
		renata.getStatus().setResistenciaMagica(35);
		renata.getStatus().setArmadura(28);
		renata.getStatus().setVida(170);
		renata.setArma(caduceu);
		
		Vastaya ahri = new Vastaya();
		ahri.setNome("Ahri");
		ahri.setAlcunha("A Raposa de Nove Caudas");
		ahri.setSubespecie("Vesani");
		ahri.setRegiao(noxus);
		
		Darkin varus = new Darkin();
		varus.setNome("Varus");
		varus.setAlcunha("A flecha da Vinganca");
		varus.setCorrupcao(100);
		varus.setRegiao(ionia);
		varus.setStatus(new Status());
		varus.getStatus().setDanoFisico(62);
		varus.getStatus().setDanoMagico(25);
		varus.getStatus().setResistenciaMagica(18);
		varus.getStatus().setArmadura(27);
		varus.getStatus().setVida(180);
		varus.setArma(arco);
		
		//Mostrar todas Regioes e seus atributos
		List<Regiao> regioes = new ArrayList<Regiao>();
		regioes.add(piltover);
		regioes.add(zaun);
		regioes.add(noxus);
		regioes.add(ionia);
		System.out.println("--REGIOES--");
		for(Regiao c :  regioes) {
			i = 1;
			System.out.println("Nome: " + c.getClass().getSimpleName());
			System.out.println("Regime: " + c.getRegime());
			System.out.println("Nivel Tecnologico: " + c.getNivelTecnologia());
			if(c.getLocais() != null)
				for(Local l : c.getLocais()) {
					System.out.println("Local " + i +": " + l.getNome());
					i++;
				}
			System.out.println(" ");
		}
		
		//Mostrar todos seres e seus atributos
		List<Ser> seres = new ArrayList<Ser>();
		seres.add(caitlyn);
		seres.add(renata);
		seres.add(ahri);
		seres.add(varus);
		System.out.println("--SERES--");
		for(Ser s :  seres) {
			System.out.println("Nome: " + s.getNome());
			System.out.println("Alcunha: " + s.getAlcunha());
			System.out.println("Raca: " + s.getClass().getSimpleName());
			System.out.println("Regiao: " + s.getRegiao().getClass().getSimpleName());
			if(s.getArma() != null)
				System.out.println("Arma: " + s.getArma().getTipo());
			if(s.getStatus() != null) {
				System.out.println("--Status--");
				System.out.println("Dano Fisico: " + s.getStatus().getDanoFisico());
				System.out.println("Dano Magico: " + s.getStatus().getDanoMagico());
				System.out.println("Resistencia Magica: " + s.getStatus().getResistenciaMagica());
				System.out.println("Armadura: " + s.getStatus().getArmadura());
				System.out.println("Vida: " + s.getStatus().getVida());
			}
			System.out.println(" ");
		}
		
		//Simulacao de uma Batalha
		Batalha batalha = new Batalha();
		batalha.setSer1(caitlyn);
		batalha.setSer2(varus);
		batalha.setLocal(placidio);
		System.out.println("--BATALHA-- \n" + batalha.getSer1().getNome() + " vs " + batalha.getSer2().getNome());
		System.out.println("Local: " + batalha.getLocal().getNome());
		System.out.println(" ");
		while((batalha.getSer1().getStatus().getVida() > 0) && (batalha.getSer2().getStatus().getVida() > 0)) {
			if(x.nextBoolean()) {
				batalha.setGolpe(new GolpeFisico());
			}else {
				batalha.setGolpe(new GolpeMagico());
			}
			switch (r.nextInt(2)) {
				case 0:
					batalha.executaGolpe(batalha.getSer1(), batalha.getSer2());
					System.out.println(batalha.getSer1().getNome() + " atacou " + batalha.getSer2().getNome() +
							" com " + batalha.getGolpe().getClass().getSimpleName());
					break;
				case 1:
					batalha.executaGolpe(batalha.getSer2(), batalha.getSer1());
					System.out.println(batalha.getSer2().getNome() + " atacou " + batalha.getSer1().getNome() +
							" com " + batalha.getGolpe().getClass().getSimpleName());
					break;
			}
			System.out.println(batalha.getSer1().getNome() + " - Vida = " + batalha.getSer1().getStatus().getVida());
			System.out.println(batalha.getSer2().getNome() + " - Vida = " + batalha.getSer2().getStatus().getVida());
			System.out.println(" ");
		}
		
		//Mostrando o vencedor
		if(batalha.getSer1().getStatus().getVida() <= 0) {
			System.out.println("Vencedor: " + batalha.getSer2().getNome());
		}
		else {
			System.out.println("Vencedor: " + batalha.getSer1().getNome());
		}	
	}

}
