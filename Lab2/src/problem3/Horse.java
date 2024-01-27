package problem3;

public class Horse extends Piece{
	public Horse(Position position) {
		super(position);
	}
	
	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a, b)) {
			if((a.getNum() - 1 == b.getNum() || a.getNum() + 1 == b.getNum()) && (a.getByNum() - 2 == b.getByNum() || a.getByNum() + 2 == b.getByNum())){
				return true;
			}
			if((a.getNum() - 2 == b.getNum() || a.getNum() + 2 == b.getNum()) && (a.getByNum() - 1 == b.getByNum() || a.getByNum() + 1 == b.getByNum())) {
				return true;
			}
		}
		return false;
	}
}
