package problem1;

public class Horse extends Animal{
	private String name;
	//private int age;
	private String breed;
	Horse(){
		super();
		this.breed="default";
	}
	Horse(String name,int age,String breed){
		super(name,age);
		this.breed=breed;
	}
	public String toString() {
		return super.toString()+ " ,and breed is "+this.breed;
	}

	
	
	public void jump() {
		System.out.println("jump");
	}
	/*override*/
	public String voice(String s) {
		return "the voice of hourse is "+super.voice(s);
	}
	/*override*/
	public int distance(int v,int t) {
		return super.distance(v, t);
	}
	public double distance(double v,double t) {
		return super.distance(v, t);
	}
	
	
	 public String getBreed() {
	        return breed;
	    }

	    public void setBreed(String breed) {
	        this.breed = breed;
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    public void setName(String name) {
	    	this.name=name;
	    }
}
