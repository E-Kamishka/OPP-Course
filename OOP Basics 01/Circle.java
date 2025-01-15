public class Circle {

    private double x;
    private double y;
   private double radius;
   private double PI;
   public Color c;

    public Circle(double x, double y, double radius, double R, double G, double B) {
        this.x = x;
        this.y = y;
        this.radius = R;
        this.PI = 3.1416;
        c = new Color(R,G,B);




    }

    public void setxy(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }
    public Circle getxy(){
        return this;
    }

    public void setc(Color c){
        this.c = c;
    }

    public Color getc(){
        return c;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double CalculateArea()
    {
        double area =  PI*radius*radius;
        return area;

    }

    public double calculateCircumference(){

        double circumference = 2*PI*radius;
        return circumference;
    }

}
