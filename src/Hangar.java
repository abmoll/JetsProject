import java.util.Scanner;

public class Hangar {

	// public static void createArrays() {
	 Scanner keyb = new Scanner(System.in);
	private  Jet[] jets;
	
	

	public  Jet[] initFleet() {

		Pilot[] pilots;
		pilots = new Pilot[5];
		pilots[0] = new Pilot("Moll", 48, 1);
		pilots[1] = new Pilot("Washington", 28, 5);
		pilots[2] = new Pilot("Lincoln", 62, 22);
		pilots[3] = new Pilot("Kennedy", 35, 5);
		pilots[4] = new Pilot("Roosevelt", 53, 11);

		// for (int i = 0; i < pilots.length; i++) {
		// System.out.println(pilots[i]);
		// }

		jets = new Jet[5];

		jets[0] = new Jet("Boeing 747", 425.2, 16_000, 1_000_000);
		jets[1] = new Jet("F-35 Lightning", 1205, 118_000, 5_100_000);
		jets[2] = new Jet("Gloster Meteor", 6550, 248_000, 9_400_000);
		jets[3] = new Jet("BOAC Comet 1", 2800, 818_000, 2_700_000);
		jets[4] = new Jet("Concorde", 1470, 58_000, 6_330_000);
//		jets[5] = new Jet();
		
		return jets;
	}
	
		public  void listFleet() {
		//jets = initFleet();
			
		for (int i = 0; i < jets.length; i++) {
			System.out.println(jets[i]);
		}
		
		
	}



//	public void getMenuChoice() {
//		initFleet();
//		boolean endProgram = false;
//		int choice = 0;
//		initFleet();
//
//		while (!endProgram) {
//
//		System.out.println("Your Jet options are below:\n");
//		System.out.println("1. List fleet");
//		System.out.println("2. View fastest jet");
//		System.out.println("3. View jet with longest range");
//		System.out.println("4. Add jet to fleet");
//		System.out.println("5. Quit");
//		System.out.println("\nWhat is your choice?");
//		System.out.println();
//		choice = keyb.nextInt();
//
//		switch (choice) {
//		case 1:
//			listFleet();
//			break;
//		case 2:
//			listFastestJet();
//			break;
//		case 3:
//			listLongestRangeJet();
//			break;
//		case 4:
//			
//			Jet j5 = new Jet();
//			System.out.println("Enter model: ");
//			j5.model = keyb.next();
//			System.out.println("Enter speed in mph: ");
//			j5.speed = keyb.nextDouble() / 764.2;
//			//double m = Jet.convertToMach(jet.speed);
//			System.out.println("Enter range: ");
//			j5.range = keyb.nextDouble();
//			System.out.println("Enter price: ");
//			j5.price = keyb.nextDouble();
//			addJet(j5);
//			//listFleet();
//			//System.out.println(j5);
////			j5[5] = new Jet(jet.model, jet.speed, jet.range, jet.price);
////			jets[5] = addJet(jet5);
//		
////			Jet[] j6 = listFleet();
////			jets[5] = new Jet();
////			//Jet j4 = new Jet();
////			j6[5] = addJet();
////			//addJet(j4);
////			//j4 = addJet(j4);
//			break;
//		case 5:
//			System.out.println("Thanks for using jets, buddy!");
//			endProgram = true;
//			break;
//		}
//		}
//	}

//	public  void listFastestJet() {
//
//		Jet fastest = jets[0];
//		for (int i = 0; i < jets.length; i++) {
//
//			if (jets[i].speed > fastest.speed)
//				fastest = jets[i];
//		}
//		System.out.println("The fastest jet is: " + fastest);
//
//	}
//
//	//
//	public void listLongestRangeJet() {
//
//		Jet longest = jets[0];
//		for (int i = 0; i < jets.length; i++) {
//
//			if (jets[i].range > longest.range)
//				longest = jets[i];
//		}
//		System.out.println("The longest range jet is: " + longest);
//	}
	
	
	// TODO Auto-generated method stub

	public  Jet addJet(Jet jet) {
		// adds jet object to an array of jets
		
		//Jet jet = new Jet();
		
		//created a temp array that is one size bigger than the OLD list
		//we do this so we can add a "JET" to the list because arrays are not resizable
		Jet[] j = new Jet[jets.length+1];
		
		//iterate through the OLD list setting the values of the NEW list to equal the values of the OLD list
		//we iterate over the OLD list because if we didnt, we would get an INDEX OUT OF BOUND EXCEPTION
		for (int i = 0; i < jets.length; i++) {
			j[i]=jets[i];
		}
		
		//set the last index of the NEW list to equal the new "JET" that is passed in
		j[j.length-1]=jet;
		
		
		//set the OLD "jets" variable in the field to equal the temp list
		jets = j;
		//jet[5] = jet;

		
		//jet[5] = new Jet(jet.model, jet.speed, jet.range, jet.price);
		System.out.println(jet + " has been added.");
		//j2[5]= jet;
		//return jet;
		//jet[5] = jet;
		
		return jet;
	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

}
