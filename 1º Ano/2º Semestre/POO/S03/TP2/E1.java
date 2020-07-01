package A03;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		int op;
		while(true){
			System.out.println("0 - terminar");
			System.out.println("1 - QQCoisa1");
			// ...
			System.out.println("Opcao?");
			op = kb.nextInt();
			
			if(op == 0){
				break;
			}
			else if(op == 1){
				System.out.println("Escolhida opcao 1");
			}
			else{
				System.out.println("opcao nao implentada");
			}
		}
		do{
			System.out.println("0 - terminar");
			System.out.println("1 - QQCoisa1");
			// ...
			System.out.println("Opcao?");
			op = kb.nextInt();
			
			switch(op){
			case 0:
				System.out.println("FIM");
				break;
			case 1:
				System.out.println("Escolhida opcao 1");
				break;
			case 2:
				System.out.println("Escolhida opcao 2");
				break;
			default:
				System.out.println("opcao nao implentada");
			}
		}while(op != 0);
	}

}
