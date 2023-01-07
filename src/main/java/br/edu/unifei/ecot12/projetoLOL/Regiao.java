package br.edu.unifei.ecot12.projetoLOL;

import java.util.ArrayList;
import java.util.List;

public abstract class Regiao {
	private String regime;
	private String nivelTecnologia;
	private List<Local> locais = new ArrayList<Local>();
	public String getRegime() {
		return regime;
	}
	public void setRegime(String regime) {
		this.regime = regime;
	}
	public String getNivelTecnologia() {
		return nivelTecnologia;
	}
	public void setNivelTecnologia(String nivelTecnologia) {
		this.nivelTecnologia = nivelTecnologia;
	}
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	
}
