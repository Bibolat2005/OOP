package bonus;

public class Pawn extends Piece {
	public Pawn(Position position) {
		super(position);
	}
	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a, b)) {
			if(a.getNum() == 2) {
				if(a.getByNum() == b.getByNum() && b.getNum()>= a.getByNum() && b.getByNum()<= a.getByNum()+2 && b.getByNum()<= a.getByNum()+1){
					return true;
				}else {
					return false;
				}
			}
				else {
					if(a.getNum() == b.getNum() && b.getByNum() == a.getByNum() + 1) {
						return true;
					}else {
						return false;
					}
				}
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
