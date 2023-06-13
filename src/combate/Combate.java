package combate;

import java.util.Scanner;

public class Combate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int turno;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.println("Nome: ");
		String camp01Nome = sc.nextLine();
		System.out.println("Vida inicial: ");
		int camp01Vida = Integer.parseInt(sc.nextLine());
		System.out.println("Ataque: ");
		int camp01Ataque = Integer.parseInt(sc.nextLine());
		System.out.println("Armadura: ");
		int camp01Armadura = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.println("Nome: ");
		String camp02Nome = sc.nextLine();
		System.out.println("Vida inicial: ");
		int camp02Vida = Integer.parseInt(sc.nextLine());
		System.out.println("Ataque: ");
		int camp02Ataque = Integer.parseInt(sc.nextLine());
		System.out.println("Armadura: ");
		int camp02Armadura = Integer.parseInt(sc.nextLine());
		
		
		Champion campeao1 = new Champion(camp01Nome, camp01Vida, camp01Ataque, camp01Armadura);
		Champion campeao2 = new Champion(camp02Nome, camp02Vida, camp02Ataque, camp02Armadura);
		
		System.out.println("Quantos turnos você deseja executar?");
		turno = sc.nextInt();
		
		for (int i = 1; i <= turno; i++) {
			if(campeao1.getLife() > 0 && campeao2.getLife() > 0) {
				System.out.printf("Resultado do turno %d:\n",i);
				
				campeao1.takeDamage(campeao2);
				campeao2.takeDamage(campeao1);
				
				System.out.println(campeao1.status());
				System.out.println(campeao2.status());
			}
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
		
	}

}
