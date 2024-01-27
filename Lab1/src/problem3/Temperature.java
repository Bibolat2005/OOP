package problem3;

public class Temperature {
	double val;
	char scale;
	Temperature(){
		this.val=0;
		this.scale='C';
	}
	Temperature(double val,char scale){
		this.val=val;
		this.scale=scale;
	}
	Temperature(double val){
		this.val=val;
		this.scale='C';
	}
	Temperature(char scale){
		this.val=0;
		this.scale=scale;
	}
	double getCelsius() {
		if(this.scale=='C') {
			return this.val;
		}
		else {
			return 5*(this.val-32)/9;
		}
	}
	double getFahrenheit() {
		if(this.scale=='F') {
			return this.val;
		}
		else {
			return (9*this.val/5)+32;
		}
	}
	void setScale(char scale) {
		this.scale=scale;
	}
	void setValue(double val) {
		this.val=val;
	}
	void setScaleAndValue(char scale,double val) {
		this.scale=scale;
		this.val=val;
	}
	public String toString() {
		return this.val+""+this.scale;
	}
}
