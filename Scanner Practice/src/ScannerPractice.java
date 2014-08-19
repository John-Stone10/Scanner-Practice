import java.util.Scanner;
public class ScannerPractice {

	public static void main(String[] args) {
		Scanner jim = new Scanner (System.in);
		int cat ;
		double sam;
		int cat2;
		
		System.out.println( "You are in a dark room with two doors, which one do you choose? (1)Door 1 (2)door 2");
		cat = jim.nextInt();
		if (cat == 1)
			System.out.println("You fall through the floor and die");
		System.exit(0);
		
		
		if (cat == 2)
			System.out.println("You enter a theme park!");
		
		System.out.println("Do youb wanna ride the rollercoaster or naaa? (1)Yes (2)Naaa");
		cat2 = jim.nextInt();
		
		if(cat2 == 2)
			System.out.println("You stay safe and sound!");
		
		if(cat2 == 1)
			System.out.println("You fall off and break all ur bones");
		
		
		

	}

}
