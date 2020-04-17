package senai;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o nome da pessoa:");
		String nome = sc.nextLine();
		System.out.println("Digite a idade da pessoa:");
		int idade = sc.nextInt();
		System.out.println("Digite a altura da pessoa:");
		double altura = sc.nextDouble();
		System.out.println("Digite o peso da pessoa:");
		double peso = sc.nextDouble();
		System.out.println("Digite o gênero da pessoa ('M','F')");
		char genero = sc.next().charAt(0);
		System.out.println("Digite o email");
		sc.nextLine();
		String email = sc.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, idade, altura, peso, genero, email);
		System.out.println(pessoa);
		
		System.out.println("Digite o tempo de envelhecimento:");
		pessoa.envelhecer(sc.nextInt());
		
		System.out.println("Digite quantide em kilos pra engordar:");
		pessoa.engordar(sc.nextDouble());
		
		System.out.println("Digite o valor da altura a ser encolhido:");
		pessoa.encolher(sc.nextDouble());
		
		System.out.println("Digite um novo email:");
		sc.nextLine();
		pessoa.setEmail(sc.nextLine());
		
		System.out.print( pessoa);
		sc.close();
	}

}
