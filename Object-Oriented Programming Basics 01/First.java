public class First {
    public static void main(String[] args) {
        Circle s1 = new Circle(2, 3, 10, 4,4,4);
        double area = s1.CalculateArea();
        System.out.println(area);
        double circumference = s1.calculateCircumference();
        System.out.println(circumference);

    }
}
