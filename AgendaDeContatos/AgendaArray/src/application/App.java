package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key;

		String nome, telefone, data, email, mes;
		String busca;
		Agenda agenda = new Agenda();
		boolean exit = false;
		int cont = 0, cont2 = 1;

		while (!exit) {
			System.out.println();
			System.out.println(
					"Escolha alguma das opcoes:\n1.adcionar contato \n2.consultar contato \n3.mostrar todos contatos \n4.Aniversariantes do mes \n5.exit");
			key = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (key) {
			case 1:

				System.out.println("Informe os dados:\nNome:");
				nome = sc.nextLine();
				System.out.println("Telefone:");
				telefone = sc.nextLine();
				System.out.println("Data (DD/MM/AAAA):");
				data = sc.nextLine();
				System.out.println("Email:");
				email = sc.nextLine();

				agenda.add(nome, telefone, data, email);
				System.out.print("contato: " + nome + " salvo!");
				cont++;
				break;

			case 2:
				System.out.println("Informe o nome do contato: ");
				busca = sc.nextLine();
				System.out.println(agenda.consultar(busca));
				break;

			case 3:
				int i = 0;
				for (; i <= cont; i++) {
					System.out.println(agenda.ListarTodos(i));
					System.out.println();
				}
				break;

			case 4:
				System.out.print("Informe o mes: ");
				mes = sc.nextLine();
				int j = 0;
				for (; j <= cont2; j++) {
					System.out.println(agenda.aniversario(mes, j));
					cont2++;
				}
				break;

			case 5:
				exit = true;
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		}

		sc.close();
	}

}
