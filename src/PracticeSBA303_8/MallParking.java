package PracticeSBA303_8;

public class MallParking implements ParkingSystem {
    private int time;
    private double surcharge = .1;

    public MallParking(int time) {
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
        return String.format("Price for mall parking is $%.2f", processTicket());
    }
}
