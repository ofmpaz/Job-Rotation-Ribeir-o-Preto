package JobRotationRibeirãoPreto;

import java.util.Scanner;
public class Questao_05 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String str = sc.nextLine();

		String strInvertida = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strInvertida += str.charAt(i);
		}

		System.out.println("Palavra invertida: " + strInvertida);

		sc.close();
	}
}



