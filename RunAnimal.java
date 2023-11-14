package package1;
import java.util.Scanner;
public class RunAnimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		
		
		while(true) {
		System.out.println("********************");
		System.out.println("Choose an animal");
		System.out.print("Press [B] for Bird, [C] for Cat, or [D] for Dog:");
		String choice = scn.nextLine();    // Using nextLine()
			if(choice.equalsIgnoreCase("B")) {
				b.eat();
				b.sleep();
				b.makeSound();
				System.out.println("********************");
			}
			else if(choice.equalsIgnoreCase("C")) {
				c.eat();
				c.sleep();
				c.makeSound();
				System.out.println("********************");
			}
			else if(choice.equalsIgnoreCase("D")) {
				d.eat();
				d.sleep();
				d.makeSound();
				System.out.println("********************");
			}
			else {
				System.err.println("Invalid input");
				continue;
			}
			System.out.print("Do you want to enter another input Y or N? ");
			String choice2 = scn.nextLine();
			if(choice2.equalsIgnoreCase("Y")) {
				continue;
			}
			else {
				break;
			}
		}
		
	}
}
