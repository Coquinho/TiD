package Model;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
public class Fighter extends Personagem{
	private int Hp;
	
	public Fighter(String nome,int Hp){
		super(nome);
		this.Hp=Hp;
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp,int dano) {
		Hp = hp-dano;
	}
	
	public void setHp(int hp) {
		Hp = hp;
	}
	
}
