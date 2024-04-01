
public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public int getAxles() {
        return axles;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of axles: " + axles);
        System.out.println("Has trailer: " + hasTrailer);
    }
    @Override
    public double calculateTollPrice(){
        double toll = getTollFee() * axles;
        if(hasTrailer){
            return toll *2;
        }else{
            return toll;
        }
    }
}