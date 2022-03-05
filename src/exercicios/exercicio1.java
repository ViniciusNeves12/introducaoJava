package exercicios;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);		
				
				int anos,meses,dias,idadeEmDias;
				String nome;
				
				
				System.out.println("Insira seu nome: ");
				nome = leia.next();
				System.out.println(nome+" insira o valor correpondente a sua idade em anos meses e dias \n");
				System.out.println("Anos: ");
				anos = leia.nextInt();
				System.out.println("Meses: ");
				meses = leia.nextInt();
				System.out.println("Dias: ");
				dias = leia.nextInt();
				
				leia.close();
				
				idadeEmDias = (anos*365)+(meses*30)+dias;
				
				System.out.println(nome+" sua idade em dias é: "+idadeEmDias+" Dias");

	}

}
