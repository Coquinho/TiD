//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
package InteracaoUsuario;

import java.util.Random;

import Model.Weapon;

public class RandomizeHero {
	
	public String RandomRace(){
		Random rng=new Random();
		int op=rng.nextInt(5);
		String race="";
		switch (op) {
			case 0 :
				race="Half Orc";	
				break;
			case 1:
				race="Human";
				break;
			case 2:
				race="Elf";
				break;
			case 3: 
				race="Dwarf"; 	
				break;
			case 4:
				race="Gnome";
				break;
		}
		return race;
	}
	
	public int RandomIdade(){
		Random rng=new Random();
		int idade=rng.nextInt(101)+5;
		return idade;
	}
	
	public int RandomHp(){
		Random rng=new Random();
		int Hp=rng.nextInt(81)+40;
		return Hp;
	}
		
	public String RandomClasse(){
		Random rng=new Random();
		int op=rng.nextInt(8);
		String classe="";
		switch (op) {
			case 0 :
				classe="Ranger";	
				break;
			case 1:
				classe="Barbarian";
				break;
			case 2:
				classe="Rogue";
				break;
			case 3: 
				classe="Warrior"; 	
				break;
			case 4:
				classe="Mage";
				break;
			case 5:
				classe="Bard";
				break;
			case 6:
				classe="Cleric";
				break;
			case 7:
				classe="Paladin";
				break;
		}
		return classe;
	}
	
	public Weapon RandomArma(){
		Random rng=new Random();
		int op=rng.nextInt(15);
		String nome="";
		int dano=0;
		switch (op) {
			case 0 :
				nome="Excalibur";	//espada Lendaria
				dano=rng.nextInt(3)+7;
				break;
			case 1:case 2: case 3:case 4:
				nome="Espada de Madeira"; 	//espada usual
				dano=rng.nextInt(2)+3;
				break;
			case 5:case 6:
				nome="Sabre de Luz";	//Espada espacial
				dano=rng.nextInt(3)+5;
				break;
			case 7:case 8: case 9: 
				nome="Galho de Goiabeira"; 	//the zuerira never ends
				dano=rng.nextInt(5)+1;
				break;
			case 10:
				nome="Varinha das Varinhas";		//varinha foade
				dano=rng.nextInt(15)+1;
				break;
			case 11: case 12: case 13:
				nome="Arco de caçar ratos";		//arco zuero
				dano=rng.nextInt(3)+3;
			case 14:
				nome="Rifle de matar pombinha"; //huehue
				dano=rng.nextInt(2)+7;
		}
		Weapon weapon=new Weapon(nome,dano,op);
		return weapon;
	}
	
	public int RandomSetDanoArma(int op){
		Random rng= new Random();
		int dano=0;
		switch (op) {
			case 0 :
				dano=rng.nextInt(3)+7;
				break;
			case 1:case 2: case 3:case 4:
				dano=rng.nextInt(2)+3;
				break;
			case 5:case 6:
				dano=rng.nextInt(3)+5;
				break;
			case 7:case 8: case 9: 
				dano=rng.nextInt(5)+1;
				break;
			case 10:
				dano=rng.nextInt(15)+1;
				break;
			case 11: case 12: case 13:
				dano=rng.nextInt(3)+3;
			case 14:
				dano=rng.nextInt(2)+7;
		}
		
		return dano;
	}
}
