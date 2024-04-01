public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate,tollFee,passengers,electric);
        this.fareCollected = fareCollected;
    }
    @Override
    public void printInfo(){
        super.printInfo();
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
    public boolean chargeAndDropOffRiders(double fare){
        int riders = getPassengers()-1;
        double totalFare = riders * fare;
        fareCollected += totalFare;

        boolean success = dropOffPassengers(riders);
        return success;
    }
    public double getFareCollected() {
        return fareCollected;
    }
    @Override
    public void turnOnLights(){
        System.out.println("Headlights on and Taxi light on!");
    }
}
