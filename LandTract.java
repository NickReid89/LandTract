public class LandTract {

    // fields for a land tracts length and width.
    private double length, width;

    // constructor to create a land tract
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // returns the area of the land tract
    public double Area() {
        return length * width;
    }

    // Compares one land tract to another and returns the size as an int.
    public int equals(LandTract lt) {

        if (this.Area() > lt.Area()) {
            return 1;
        } else if (this.Area() < lt.Area()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Over ridden to string method to return the area, length and width of a land tract.
    @Override
    public String toString() {

        return "Your land tract is: \nLength: " + length + "\nWidth:  " + width + "\nwith an area of : " + Double.toString(Area()) + "\n";

    }
}