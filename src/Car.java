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
    @Override
    public double calculateTollPrice(){
        if(getPassengers() + 1 >= 4){
            setTollFee(getTollFee() * 4);
            return getTollFee();
        }
        return super.getTollFee();
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Is Electric:  " + electric);;
    }
}
