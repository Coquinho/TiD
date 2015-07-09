package Model;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
import java.util.Random;

public class Hero extends Fighter {
	private String raca;
	private String classe;
	private int idade;
	private Weapon weapon;
	
	public Hero(String nome,int Hp,String raca,String classe,int idade,Weapon weapon){
		super(nome,Hp);
		this.raca=raca;
		this.classe=classe;
		this.idade=idade;
		this.weapon=weapon;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
