package Model;
//Guilherme Martins Plucenio 15100739 POOI 1208A
//Lucas Cavalcante de Sousa 	15100751
public class NPC extends Personagem{
	private String fala;
	
	public NPC(String nome,String fala){
		super(nome);
		this.fala=fala;
	}

	public String getFala() {
		return fala;
	}

	public void setFala(String fala) {
		this.fala = fala;
	}
}
