package Entidade;
	
public class Elevador {
	private int id;
	private double cargaMaxima = 350.00;
	private double cargaAtual;
	private boolean sinalAlerta;
	
	Calculadora calculadora = new Calculadora();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	public double entrarNoElevador(double peso) {
		cargaAtual = calculadora.somar(peso, cargaAtual);
		return cargaAtual;
	}
	
	public double sairDoElevador(double peso) {
		cargaAtual = calculadora.subtrair(peso, cargaAtual);
		return cargaAtual;
	}
	
	public boolean avaliarPeso(double peso) {
		if (cargaAtual > cargaMaxima) {
			return sinalAlerta = true;
		} else {
			return sinalAlerta = false;
		}
	}
}