package Activities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

	public void onboard(String passengerName) {
        if(passengers.size() <= maxPassengers) {
            this.passengers.add(passengerName);
        } else {
            System.out.println("Plane is full");
        }
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date(maxPassengers);
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date(maxPassengers);
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}