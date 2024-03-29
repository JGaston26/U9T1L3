public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }
    public void carPrinter(){
        System.out.println("Licence plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is Electric: " + electric);
    }
    public boolean dropOffPassengers(int numOut){
        if(numOut < getPassengers()){
            setPassengers(getPassengers() - numOut);
            return true;
        }
        return false;
    }
    public void applyDiscount(){
        if(!discountApplied && isElectric()){
            setTollFee(getTollFee() * .50);
            discountApplied = true;
        }
    }
    public  void setDiscount(boolean set){
        discountApplied = set;
    }
}
