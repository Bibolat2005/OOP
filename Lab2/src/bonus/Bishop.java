package bonus;

public class Bishop extends Piece{
	public Bishop(Position position) {
		super(position);
	}
	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a, b)) {
			if(Math.abs(a.getNum() - b.getNum()) == Math.abs(a.getByNum() - b.getByNum())) {
				return true;
			}
			return false;
		}
		return false;
	}
	public int hashCode() {
		return super.hashCode();
	}
	public boolean equals(Object o) {
		return super.equals(o);
	}
}
