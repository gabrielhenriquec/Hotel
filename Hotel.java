import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {

		int diaria, valordiaria = 300, total;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a quantidade de diárias: ");
		diaria = leia.nextInt();

		if (diaria < 15) {
			total = valordiaria + (diaria * 20);
			System.out.println("O total a ser pago é:" + total);
		}
		
		if (diaria == 15) {
			total = valordiaria + (diaria * 14);
			System.out.println("O total a ser pago é:" + total);
		}
		
		if (diaria > 15) {
			total = valordiaria + (diaria * 12);
			System.out.println("O total a ser pago é: " + total);
		}
	}

}
