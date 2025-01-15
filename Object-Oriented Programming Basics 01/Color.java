public class Color {
    private double red;
    private double green;
    private double blue;

    public Color(double R, double G, double B){
        red = R;
        green = G;
        blue = B;
    }

    void setcolor(double R, double G, double B){
        this.red = R;
        this.green = G;
        this.blue = B;
    }
    //ekshathe get kora

    Color getcolor()
    {
        return this;
    }

}
