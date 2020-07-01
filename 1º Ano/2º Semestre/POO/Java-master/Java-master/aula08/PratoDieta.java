package aula08;

public class PratoDieta extends Prato {
	private double maxCal;
	
	public PratoDieta(String nome, DiaSemana diaSem, double maxCal) {
		super(nome, diaSem);
		this.maxCal = maxCal;
	}
	
	public PratoDieta(String nome, double maxCal) {
		super(nome);
		this.maxCal = maxCal;
	}

}
