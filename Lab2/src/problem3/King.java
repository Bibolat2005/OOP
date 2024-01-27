package problem3;

public class King extends Piece{
	public King(Position position) {
		super(position);
	}

	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a, b)) {
			if(b.getByNum() >= a.getByNum() -1 && b.getByNum() <= a.getByNum() + 1 && b.getNum() >= a.getNum() -1 && b.getNum() <= a.getNum()+1) {
				return true;
			}else {
				return false;
			}			
		}
		return false;
	}
}
