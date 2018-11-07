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
		System.out.println("nบ ponta da caneta: "+ this.ponta);
		System.out.println("carga da caneta: "+ this.carga);
		System.out.println("a caneta estแ tampada?"+ this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("NรO POSSO RABISCAR! ESTOU TAMPADA");
		}else { System.out.println("--------,________/จจจจจจจจจ|");
				System.out.println("                       ____|");
				System.out.println("                   /จจ");
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