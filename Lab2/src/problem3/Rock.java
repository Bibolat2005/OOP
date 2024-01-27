package problem3;

public class Rock extends Piece{
	public Rock(Position position) {
		super(position);
	}

	public boolean isLegalMove(Position a, Position b) {
		if(super.correctPos(a, b)) {
			if(a.getLetter() == b.getLetter()) {
				return true;
			}
			else if(a.getNum() == b.getNum()) {
				return true;
			}
		}
		return false;
	}
}
