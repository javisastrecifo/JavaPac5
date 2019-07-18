package pac5person;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Introdueix el nom de la persona: ");
		String nom = reader.nextLine();
		System.out.print("Introdueix l'edat de la persona: ");
		int edat = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix el pes de la persona: ");
		double pes = Double.parseDouble(reader.nextLine());
		System.out.print("Introdueix l'alçada de la persona: ");
		double altura = Double.parseDouble(reader.nextLine());

		System.out.print("Treballes? (S/N) ");
		String respostaYN = reader.nextLine();

		Person primera = new Person(nom, edat);
		primera.setWeight(pes);
		primera.setHeight(altura);
		if ((respostaYN.contentEquals("S")) || (respostaYN.contentEquals("s")))  {
			primera.setWorking(true);
		} else if ((respostaYN.contentEquals("N")) || (respostaYN.contentEquals("n"))) {
			primera.setWorking(false);
		}

		primera.printHealth();

	}

}
