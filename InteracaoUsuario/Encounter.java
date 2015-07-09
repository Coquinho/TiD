//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
package InteracaoUsuario;

import java.util.Random;
import java.util.Scanner;

import Model.Hero;
import Model.Monster;
import Model.NPC;
import Model.Personagem;

public class Encounter {
	public Personagem[] Round(Hero hero,Monster monster,Scanner scan,Random rng){
		boolean b=true;
		while(b==true){
			boolean c=true;
			String op="";
			while(c==true){
				System.out.println("1-Attack\n2-Parry");
				op=scan.next();
				if(op.equalsIgnoreCase("1") || op.equalsIgnoreCase("2"))
					c=false;
			}
			switch(op){
				case "1":
					int atk=rng.nextInt(3);
					if(monster.getHp()>0){
						if(atk==0){
							System.out.println(monster.getNome()+" used " +monster.getPrimarySkill().getNome()+" causing "+monster.getPrimarySkill().getDano()+" of damage.");
							hero.setHp(hero.getHp(), monster.getPrimarySkill().getDano());
						}else if(atk==1){
							System.out.println(monster.getNome()+" used " +monster.getSecondarySkill().getNome()+" causing "+monster.getSecondarySkill().getDano()+" of damage.");
							hero.setHp(hero.getHp(), monster.getSecondarySkill().getDano());
						}else if(atk==2){
							System.out.println(monster.getNome()+" used parry causing "+(monster.getPrimarySkill().getDano())/2 +" of damage.");
							hero.setHp(hero.getHp(), monster.getPrimarySkill().getDano()/2);
						}
					}
					if(atk==2){
						monster.setHp(monster.getHp(), hero.getWeapon().getDano()/2);
						System.out.println(hero.getNome()+" used "+hero.getWeapon().getNome()+" causing "+hero.getWeapon().getDano()/2+" of damage.");
					}						
					else{
						monster.setHp(monster.getHp(), hero.getWeapon().getDano());
						System.out.println(hero.getNome()+" used "+hero.getWeapon().getNome()+" causing "+hero.getWeapon().getDano()+ " of damage.");
					}						
					b=false;
					break;
				case "2":
					atk=rng.nextInt(3);
					if(monster.getHp()>0){
						if(atk==0){
							System.out.println(monster.getNome()+" used " +monster.getPrimarySkill().getNome()+" causing "+monster.getPrimarySkill().getDano()/2+" of damage.");
							hero.setHp(hero.getHp(), ((monster.getPrimarySkill().getDano())/2));
						}else if(atk==1){
							System.out.println(monster.getNome()+" used " +monster.getSecondarySkill().getNome()+" causing "+monster.getSecondarySkill().getDano()/2+" of damage.");
							hero.setHp(hero.getHp(), ((monster.getSecondarySkill().getDano())/2));
						}else if(atk==2){
							System.out.println(monster.getNome()+" used parry.");
							System.out.println(hero.getNome()+" used parry. \nNothing happened");
						}
					}
					if(atk!=2){
						System.out.println(hero.getNome()+" used parry, causing "+hero.getWeapon().getDano()/2+" of damage");
						monster.setHp(monster.getHp(), hero.getWeapon().getDano()/2);
					}
					b=false;
					break;
			}
		}
		
		Personagem[] personagem={hero,monster};
		
		return personagem;
	}
	
	public boolean Battle(Hero hero,Monster monster,Scanner scan,Random rng){
		boolean vitoria=false;
		boolean b=true;
		Personagem[] personagem={hero,monster};
		System.out.println("A wild "+monster.getNome()+" appears");
		while(b==true){
			if((hero.getHp()>0) && (monster.getHp()>0)){
				System.out.println("\n"+hero.getNome()+" HP:"+hero.getHp()+"\n"
						+ monster.getNome()+" HP:"+monster.getHp());
				personagem=Round(hero,monster,scan,rng);
				b=true;
				vitoria=false;
			}else if((hero.getHp()<=0) && (monster.getHp()>0)){
				b=false;
				vitoria=false;
				System.out.println("\n"+monster.getNome()+" killed you.\n"
						+ "You live long enough to think about all the tormented souls that you failed to save. You see, in your mind, the place where you grew up. Your family.\n"
						+ "They had such high hopes for you. 'One day our son will be a hero' they thought. And you came so close to it. But close is not enough.\n"
						+ "Game Over");
			}else if((hero.getHp()>0) && (monster.getHp()<=0)){
				b=false;
				vitoria=true;
				System.out.println(hero.getNome()+" killed "+monster.getNome());
			}else if((hero.getHp()<=0) && (monster.getHp()<=0)){
				b=false;
				vitoria=false;					
			}
			hero=(Hero)personagem[0];
			hero.getWeapon().setDano(hero.getWeapon().getType());
			monster=(Monster)personagem[1];
		}
		return vitoria;
	}
		
	public void Battle(NPC npc){
		System.out.println("A "+ npc.getNome()+" appears and he says:\n"+ npc.getFala());
		
	}
}
