package lab;

public class RoadTripLog {
	public String Trip;
	public double Dis;
	public double fuel;
	
	public RoadTripLog (String Trip) {
		this.Trip = Trip;
	}

	public double getTotalDistance() {
		return this.Dis;
		
	}

	public double getTotalFuel() {
		return this.fuel;

	}

	public double getMPG() {
		return this.Dis/this.fuel;
	}

	public double addDistance(double Add) {
		this.Dis += Add;
		return this.Dis;
	}

	public void addFuel(double fuel) {
			this.fuel += fuel;
			
	}

}
