package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int key;
		String nome, telefone, data, mes, email, busca;
		boolean exit = false;
		boolean encontrado;

		List<Contato> agenda = new ArrayList<>();

		while (!exit) {
			System.out.println();
			System.out.println(
					"Escolha alguma das opcoes:\n1. Adicionar contato \n2. Consultar contato \n3. Mostrar todos contatos \n4. Aniversariantes do mes \n5. Exit");
			key = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (key) {
			case 1:
				System.out.println("Informe os dados:\nNome:");
				nome = sc.nextLine();
				System.out.println("Telefone:");
				telefone = sc.nextLine();
				if (telefone == "") {
					telefone = "Indisponivel";
				}
				System.out.println("Data (DDMMAAAA):");
				data = sc.nextLine();
				if (data == "") {
					data = "Indisponivel";
				}
				System.out.println("Email:");
				email = sc.nextLine();
				if(email == "") {
					email = "Indisponivel";
					}
				agenda.add(new Contato(nome, telefone, data, email));
				System.out.print("O contato: " + nome + "foi salvo!");
				break;
			case 2:
				System.out.println("Informe o nome do contato: ");
				busca = sc.nextLine();
				encontrado = false;
				for (Contato contato : agenda) {
					if (contato.getNome().equalsIgnoreCase(busca)) {
						System.out.println(contato);
						encontrado = true;
					}
				}
				if (!encontrado) {
					System.out.println("Nenhum contato com esse nome");
				}
				break;

			case 3:
				if (agenda.isEmpty()) {
					System.out.println("A agenda está vazia.");
				} else {
					for (Contato contato : agenda) {
						System.out.println(contato);
						System.out.println();
					}
				}
				break;
			case 4:
				System.out.print("Informe o mês: ");
				mes = sc.nextLine();
				boolean encontrados = false;
				for (Contato contato : agenda) {
					if (contato.getData().substring(2, 4).equals(mes)) {
						System.out.println(contato.getNome() + ", " + contato.getTelefone()
								+ ", Faz aniversário neste mês: " + mes);
						encontrados = true;
					}
				}
				if (!encontrados) {
					System.out.println("Sem aniversariantes neste mês.");
				}
				break;

			case 5:
				exit = true;
				break;
			default:
				System.out.println("error");
				break;
			}
		}
		sc.close();
	}

}
