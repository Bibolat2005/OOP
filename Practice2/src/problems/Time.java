package problems;
public class Time implements Comparable<Time>{
	public int hour;
	public int minute;
	public int second;
	
	public Time() {
		
	}
	
	
	public int compareTo(Time otherTime) {
        // Compare hours
        if (this.hour != otherTime.hour) {
            return Integer.compare(this.hour, otherTime.hour);
        }

        // Compare minutes
        if (this.minute != otherTime.minute) {
            return Integer.compare(this.minute, otherTime.minute);
        }

        // Compare seconds
        return Integer.compare(this.second, otherTime.second);
    }
	
	public void setHour(int hour) {
		this.hour=hour;
	}
	
	
	public void setMinute(int minute) {
		this.minute=minute;
	}
	
	
	public void setSecond(int second) {
		this.second=second;
	}

	 public boolean isValidHour(int hour) { 
		  if (hour > 23 || hour < 0)
		   return false;
		  return true;
		 }
		 
	 
		 public boolean isValidMinute(int minute) {
		  if (minute > 59 || minute < 0) 
		   return false;
		  return true;
		 }
		 
		 public boolean isValidSecond(int second) {
		  if (second > 59 || second < 0)
		   return false;
		  return true;
		 }
	
		 {
			  hour = 0;
			  minute = 0;
			  second = 0;
			 }
		 
		 
		 
		 public Time(int hour, int minute, int second) {  
			  if (isValidHour(hour) && isValidMinute(minute) && isValidSecond(second)) {
			   this.hour = hour;
			   this.minute = minute;
			   this.second = second; 
			  }
		 }
		 
	public void changeTime() {
		if(second>59) {
			minute+=second/60;
			hour+=minute/60;
			minute=minute%60;
			second=second%60;
		}
		else if(minute>59){
			hour+=minute/60;
			minute=minute%60;
		}
		else if(hour>23) {
			hour=hour%24;
		}
	}


	
	
	public String Universal() {;
		String h=String.valueOf(this.hour);
		String m=String.valueOf(this.minute);
		String s=String.valueOf(this.second);
		if(hour<10) {
			h='0'+h;
		}
		if(minute<10) {
			m='0'+m;
		}
		if(second<10) {
			s='0'+s;
		}
		return h+":"+m+":"+s;
	}
	
	
	
	public String Standard() {
		String mode;
		if(hour<12) {
			mode="A.M";
		}
		else if(hour==12 && minute==0 && second==0) {
			mode="A.M";
		}
		else {
			mode="P.M";
			hour-=12;
		}
		
		
		
		String h = String.valueOf(hour);
		String m = String.valueOf(minute);
		String s = String.valueOf(second);
		if(hour<10) {
			h='0'+h;
		}
		if(minute<10) {
			m='0'+m;
		}
		if(second<10) {
			s='0'+s;
		}
		return h+":"+m+":"+s+" "+mode;
	}
	
	
	
	public void add(Time new_time) {
	    this.second += new_time.second;
	    this.minute += new_time.minute;
	    this.hour += new_time.hour;

	    if (this.second > 59) {
	        this.minute += this.second / 60;
	        this.second %= 60;
	    }

	    if (this.minute > 59) {
	        this.hour += this.minute / 60;
	        this.minute %= 60;
	    }

	    if (this.hour > 23) {
	        this.hour %= 24;
	    }
	}
	
	public String toString() {
		return "Hour"+" "+this.hour+" "+"Minute"+" "+this.minute+" "+"Second"+" "+this.second;
	}

}
