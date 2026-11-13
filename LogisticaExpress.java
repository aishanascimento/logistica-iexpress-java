package frete;

import java.util.Scanner;

public class LogisticaExpress {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double distancia;
		double peso;
		int cliente;
		int urgente;
		double totalfrete = 0;
		int totalurgente = 0;
		double valorFrete;

		System.out.println("Informe a distância(km) ou digite 0 para sair: ");
		distancia = entrada.nextDouble();
		
		while (distancia != 0) {

			System.out.println("Informe o peso(kg): ");
			peso = entrada.nextDouble();

			System.out.println("Informe se você é cliente 1-Comum / 2-Premium:");
			cliente = entrada.nextInt();

			System.out.println("Informe se a entrega é urgente - 1: urgente / 2: não urgente:");
			urgente = entrada.nextInt();

			valorFrete = calcularFrete(distancia, peso, cliente, urgente);

			if (valorFrete == -2) {
				System.out.println("ERRO: Dados inválidos informados (distância, peso ou opções incorretas).");
			} 
			else if (valorFrete == -1) {
				System.out.println("ERRO: Pacote muito pesado para entrega urgente.");
			} 
			else {
				System.out.println("O valor do frete é R$ " + valorFrete);
				
				totalfrete = totalfrete + valorFrete;

				if (urgente == 1) {
					totalurgente++;
				}
			}
			
			System.out.println("Informe a distância(km) do próximo produto (ou 0 para encerrar): ");
			distancia = entrada.nextDouble();

		}
		
		System.out.println("--- RESUMO DO DIA ---");
		System.out.println("O total faturado em fretes válidos no dia foi R$ " + totalfrete);
		System.out.println("A quantidade total de entregas urgentes realizadas foi " + totalurgente + " entregas.");
		
		entrada.close();
	}
	
	public static double calcularFrete(double distancia, double peso, int cliente, int urgente) {
		
		if (distancia <= 0 || peso <= 0 || (cliente != 1 && cliente != 2) || (urgente != 1 && urgente != 2)) {
			return -2;
		}
		
		if (peso > 30 && urgente == 1) {
			return -1;
		}
		
		double frete = distancia * 2 + peso * 1.50;
		
		if (cliente == 2) {
			frete = frete - (frete * 0.10);
		}
		
		if (urgente == 1) {
			frete = frete + 15;
		}
		
		return frete;
	}

}