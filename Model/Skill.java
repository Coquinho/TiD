package Model;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
public class Skill {
	private String nome;
	private int dano;
	
	public Skill(String nome,int dano){
		this.nome=nome;
		this.dano=dano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
}
