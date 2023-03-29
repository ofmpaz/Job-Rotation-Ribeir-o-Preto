package JobRotationRibeirãoPreto;

import java.util.Scanner;

public class Questao_02 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static boolean testandoNumeroEmFibonacci(int _number) {
		
		int number1 = 0, number2 = 1, number3 = 0, aux = 0;
		
		if(number1 == _number || number2 == _number) {
			return true;
		}
		
		while(aux < 30) {
			
			number3 = number1 + number2;
			
			if(number3 == _number) {
				return true;
			}
			
			number1 = number2;
			number2 = number3;
			
			aux++;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int number;
		
		if(testandoNumeroEmFibonacci(number = scan.nextInt())) {
			System.out.println("Numero pertence a sequencia de Fibonacci");
		}else {
			System.out.println("Numero não pertence a sequencia de Fibonacci");
		}
		
	}

}
