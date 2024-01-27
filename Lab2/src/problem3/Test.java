package problem3;

public class Test {

	public static void main(String[] args) {
		//Piece r = new Rock();
		//System.out.println(r.isLegalMove(new Position(3,'A'), new Position(4,'A')));
		//Piece k = new King();
		//System.out.println(k.isLegalMove(new Position(4,'E'), new Position(5,'D')));
		
	
		
		 Position position1 = new Position(1, 'A');
	     Position position2 = new Position(1, 'A');
	     Piece king1 = new King(position1);
	     Piece king2 = new King(position2);
	     boolean equalsResult = king1.equals(king2);
	        System.out.println("Equals: " + equalsResult);
	      
	     int hashCode1 = king1.hashCode();
	     int hashCode2 = king2.hashCode();
	     System.out.println("HashCode 1: " + hashCode1);
	     System.out.println("HashCode 2: " + hashCode2);
	     
	     String toString1 = king1.toString();
	     String toString2 = king2.toString();
	     System.out.println("1: " + toString1);
	     System.out.println("2: " + toString2);
	     

	     Position a = new Position(4,'D');
	     Queen queen = new Queen(a);
	     Position b = new Position(2,'C');
	     System.out.println(queen.isLegalMove(a, b));
	     
	}
}
