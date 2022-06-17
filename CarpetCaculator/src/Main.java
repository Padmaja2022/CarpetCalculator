/**
 * 
 */

/**
 * @author PadmajaLanka
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CarpetCalculator carpetCalculator = new CarpetCalculator(5.00F);
		carpetCalculator.addRoom(new Room(10,20));
		String cost1 = carpetCalculator.getTotalCost();
		carpetCalculator.addRoom(new Room(20, 10));
		String cost2 = carpetCalculator.getTotalCost();

		System.out.println("total cost: " + (Float.parseFloat(cost1) + Float.parseFloat(cost2)));
		
		CarpetCalculator carpetCalculator2 = new CarpetCalculator(5.00F, 500.00F);
		carpetCalculator2.addRoom(new Room(10, 20));
		String cost3 = carpetCalculator.getTotalCost();
        carpetCalculator2.addRoom(new Room(20, 10));
        String cost4 = carpetCalculator.getTotalCost();
        carpetCalculator2.addRoom(new Room(10, 10));
        String cost5 = carpetCalculator.getTotalCost();
        System.out.println("total cost: " + (Float.parseFloat(cost3) + Float.parseFloat(cost4)+Float.parseFloat(cost5)));
		
        CarpetCalculator carpetCalculator3 = new CarpetCalculator(5.00F, 500.00F);
//        carpetCalculator3.addRoom(new Room(10, 10));
//        carpetCalculator3.addPercentDiscount(25);
        System.out.println(carpetCalculator3.getTotalCost(new Room(10, 10), 25));

		
		// calculate total cost
		
		
		// calculate installation cost 
		
	

	}

}
