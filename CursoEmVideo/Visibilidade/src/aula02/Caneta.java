package aula02;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("modelo da caneta: "+ this.modelo);
		System.out.println("cor da caneta: "+ this.cor);
		System.out.println("n� ponta da caneta: "+ this.ponta);
		System.out.println("carga da caneta: "+ this.carga);
		System.out.println("a caneta est� tampada?"+ this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("N�O POSSO RABISCAR! ESTOU TAMPADA");
		}else { System.out.println("--------,________/���������|");
				System.out.println("                       ____|");
				System.out.println("                   /��");
				System.out.println("                   |____RABISCADO");
		}
		
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
}