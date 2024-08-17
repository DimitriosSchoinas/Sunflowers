import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Girassois girassois = new Girassois();
		girassois.addValoresVetor();
			
		
		int N = in.nextInt();
		in.nextLine();
		
		
		for(int i = 0; i < N; i++) {
			int s1 = in.nextInt();
			int s2 = in.nextInt();
			in.nextLine();
			girassois.verifyIfFake(s1, s2);
			if(girassois.verifyIfFake(s1, s2) == true) {
				System.out.println("OK");
			}
			else {
				System.out.println("FAKE");
			}
		}
		
		
	}

}
