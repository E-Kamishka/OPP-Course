public class RacingBot extends Robot{

double initialVelocity;
double distanceTravelTime;
RacingBot(double distanceTravelTime, double initialVelocity, String name, int yearBuilt)
{
    super(name, yearBuilt);
    this.distanceTravelTime = distanceTravelTime;
    this.initialVelocity = initialVelocity;

}
@Override
    void display()
{
    super.display();
    System.out.println("With initial velocity of " + initialVelocity + " "+getName()+" took " + distanceTravelTime + " unit of time to move.");


}

//equation
    //private value hoche x1....
@Override
    double calculateDistanceTraveled(int noOfMovements)
{
    double Euclideandistance;
    double distance=0;
    for(int i=1; i<=noOfMovements; i++)
    {
        Euclideandistance = Math.sqrt(Math.pow((getX1()-getX2()),2)+Math.pow((getY1()-getY2()),2));
        distance = distance + Euclideandistance;



    }
    return Math.round(distance);


}
    double calculateAcceleration(double acceleretationTime, int noOfMovements)
    {
        double v = calculateDistanceTraveled(noOfMovements)/distanceTravelTime;
       return Math.round( (v - initialVelocity)/acceleretationTime);


    }


}
