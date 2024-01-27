package problem2;

public class MoveableDirections implements Moveable,MoveableVertical{
	private int x,y;
	
	public MoveableDirections() {
		
	}
	
	public MoveableDirections(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "MoveableDirections [x=" + x + ", y=" + y + "]";
	}
	
	public void moveRight() {
		x++;
	}
	
	public void moveLeft() {
		x--;
	}
	
	public void moveUp() {
		y++;
	}
	
	public void moveDown() {
		y--;
	}

	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		return true;
	}
}
