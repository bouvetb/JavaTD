package Communication;

import java.util.Scanner;

import td1mav.Animal;

public class Menu {

		 public Animal a;
		public void questions() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Quel est le nom de l'animal ?");
			String s = sc.nextLine();
			System.out.println("Quel est l'espece de l'animal ?");
			String s1 = sc.nextLine();
			a = new Animal(s, s1);
			System.out.println(a);
		}
	
	

}
