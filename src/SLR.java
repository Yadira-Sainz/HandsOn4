public class SLR {
    private  DataSet dataSet;
    private  DiscreteMaths discreteMaths;

    public SLR(DataSet dataSet, DiscreteMaths discreteMaths) {
        this.dataSet = dataSet;
        this.discreteMaths = discreteMaths;
    }

    public void calculateIntersection() {
        System.out.println("x: " + discreteMaths.sumX(dataSet.getX()));
        System.out.println("y: " + discreteMaths.sumY(dataSet.getY()));
    }

    public void printRegEquation(){
        System.out.println("Regression Equation = " + discreteMaths.b0(dataSet.getX(), dataSet.getY())
                + " + " + discreteMaths.b1(dataSet.getX(), dataSet.getY())+ "x" + " + "
                + discreteMaths.b2(dataSet.getX(), dataSet.getY()) + "x^2");
    }

    public void predict(float x){
        float e = (float) (discreteMaths.b0(dataSet.getX(), dataSet.getY()) + (discreteMaths.b1(dataSet.getX(), dataSet.getY()) *
                        x ) + (discreteMaths.b2(dataSet.getX(), dataSet.getY()) * Math.pow(x, 2)));
        System.out.println("Predict of Y: " + e);

    }

}
