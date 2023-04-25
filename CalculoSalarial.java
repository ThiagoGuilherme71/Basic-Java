package br.ucsal;

import java.util.Scanner;

public class CalculoSalarial {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int contador = 0;

		double salarioIncial, aumento, salarioAumento, impostoIr, impostoInss, impostos, salarioIR, salarioFinal;

		String nome;

		do {

			System.out.println("Informe seu primiro nome: ");

			nome = sc.next();

			System.out.println("informe o valor do seu salario: ");

			salarioIncial = sc.nextDouble();

			// calculando aumento salarial:


			if(salarioIncial > 15000) {

				aumento = salarioIncial * 0.0993 ;

			}

			else if (salarioIncial > 10000) {

				aumento = salarioIncial * 0.0875 ;

			}

			else if (salarioIncial > 5000) {

				aumento = salarioIncial * 0.0825 ;

			}

			else if (salarioIncial > 4000) {

				aumento = salarioIncial * 0.0820 ;

			}

			else if (salarioIncial > 1000) {

				aumento = salarioIncial * 0.0038 ;

			}else {

				aumento = 0;

			}

			salarioAumento = salarioIncial + aumento;


			System.out.printf("seu aumento é de %.2f%n", aumento);

			//calculando imposto de renda:

			if (salarioAumento > 15000) {

				impostoIr = salarioAumento * 0.3;

				if(impostoIr > 5000) {

					impostoIr = 5000;}

			}else if (salarioAumento > 10000) {

				impostoIr = salarioAumento * 0.2;

				if(impostoIr > 3000) {

					impostoIr = 3000;}

			}else if (salarioAumento > 5000) {

				impostoIr = salarioAumento * 0.1;

				if(impostoIr > 1000) {

					impostoIr = 1000;}


			} else {

				impostoIr = 0 ;

			}

			salarioIR = salarioAumento - impostoIr;


			System.out.printf("o valor do seu imposto de renda é: %.2f%n", impostoIr );

			//calculo do imposto INSS:


			if (salarioIR > 15000) {

				impostoInss = salarioIR * 0.12;

				if(impostoInss > 5000) {

					impostoInss = 5000;}

			}else if (salarioIR > 7500) {

				impostoInss = salarioIR * 0.10;

				if(impostoInss > 2500) {

					impostoInss = 2500;}

			}else if (salarioIR > 3750) {

				impostoInss = salarioIR * 0.09;

				if(impostoInss > 500) {

					impostoInss = 500;}

			}else {

				impostoInss = salarioIR * 0.05;

				if(impostoInss > 250) {

					impostoInss = 250;}

			}


			salarioFinal = salarioIR - impostoInss;


			System.out.printf("o valor do seu INSS é:  %.2f%n", impostoInss );

			System.out.printf("Ola, %s seu salario liquido atual é: %.2f%n",nome, salarioFinal);


			impostos = impostoIr + impostoInss;


			System.out.printf("valor dos impostos somados: %.2f%n", impostos);

			contador++;

		}while(contador < 4);

sc.close();
		}


	}


