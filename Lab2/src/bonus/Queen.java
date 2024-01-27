package bonus;

public class Queen extends Piece{
	public Queen(Position position) {
        super(position);
    }
	 public boolean isLegalMove(Position a, Position b) {
	        Bishop bishop = new Bishop(a);
	        Rock rock = new Rock(a);

	        return bishop.isLegalMove(a, b) || rock.isLegalMove(a, b);
	    }
	 public int hashCode() {
			return super.hashCode();
		}
	 public boolean equals(Object o) {
			return super.equals(o);
		}
}


