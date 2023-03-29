package JobRotationRibeirãoPreto;

public class Questa_04 {

	public static void main(String[] args) {

		double distancia = 100, velocidadeCarro = 110, velocidadeCaminhao = 80, tempoCarro, tempoCaminhao, distanciaPercorridaCarro, distanciaPercorridaCaminhao;

		tempoCarro = distancia / velocidadeCarro; 
		
		tempoCaminhao = (distancia / velocidadeCaminhao) + (0.0833 + 0.0833);
		
		distanciaPercorridaCarro = tempoCarro * velocidadeCarro; 
		
		distanciaPercorridaCaminhao = (tempoCaminhao - 0.0833) * velocidadeCaminhao; 

		if (distancia - distanciaPercorridaCarro < distanciaPercorridaCaminhao) {

			System.out.println("O carro estará mais próximo da cidade de Ribeirão Preto.");
		} else {
			System.out.println("O caminhão estará mais próximo da cidade de Ribeirão Preto.");
		}
	}
}
/* No passo seguinte, calculei a distância percorrida pelo carro e pelo caminhão quando eles se cruzam na estrada.
 *  A distância percorrida por ambos foi calculada através da fórmula matemática, porém no caso do caminhão teve que
 *   ser subtraído o tempo dos pedágios. No final, é implementada uma condição de comparação para descobrir quem está 
 *   mais próximo da cidade.*/
