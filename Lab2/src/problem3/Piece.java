package problem3;
import java.util.Objects;
public abstract class Piece {
	 private Position position;

	    public Piece(Position position) {
	        this.position = position;
	    }

	    public Position getPosition() {
	        return position;
	    }

	    public void setPosition(Position position) {
	        this.position = position;
	    }
	
	public abstract boolean isLegalMove(Position a, Position b);
	public boolean correctPos(Position a, Position b) {
		if(a.getNum() >= 1 && a.getNum() <= 8 && a.getByNum() >= 1 && a.getByNum() <= 8 &&
		   b.getNum() >= 1 && b.getNum() <= 8 && b.getByNum() >= 1 && b.getByNum() <= 8) {
			return true;
		}
		return false;	
	}
	
	// equals
	public boolean equals(Object o) {
		 if (this == o) return true;
	     if (o == null || getClass() != o.getClass()) return false;
	     Piece piece = (Piece) o;
	     return this.position.equals(piece.position);
	}
	
	// hashCode
	
	 public int hashCode() {
	        return Objects.hash(position);
	 }
	
	// toStings
	 public String toString() {
	        return "Piece at " + position;
	    }
	
}
