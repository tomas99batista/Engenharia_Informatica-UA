package a02;

public class A02E07PEDRO {
	public static void main(String[] args) {
		Double[][] notas = new Double[16][3];
		for (int i =0; i < 16; i++)
			for (int j = 0; j<2; j++)
				notas[i][j] = Math.round((Math.random()*20.0)*10.0)/10.0;
		String meh;
		for (int a = 0; a < 16; a++) {
			meh = notas[a][0] + " " + notas[a][1];
			if (notas[a][0] <= 7.0 || notas[a][1] <=7.0) {
				meh += " 66";
			} else {
				meh += " " + Math.round(notas[a][0]*0.4 + notas[a][1]*0.6); 
			}
			System.out.println(meh);
		}
	}
}
