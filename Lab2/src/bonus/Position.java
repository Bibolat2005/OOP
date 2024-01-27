package bonus;
import java.util.Objects;

public class Position {
	// modifiers
	private int num;
	private char letter;
	
	Position(int num, char letter){
		this.num = num;
		this.letter = letter;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public char getLetter() {
		return letter;
	}
	
	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	// modifier
//	 public int getByNum() {
//		if(letter == 'A') return 1;
//		if(letter == 'B') return 2;
//		if(letter == 'C') return 3;
//		if(letter == 'D') return 4;
//		if(letter == 'E') return 5;
//		if(letter == 'F') return 6;
//		if(letter == 'G') return 7;
//		if(letter == 'H') return 8;
//		return 0;
//	}
	//ASCII A=65, B=66 B=66-65+1=2 
	public int getByNum() {
	    if (letter >= 'A' && letter <= 'H') {
	        return letter - 'A' + 1;
	    }
	    return 0;
	}

	 
	 // toString
	 public String toString() {
		 return "Number : " + this.num +" " + "Letter : " + this.letter;
	 }
	 
	 // equals
	 
	 public boolean equals(Object o) {
		 if(this==o) return true;
		 if(o==null) return false;
		 if(this.getClass() != o.getClass()) return false;
		 Position p = (Position)o;
		 return this.num == p.num && this.letter == p.letter;
	 }
	 // hashCode
	 public int hashCode() {
		 return Objects.hash(num, letter);
	 }
}

