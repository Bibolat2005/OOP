package practice;

public class MoveableDirections implements Moveable,MoveableVertical{
	public int x,y;
	
	public MoveableDirections() {
		
	}
	
	public MoveableDirections(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "x"+this.x+" "+"y"+this.y;
	}
	
	public void moveRight() {
		x++;
	}
	
	
	public boolean canMove() {
		return true;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y++;
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y--;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x--;
	}
}
