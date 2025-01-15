public class ServiceRobot extends Robot
{
    double batteryCapacity;
    double chargingRate;
    ServiceRobot( double batteryCapacity, double chargingRate, String name, int yearBuilt)
    {
        super(name,yearBuilt);
        this.batteryCapacity = batteryCapacity;
        this.chargingRate = chargingRate;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Robot: "+getName() + "yEAR BUILT: "+getYearBuilt() + "Battery Capacity: "+batteryCapacity + "Ah with a charging rate of "+chargingRate);


    }
    @Override
   double calculateDistanceTraveled(int noOfMovements)
    {
        double totalManhattandistance = 0;
        for(int i=1; i<=noOfMovements; i++)
        {
            double d = Math.abs(getX1()-getX2()) + Math.abs(getY1()-getY2());
             totalManhattandistance += d;

        }
        return Math.round(totalManhattandistance);

    }

    double calculateTimeToRecharge()
    {
        return Math.round(batteryCapacity/chargingRate);
    }


}
