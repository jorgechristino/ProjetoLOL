package br.edu.unifei.ecot12.projetoLOL;

public abstract class Ser {
	private String nome;
	private String alcunha;
	private int idade;
	private Status status;
	private Regiao regiao;
	private Arma arma;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlcunha() {
		return alcunha;
	}
	public void setAlcunha(String alcunha) {
		this.alcunha = alcunha;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
		this.status.setDanoFisico(this.status.getDanoFisico() + arma.danoAdicionalFisico());
		this.status.setDanoMagico(this.status.getDanoMagico() + arma.danoAdicionalMagico());
	}
	
}

