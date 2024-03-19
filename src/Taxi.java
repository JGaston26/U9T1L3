public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate,tollFee,passengers,electric);
        this.fareCollected = fareCollected;
    }
    public void taxiPrinter(){
        super.carPrinter();
        System.out.println("Discount applied? " + isDiscountApplied());
        System.out.println("Fare collected: " + fareCollected);
    }
    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(numRiders + getPassengers());
        fareCollected += (numRiders * farePerRider);
        if(getPassengers() >= 4 && !isDiscountApplied()){
           setTollFee(getTollFee() *  .50);
           setDiscount(true);
        }
    }

    public double getFareCollected() {
        return fareCollected;
    }
}
