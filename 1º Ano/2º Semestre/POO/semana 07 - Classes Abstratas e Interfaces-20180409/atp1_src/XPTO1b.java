package atp1;

public class XPTO1b {
	public static void main(String[] args) {
		String x = "23,marco,2018";
		int n = 0, p;
		String k = x + '+' + 6 + 'k';
		System.out.println(k);
		String y[] = x.split(",");
		System.out.println(y.length);
		for(String s : y){
			n = n + s.length();
		}
		System.out.println(n);
		String z = new String();
		for(p = 0 ; p < x.length() ; p++){
			char c = x.charAt(p);
			if(c != ','){
				z = z + c;
			}
		}
		System.out.println(z);
		System.out.println(p);
	}
}
