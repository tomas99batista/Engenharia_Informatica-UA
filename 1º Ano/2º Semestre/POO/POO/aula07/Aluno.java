package aula07;

import java.util.Calendar;

public class Aluno extends Pessoa {
	
		private Data dataIns;
		private static int nMec = 100;
		private int myNMec;
		
	

	public Aluno(String nome, String apelido, int cc, Data dataNasc, Data dataIns) {
		super(nome, apelido, cc, dataNasc);
		this.dataIns = dataIns;
		this.myNMec = nMec;
		nMec++;
		
	}
	
	public Aluno(String nome, String apelido, int cc, Data dataNasc) {
		super(nome, apelido, cc, dataNasc);
		this.myNMec = nMec;
		nMec++;
		Calendar cal = Calendar.getInstance();
		this.dataIns = new Data(cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR));
		
	}
	
	public Aluno(String nome, String apelido) {
		super(nome, apelido);
		myNMec = nMec;
		nMec++;
	}
	

	@Override
	public String toString() {
		return "Aluno " + super.toString() + ", N Mec: " + myNMec;
	}


	public Data getDataIns() {
		return dataIns;
	}


	public void setDataIns(Data dataIns) {
		this.dataIns = dataIns;
	}


	public int getMyNMec() {
		return myNMec;
	}


	public void setMyNMec(int myNMec) {
		this.myNMec = myNMec;
	}
	
	
	

}
