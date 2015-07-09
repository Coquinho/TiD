//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
package InteracaoUsuario;

import java.util.Random;
import java.util.Scanner;

import Model.Hero;
import Model.Monster;
import Model.NPC;
import Model.Personagem;
import Model.Weapon;

public class Adventure {
	static int qtdtotalMonstros=0;
	static int vit=0;
	public void Aventura(){
		Scanner scan= new Scanner(System.in);
		RandomizeHero rz=new RandomizeHero();
		Random rng=new Random();
		boolean jogo=true;
		while(jogo==true){
			String race=rz.RandomRace();
			String classe=rz.RandomClasse();
			int idade=rz.RandomIdade();
			int Hp=rz.RandomHp();
			Weapon weapon=rz.RandomArma();
			
			System.out.println("Hero! The world has fallen into darkness. Monsters walk around cities, taking innocent lives. You have to help us.\nBut first, tell me your name:");
			String nome=scan.next();
			
			Hero hero=new Hero(nome,Hp,race, classe, idade, weapon);
			System.out.println("Wow, that's a weird name... What is your story?\nLet me see if I got it: your name is "+nome+ " and you are a "+race+" "+ classe+" and you are "+idade+" years old.");
			System.out.println("Oh,my...We're running out of time... Be aware that you'll find strong enemies along the way, as well as friendly, harmless enemies.\nOh, I'almost forgot,take this "+weapon.getNome()+". Now go on,and do your best!\n");
			
			Personagem[] personagem=CriarArrayInimigos(rng);
			boolean vitoria=true;
			int qtdMonster=0;
			for(int i=0;i<personagem.length;i++){
				vitoria=true;
				Encounter encontro=new Encounter(); 
				if(hero.getHp()>0 && vitoria==true){
					if (personagem[i] instanceof Monster) {
						Monster monster = ((Monster)personagem[i]);
						vitoria=encontro.Battle(hero, monster, scan, rng);
						qtdMonster++;
						if(vitoria==false && i==personagem.length-1 && hero.getHp()<=0 && monster.getHp()<=0){
							System.out.println(monster.getNome()+" has died, but so did you...\n"
									+ "Your last moments alive are divided between sadness and relief. You managed to defeat this beast, and make this scorched Earth a bit easier to live in.\n"
									+ "But you will never be able to see the happy faces when you come back. After all, you are not coming back. Your loving family will never be able to hug their heroic son again. You can't let that happen.\n"
									+ "Game Over");
							vit++;
						}else if(vitoria==true && i<personagem.length-1){
							System.out.println("One less monster to deal with.");
						}else if((hero.getHp()<=0) && (monster.getHp()<=0) && vitoria==false && i<personagem.length-1){
							System.out.println(monster.getNome()+" has died, but so did you...\n");
						}
					}
					if ((personagem[i] instanceof NPC) && (vitoria==true)) {
						NPC npc = ((NPC)personagem[i]);
						encontro.Battle(npc);
					}else if(qtdMonster%2==0 && qtdMonster>0 && hero.getHp()>0 && i<personagem.length-1){
						int moreHp=rng.nextInt(36)+15;
						System.out.println("\nAfter this last encounter, you see a tiny man, looking at you. Seeing you are not in the best condition, \nhe invites you to his humble abode, so you can rest and regain strength.");
						System.out.println("You got "+moreHp+" health back");
						hero.setHp(hero.getHp()+moreHp);
					} 
					
					if(vitoria==true && i==personagem.length-1){
						System.out.println("You did it. The veil monster who created all this. The mastermind behind the dawn of humanity. It's dead. And you are the one who's done it.\n"
								+ "The hero we all needed. You can see the monster finally disappearing, giving space for normal life to develop again. You saved us. You saved us all.\n"
								+ "Game Over");
						vit++;
					}
					
				}
				
				
				System.out.println();
			}
			if(vitoria==false)
				qtdMonster--;
			qtdtotalMonstros+=qtdMonster;
			System.out.println("You have killed "+qtdMonster+" enemies in this session");
			boolean end=false;
			while(end==false){
				System.out.println("Try again?(sim/s/yes/y/nao/não/n/no/hai/iie)");
				String resp=scan.next();
				if( resp.equalsIgnoreCase("nao") || resp.equalsIgnoreCase("não")||resp.equalsIgnoreCase("n")||resp.equalsIgnoreCase("no")||resp.equalsIgnoreCase("iie") ){
					jogo=false;
					end=true;
					System.out.println("You have killed a total of "+qtdtotalMonstros+" enemies");
					if(vit>0)
						System.out.println("Total victories: "+vit);
				}else if(resp.equalsIgnoreCase("sim")||resp.equalsIgnoreCase("s")||resp.equalsIgnoreCase("yes")||resp.equalsIgnoreCase("y")||resp.equalsIgnoreCase("hai")){
					end=true;
					jogo=true;
				}
			}
							
		}
		
		
	}
	
	public Personagem[] CriarArrayInimigos(Random rng){
		
		Personagem[] personagem=new Personagem[(rng.nextInt(7)+4)];
		RandomizeMonster rm=new RandomizeMonster();
		RandomizeNPC rn=new RandomizeNPC();
		
		for(int i=0;i<personagem.length;i++){
			int op=rng.nextInt(3);
			switch (op) {
				case 0: case 2:
					Monster monster = rm.RandomMonster();
					personagem[i]= monster;
					break;
				case 1:
					NPC npc=rn.Npc();
					personagem[i]=npc;
					break;
			}
			if(i==personagem.length-1){
				Monster monster=rm.creatDragon();
				personagem[i]=monster;
			}
			
		}
		
		return personagem;
	} 
}
