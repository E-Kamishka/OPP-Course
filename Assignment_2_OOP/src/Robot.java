public class Robot {
    private String name;
    private int yearBuilt;
    static int robotCounter;
   private int x1,x2,y1,y2;

    //creating constructor

    Robot(String name, int yearBuilt)
    {
        this.name = name;
        this.yearBuilt = yearBuilt;
        robotCounter++;
    }
    static void printTotalRobots()
    {
        System.out.println("number of robots: "+robotCounter);
    }

    //setter n getter for name n yearBuilt

    void setNameYearBuilt(String name, int yearBuilt)
    {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }
    String getName() { return name; }
    int getYearBuilt() { return yearBuilt; }

    // setter n getter for cordinates

    void setX1X2Y1Y2(int x1, int x2, int y1, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }
    void setCoordinates()
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }

    int getX1() {return x1;}
    int getX2() {return x2;}
    int getY1() {return y1;}
    int getY2() {return y2;}


    //methods(overridden both)
    double calculateDistanceTraveled(int noOfMovements)
    {
        System.out.println("This method will be overridden!");
        return 0;
    }

    void display()
    {
        System.out.println("Robot: "+name);
        System.out.println("Year Built: "+yearBuilt);
    }


    }

