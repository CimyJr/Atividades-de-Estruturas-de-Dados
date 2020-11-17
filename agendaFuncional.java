package trabalhoArrey;

import java.util.Scanner;

public class agendaFuncional {
	String nome;
	String tel;
	String email;
	static agendaFuncional[] a = new agendaFuncional[100]; //O principal requisito era usar a estrutura Arrey
	static int cont;

	public static void inserir(agendaFuncional x) {
		a[cont] = x;
		cont++;
		System.out.println("\nContato registrado :)");
	}

	public static void listar() {
		if (cont == 0)
			System.out.println("\nNenhum contato registrado :(");

		else {
			for (int i = 0; i < cont; i++) {
				System.out.println("\n\nNome: " + a[i].nome);
				System.out.println("Telefone: " + a[i].tel);
				System.out.println("Email: " + a[i].email);
			}
		}
	}

	public static void consultar(String j) {
		boolean supp = false;
		if (cont == 0)
			System.out.println("\nNenhum contato registrado :(");
		else {
			for (int i = 0; i < cont; i++) {
				if (a[i].nome.equals(j)) {
					System.out.println("\n\nNome: " + a[i].nome);
					System.out.println("\nTelefone: " + a[i].tel);
					System.out.println("\nEmail: " + a[i].email);
					supp = true;
				}
			}
			if (supp == false)
				System.out.println("\nContato não encontrado :(");
		}
	}

	public static void deletar(String j) {
		boolean supp = false;
		if (cont == 0)
			System.out.println("\nNenhum contato registrado :(");
		else {
			for (int i = 0; i < cont; i++) {
				if (a[i].nome.equals(j)) {
					System.out.println("\n\nNome: " + a[i].nome);
					System.out.println("Telefone: " + a[i].tel);
					System.out.println("Email: " + a[i].email);
					for (; (i + 1) < cont; i++) {
						a[i] = a[i + 1];
					}
					cont--;

					System.out.println("\nContato deletado :(");
					supp = true;

					a[cont + 1] = null;
				}
			}
			if (supp == false)
				System.out.println("\nContato não encontrado :(");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b = 0;
		do {

			System.out.println("\n\n==========AGENDA==========\n\nMenu:" + "\n1 -> Inserir na agenda."
					+ "\n2 -> Consultar a agenda." + "\n3 -> Deletar da agenda." + "\n4 -> Listar a agenda."
					+ "\n5 -> Fechar a agenda.");

			b = sc.nextInt();

			switch (b) {

			case 1: {

				System.out.println("\n\n====Inserir====");
				agendaFuncional c = new agendaFuncional();
				System.out.println("\nNome: ");
				c.nome = sc.next();

				System.out.println("Telefone: ");
				c.tel = sc.next();

				System.out.println("Email: ");
				c.email = sc.next();

				agendaFuncional.inserir(c);
				break;
			}
			case 4: {
				System.out.println("\n\n====Lista====");
				agendaFuncional.listar();
				break;
			}
			case 2: {
				System.out.println("\n\n====Procurar====");
				String r = sc.next();
				agendaFuncional.consultar(r);
				break;
			}
			case 3: {
				System.out.println("\n\n====Deletar====");
				String c = sc.next();
				agendaFuncional.deletar(c);
				break;
			}
			}
		} while (b != 5);
		System.out.println("\nObrigado por usar a agenda do Cimy:D");
	}
}