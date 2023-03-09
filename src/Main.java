import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        DataSet dataSet = new DataSet();
        DiscreteMaths discreteMaths = new DiscreteMaths();

        SLR slr = new SLR(dataSet, discreteMaths);

        slr.calculateIntersection();
        System.out.println("Beta 0: " + discreteMaths.b0(dataSet.getX(), dataSet.getY()));
        System.out.println("Beta 1: " + discreteMaths.b1(dataSet.getX(), dataSet.getY()));
        System.out.println("Beta 2: " + discreteMaths.b2(dataSet.getX(), dataSet.getY()));
        slr.printRegEquation();
        System.out.println("Enter the value of X: ");
        float num = reading.nextFloat();
        slr.predict(num);
    }
}

