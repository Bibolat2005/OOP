package problem5;

public class Parallel extends Circuit{
	private Circuit R1;
	private Circuit R2;
	double V;
	Parallel(Circuit R1, Circuit R2){
		this.R1 = R1;
		this.R2 = R2;
	}
	
	public double getResistance() {
		return (R1.getResistance() * R2.getResistance()) / (R1.getResistance() + R2.getResistance());
	}
	
	public double getPotentialDiff() {
		//return R1.getPotentialDiff();
		return V;
	}
	
	public void applyPotentialDiff(double V) {
//		R1.applyPotentialDiff(V);
//		R2.applyPotentialDiff(V);
		this.V=V;
	}
}
