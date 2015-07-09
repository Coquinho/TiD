package InteracaoUsuario;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
import java.util.Random;

import Model.NPC;

public class RandomizeNPC {
	
	public String RandomNPCName(){
		Random rng=new Random();
		int op=rng.nextInt(6);
		String name="";
		switch (op) {
			case 0 :
				name="Meio Orc";	
				break;
			case 1:
				name="Humano";
				break;
			case 2:
				name="Elfo";
				break;
			case 3: 
				name="Dwarf"; 	
				break;
			case 4:
				name="Gnome";
				break;
			case 5:
				name="Cachorro";
				break;
		}
		return name;
	}

	public String RandomNPCFala(){
		Random rng=new Random();
		int op=rng.nextInt(17);
		String fala="";
		switch (op) {

			case 0 :
				fala="A MAGE USED FIREBLAST CAUSING 8001 of damage. Just kidding ,I'm just an NPC.";	
				break;
			case 1:
				fala="Every two battles, a tiny man shows up. Weird, don't you think?";
				break;
			case 2:
				fala="Did you know the Dragon's name is Eteobaldo?";
				break;
			case 3: 
				fala="Don't waste your time talking to me, go slay some enemies!"; 	
				break;
			case 4:
				fala="I'm just an NPC, you can't hit me";
				break;
			case 5:
				fala="If you parry the same time an oponent does, nothing happens. You can't deflect something that's not trying to hit you!";
				break;
			case 6:
				fala="I hope you are not using the 'Galho de Goiabeira', it's the worst weapon you can get.";
				break;
			case 7:
				fala="ARE YOU THE HERO? ARE YOU GONNA HELP US? PLEASE, SIR, SAVE OUR SOULS";
				break;
			case 8:
				fala="THE END IS NEAR";
				break;
			case 9:
				fala="ALL HAIL DRAGON, THE DESTROYER OF WORLDS";
				break;
			case 10:
				fala="The man who gave you this weapon is not who you think it is.";
				break;
			case 11:
				fala="Au au";
				break;
			case 12:
				fala="You aren't really smart if you think you can defeat the Dragon";
				break;
			case 13:
				fala="Hero? My grandmother looks tougher than you.";
				break;
			case 14:
				fala="You are our last hope for salvation? We're all doomed...";
				break;
			case 15:
				fala="RUN AWAY WHILE YOU CAN";
				break;
			case 16:
				fala="All enemies have a weak attack and a strong attack. Let's hope they only try the weak ones!";
				break;
			
		}

		return fala;
	}
	
	public NPC Npc(){
		String nome= RandomNPCName();
		String fala=RandomNPCFala();
		NPC npc=new NPC(nome,fala);
		return npc;
	}
}
