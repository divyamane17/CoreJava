package abstraction;

public class ResidentialBill extends Bill {
	
@Override
public float generateBill(int units) {
	return units * 10.0F;
}

}
