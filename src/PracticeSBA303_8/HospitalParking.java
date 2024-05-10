package PracticeSBA303_8;

public class HospitalParking implements ParkingSystem {
    private int time;
    private double surcharge = .2;

    public HospitalParking(int time) {
        this.time = time;
    }

    @Override
    public double processTicket() {
        if (this.time < 5) {
            return TWENTY_FOUR + TWENTY_FOUR * this.surcharge;
        } else if (this.time < 17) {
            return MORNING + MORNING * this.surcharge;
        } else {
            return NIGHTLY + NIGHTLY * this.surcharge;
        }
    }

    @Override
    public String toString() {
        return String.format("Price for hospital parking is $%.2f", processTicket());
    }
}
