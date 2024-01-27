package problem5;

public class Series extends Circuit{
	private Circuit R1;
	private Circuit R2;
	double V;
	
	public Series() {	
	}
	public Series(Circuit R1, Circuit R2) {
		this.R1 = R1;
		this.R2 = R2;
	}
	
	public double getResistance() {
		return R1.getResistance() + R2.getResistance();
	}
	
	public double getPotentialDiff() {
		//return (R1.getResistance() * this.getCurrent()) + (R2.getResistance() * this.getCurrent());
		return V;
	}
	
	public void applyPotentialDiff(double V) {
//		double I = v/this.getResistance();
//		R1.applyPotentialDiff(I * R1.getResistance());
//		R2.applyPotentialDiff(I * R2.getResistance());
		this.V=V;
	}
}
