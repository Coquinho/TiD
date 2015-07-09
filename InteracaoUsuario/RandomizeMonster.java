package InteracaoUsuario;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
import java.util.Random;

import Model.*;

public class RandomizeMonster {
	public Monster RandomMonster(){
		
		Random rng=new Random();
		int op=rng.nextInt(15);
		
		String nome="";
		int Hp=0;
		String primarySkillName="";
		int primarySkillDamage=0;
		String secondarySkillName="";
		int secondarySkillDamage=0;
		
		switch (op) {
			case 0 :
				nome="Dragon";	
				Hp=rng.nextInt(21)+60;
				//Atk=rng.nextInt();
				primarySkillName="Claw";
				primarySkillDamage=rng.nextInt(5)+8;
				secondarySkillName="Fire Breath";
				secondarySkillDamage=rng.nextInt(11)+10;
				break;
			case 1: case 2: case 3:
				nome="METAL HEAD";
				Hp=rng.nextInt(21)+30;
			//	Atk=rng.nextInt();
				primarySkillName="YELL";
				primarySkillDamage=rng.nextInt(9)+4;
				secondarySkillName="GUITAR TOSS";
				secondarySkillDamage=rng.nextInt(6)+5;
				break;
			case 4: case 5: case 6:case 7:
				nome="Slime";
				Hp=rng.nextInt(50)+1;
				//Atk=rng.nextInt();
				primarySkillName="Glorp";
				primarySkillDamage=rng.nextInt(4)+2;
				secondarySkillName="Ooze";
				secondarySkillDamage=rng.nextInt(4)+3;
				break;
			case 8: case 9: case 10: 
				nome="Esqueleto";
				Hp=rng.nextInt(21)+20;
				//Atk=rng.nextInt();
				primarySkillName="Bone strike";
				primarySkillDamage=rng.nextInt(3)+6;
				secondarySkillName="Bonearang";
				secondarySkillDamage=rng.nextInt(6)+5;
				break;
			case 11: case 12:case 13: case 14:
				nome="Mouse";
				Hp=rng.nextInt(50)+1;
				//Atk=rng.nextInt();
				primarySkillName="Claw";
				primarySkillDamage=rng.nextInt(3)+3;
				secondarySkillName="Bite";
				secondarySkillDamage=rng.nextInt(5)+4;
				break;
		}
	
		Skill primarySkill=new Skill(primarySkillName,primarySkillDamage);
		Skill secondarySkill=new Skill(secondarySkillName,secondarySkillDamage);
		Monster monster=new Monster(nome,Hp,primarySkill,secondarySkill);
		return monster;
	}
	
	public Monster creatDragon(){
		Random rng=new Random();
		String nome="Dragon";	
		int Hp=rng.nextInt(21)+60;
		String primarySkillName="Claw";
		int primarySkillDamage=rng.nextInt(5)+8;
		String secondarySkillName="Fire Breath";
		int secondarySkillDamage=rng.nextInt(11)+10;
		Skill primarySkill=new Skill(primarySkillName,primarySkillDamage);
		Skill secondarySkill=new Skill(secondarySkillName,secondarySkillDamage);
		Monster monster=new Monster(nome,Hp,primarySkill,secondarySkill);
		return monster;
	}
	
}
