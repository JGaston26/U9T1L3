public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle bob = new Vehicle("MC56WQ",10.75,5);
        System.out.println(bob.calculateTollPrice());

        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car electricCar = new Car("KXN73F",8.50,2,true);
        System.out.println(electricCar.calculateTollPrice());

        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //
        // d. call the method on the Car you made in b to test it.
        electricCar.carPrinter();

        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        Truck jerry = new Truck("3k9JMX",24.75,4,6,true);
        System.out.println(jerry.getTollFee());

        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //
        // g. call the method on the Truck you made in e to test it.
        jerry.truckPrinter();

        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
        Taxi terry = new Taxi("8KM23Z",9.25,3,true,5.00);
        System.out.println(terry.getLicensePlate());
        System.out.println(terry.getPassengers());
        System.out.println(terry.isDiscountApplied());
        System.out.println(terry.isElectric());
        System.out.println(terry.calculateTollPrice());
        System.out.println(terry.getTollFee());
        terry.taxiPrinter();


        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------



    }
}