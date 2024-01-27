package problem5;

public class Resistor extends Circuit{
	private double R;
	private double potentialDifference;
	// modifier
	public Resistor(double R){
		this.R = R;
	}
	
	public double getResistance() {
		return this.R;
	}
	
	public void applyPotentialDiff(double V) {
		this.potentialDifference = V;
	}
	
	public void setPotentialDiff(double potentialDifference) {
		this.potentialDifference = potentialDifference;
	}
	
	public double getPotentialDiff() {
		return potentialDifference;
	}
}
