public class DataSet {
    private float x[];
    private float y[];
/*
    public DataSet(){
        x = new float[]{108,115,106,97,95,91,97,83,83,78,54,67,56,53,61,115,81,78,30,45,99,32,25,28,90,89};
        y = new float[]{95,96,95,97,93,94,95,93,92,86,73,80,65,69,77,96,87,89,60,63,95,61,55,56,94,93};
    }
*/
    public DataSet(){
        x = new float[]{-3, -2, -1, 0, 1, 2, 3};
        y = new float[]{7.5F, 3, 0.5F, 1, 3, 6, 14};
    }

    public float[] getX(){return this.x;}

    public float[] getY() {return this.y;}
}
