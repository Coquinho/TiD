package Model;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
public class Monster extends Fighter{
	private Skill primarySkill;
	private Skill secondarySkill;
	
	public Monster(String nome,int Hp,Skill primarySkill,Skill secondarySkill){
		super(nome,Hp);
		this.primarySkill=primarySkill;
		this.secondarySkill=secondarySkill;
	}

	public Skill getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(Skill primarySkill) {
		this.primarySkill = primarySkill;
	}

	public Skill getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(Skill secondarySkill) {
		this.secondarySkill = secondarySkill;
	}
}
