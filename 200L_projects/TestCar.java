public class TestCar
{
    public static void main(String[] args)
    {
        Car car1 = new Car( 32456, 32776, 40.0);
        Car car2 = new Car( 365, 30.0);

        System.out.println("Fuel consumption for car1 is " + car1. getKilometersPerLiter( ) + " km/liter is "
        + (car1.isEconomyCar(car1.getKilometersPerLiter()) ? "economy and " : "not economy and ")
        + (car1.isFuelGuttler(car1.getKilometersPerLiter()) ? "fuelguttler" : "not fuelguttler"));

        System.out.println("Fuel consumption for car2 is " + car2. getKilometersPerLiter( ) + " km/liter is "
        + (car2.isEconomyCar(car2.getKilometersPerLiter()) ? "economy and " : "not economy and ")
        + (car2.isFuelGuttler(car2.getKilometersPerLiter()) ? "fuelguttler" : "not fuelguttler"));
    }
}

class Car
{
    int initialOdometerReading, finalOdometerReading;
    double litersUsed;

    public Car(int initReading, int finalReading, double liters)
    {
        initialOdometerReading = initReading;
        finalOdometerReading = finalReading;
        litersUsed = liters;
    }

    public Car(int finalReading, double liters)
    { 
        //used to create new car objects
        finalOdometerReading = finalReading;
        litersUsed = liters;
    }

    public double getKilometersPerLiter()
    {
        return (finalOdometerReading - initialOdometerReading) / litersUsed; // assumes litersUsed is not zero
    }

    public boolean isEconomyCar(double fuelCom)
    {
        if(fuelCom < 5)
            return true;

        return false;
    }

    public boolean isFuelGuttler(double fuelCom)
    {
        if(fuelCom > 15)
            return true;
        
        return false;
    }
}