package trabalhoArrey;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	String nome;
	String tel;
	String email;
	static ArrayList<Agenda> Lista = new ArrayList();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b = 0;
		do {
			System.out.println(
					"\n\n==========AGENDA==========\n\nMenu:" + "\n1 -> Inserir Contato" + "\n2 -> Listar Contatos."
							+ "\n3 -> Consultar Contato" + "\n4 -> Deletar Contato" + "\n5 -> Fechar a agenda.");

			b = sc.nextInt();

			switch (b) {

			case 1: {

				System.out.println("\n\n====Inserir====");
				Agenda a1 = new Agenda();
				System.out.println("\nNome: ");
				a1.nome = sc.next();

				System.out.println("Telefone: ");
				a1.tel = sc.next();

				System.out.println("Email: ");
				a1.email = sc.next();

				Lista.add(a1);

				System.out.println("\nContato inserido!");
				break;
			}

			case 2: {

				System.out.println("\n\n====Lista====");

				for (int i = 0; i < Lista.size(); i++) {

					System.out.println("\nNome: " + Lista.get(i).nome);
					System.out.println("Telefone: " + Lista.get(i).tel);
					System.out.println("Email: " + Lista.get(i).email);

				}
				break;

			}

			case 3: {

				System.out.println("\n\n====Pesquisar====");
				String a = sc.next();

				for (int i = 0; i < Lista.size(); i++) {
					if (a.equals(Lista.get(i).nome)) {
						System.out.println("\nNome: " + Lista.get(i).nome);
						System.out.println("Telefone: " + Lista.get(i).tel);
						System.out.println("Email: " + Lista.get(i).email);

					}
				}
				break;

			}
			case 4: {

				System.out.println("\n\n====Deletar====");
				String a = sc.next();

				for (int i = 0; i < Lista.size(); i++) {
					if (a.equals(Lista.get(i).nome)) {
						Lista.remove(i);
						System.out.println("Contato deletado!");
					}
				}
				break;
			}
			}
		} while (b != 5);
		System.out.println("Obrigado por usar a agendo do Cimy :D");
		System.exit(0);
	}
}