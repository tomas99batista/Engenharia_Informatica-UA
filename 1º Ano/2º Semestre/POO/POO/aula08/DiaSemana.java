package aula08;

public enum DiaSemana {
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
	
	private int code;
	
	private DiaSemana(int code) {
		this.code = code;
	}
	
	@SuppressWarnings("unused")
	private int getCode() {
		return this.code;
	}
}
