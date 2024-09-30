package abstraction;

public class MainBill {
	
	public static void main(String[]args) {
		Bill bill = new ResidentialBill();
		System.out.println("your ele Bill is : " +bill.generateBill(800));
		
	}

}
