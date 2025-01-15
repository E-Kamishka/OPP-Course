import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int numOfMovements;
        RacingBot rb=new RacingBot(2.0,2.0,"FerrariBot",2016);
        ServiceRobot sr=new ServiceRobot(200,2.4,"Walle",2009);
        Scanner input1 = new Scanner(System.in);
        numOfMovements = input1.nextInt();
        rb.setX1X2Y1Y2(0, 10, 0, 10);
        sr.setX1X2Y1Y2(20, 40,40, 80);
    
        double distance1 = rb.calculateDistanceTraveled(numOfMovements);

        System.out.println("distance1: "+distance1);

        double distance2 = sr.calculateDistanceTraveled(numOfMovements);
        System.out.println("distance2: "+distance2);

        double recharge = sr.calculateTimeToRecharge();
        System.out.println("recharge: "+recharge);

        sr.display();
        Robot.printTotalRobots();

    }
}
