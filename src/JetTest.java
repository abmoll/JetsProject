import java.util.Scanner;

public class JetTest {
	
	Hangar hangar = new Hangar();
	Barracks barracks = new Barracks();
	Scanner keyb = new Scanner(System.in);
	public static void main(String[] args) {
		JetTest app = new JetTest();
		app.getMenuChoice();
	}
	
	public void getMenuChoice() {
		hangar.initFleet();
		//barracks.initBarracks();
		boolean endProgram = false;
		int choice = 0;

		while (!endProgram) {

		System.out.println("Your Jet options are below:\n");
		System.out.println("1. List fleet");
		System.out.println("2. View fastest jet");
		System.out.println("3. View jet with longest range");
		System.out.println("4. Add jet to fleet");
		System.out.println("5. Quit");
		System.out.println("\nWhat is your choice?");
		System.out.println();
		choice = keyb.nextInt();

		switch (choice) {
		case 1:
			hangar.listFleet();
			break;
		case 2:
			listFastestJet();
			break;
		case 3:
			listLongestRangeJet();
			break;
		case 4:
			addJet();
			break;
		case 5:
			System.out.println("Thanks for using jets, buddy!");
			endProgram = true;
			break;
		}
		}
	}
	
	public  void listFastestJet() {
		Jet[] jets = hangar.getJets();
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {

			if (jets[i].speed > fastest.speed)
				fastest = jets[i];
		}
		System.out.println("The fastest jet is: " + fastest);

	}

	//
	public void listLongestRangeJet() {

		Jet[] jets = hangar.getJets();
		Jet longest = jets[0];
		for (int i = 0; i < jets.length; i++) {

			if (jets[i].range > longest.range)
				longest = jets[i];
		}
		System.out.println("The longest range jet is: " + longest);
	}
	
	public void addJet() {
		Jet j5 = new Jet();
		System.out.println("Enter model: ");
		j5.model = keyb.next();
		System.out.println("Enter speed in mph: ");
		j5.speed = keyb.nextDouble() / 764.2;
		//double m = Jet.convertToMach(jet.speed);
		System.out.println("Enter range: ");
		j5.range = keyb.nextDouble();
		System.out.println("Enter price: ");
		j5.price = keyb.nextDouble();
		hangar.addJet(j5);
	}

}
