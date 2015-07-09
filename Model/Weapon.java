package Model;
//Guilherme Martins Plucenio 15100739 POOI 12o8A
//Lucas Cavalcante de Sousa 	15100751
import InteracaoUsuario.RandomizeHero;

public class Weapon {
	private String nome;
	private int dano;
	private int type;
	
	public Weapon(String nome,int dano,int type){
		this.nome=nome;
		this.dano=dano;
		this.type=type;
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

	public void setDano(int type) {
		RandomizeHero rh=new RandomizeHero();
		this.dano = rh.RandomSetDanoArma(type);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
