
package problem2;

public class Bird extends MoveableDirections implements Flyable {
    private int z;
    private boolean isAlive;
    
    public Bird() {
    	
    }

    public Bird(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public Bird(boolean isAlive) {
        this.isAlive = isAlive;
    }
    


    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void flyUp() {
        z++;
    }

    @Override
    public void flyDown() {
        z--;
    }

    @Override
    public String toString() {
        return "Bird [x=" + getX() + ", y=" + getY() + ", z=" + z + "]";
    }

	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		return isAlive;
	}

	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		if(canMove()) {
			return true;
		}
		return false;
	}

}

