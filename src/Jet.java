
public class Jet {
	
	String model;
	double speed;
	 double range;
	 double price;
	 Pilot pilot;
	
	
	//constructors

	public Jet(String model, double speed, double range, double price) {
		this.model = model;
		this.speed = convertToMach(speed);
		this.range = range;
		this.price = price;
		//this.pilot = pilot;
	}

	public Jet() {
		
	}


	public static double convertToMach(double mph) {
		
		double speedMach = mph / 764.2;
		return speedMach;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public double getSpeed() {
		return speed;
	}




	public void setSpeed(double speed) {
		this.speed = speed;
	}




	public double getRange() {
		return range;
	}




	public void setRange(double range) {
		this.range = range;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public Pilot getPilot() {
		return pilot;
	}




	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
}
