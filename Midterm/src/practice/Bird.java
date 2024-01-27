package practice;

public class Bird extends MoveableDirections implements Flyable{
	public int z;
	public boolean isAlive;
	public Bird() {
		
	}
	
	public Bird(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	
	public Bird(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public String toString() {
		return "z"+z;
	}
	
	public void flyUp() {
		z++;
	}
	
	public void flyDown() {
		z--;
	}
	
	public boolean canMove() {
		return isAlive;
	}
	
	public boolean canFly() {
		if(canMove()) {
			return true;
		}
		return false;
	}
}