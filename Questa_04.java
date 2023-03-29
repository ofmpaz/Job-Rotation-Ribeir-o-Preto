package JobRotationRibeir�oPreto;

public class Questa_04 {

	public static void main(String[] args) {

		double distancia = 100, velocidadeCarro = 110, velocidadeCaminhao = 80, tempoCarro, tempoCaminhao, distanciaPercorridaCarro, distanciaPercorridaCaminhao;

		tempoCarro = distancia / velocidadeCarro; 
		
		tempoCaminhao = (distancia / velocidadeCaminhao) + (0.0833 + 0.0833);
		
		distanciaPercorridaCarro = tempoCarro * velocidadeCarro; 
		
		distanciaPercorridaCaminhao = (tempoCaminhao - 0.0833) * velocidadeCaminhao; 

		if (distancia - distanciaPercorridaCarro < distanciaPercorridaCaminhao) {

			System.out.println("O carro estar� mais pr�ximo da cidade de Ribeir�o Preto.");
		} else {
			System.out.println("O caminh�o estar� mais pr�ximo da cidade de Ribeir�o Preto.");
		}
	}
}
/* No passo seguinte, calculei a dist�ncia percorrida pelo carro e pelo caminh�o quando eles se cruzam na estrada.
 *  A dist�ncia percorrida por ambos foi calculada atrav�s da f�rmula matem�tica, por�m no caso do caminh�o teve que
 *   ser subtra�do o tempo dos ped�gios. No final, � implementada uma condi��o de compara��o para descobrir quem est� 
 *   mais pr�ximo da cidade.*/
