public class DiscreteMaths {

    public float sumX(float x[]) {
        float totalX = 0;

        for (int i = 0; i < x.length; i++)
            totalX = totalX + x[i];
        return totalX;
    }

    public float sumY(float y[]) {
        float totalY = 0;
        for (int i = 0; i < y.length; i++)
            totalY = totalY + y[i];
        return totalY;
    }

    public float XPow2(float x[]){
        float valorX = 0;
        for(int i = 0; i < x.length; i++)
            valorX = (float) (valorX + Math.pow(x[i], 2));
        return valorX;
    }

    public float XPow3(float x[]){
        float valorX = 0;
        for(int i = 0; i < x.length; i++)
            valorX = (float) (valorX + Math.pow(x[i], 3));
        return valorX;
    }

    public float XPow4(float x[]){
        float valorX = 0;
        for(int i = 0; i < x.length; i++)
            valorX = (float) (valorX + Math.pow(x[i], 4));
        return valorX;
    }

    public float sumXY(float x[], float y[]){
        float totalXY = 0;
        for (int i = 0; i < x.length; i++){
            totalXY = totalXY + (x[i] * y[i]);
        }
        return totalXY;
    }

    public float sumXPow2Y(float x[], float y[]){
        float XY = 0;
        for (int i = 0; i < x.length; i++){
            XY = (float) (XY + (Math.pow(x[i], 2) * y[i]));
        }
        return XY;
    }

    public float matrixP(float x[]){
        int numeroDatos = x.length;
        float op1 = numeroDatos * XPow2(x) * XPow4(x);
        float op2 = sumX(x) * XPow3(x) * XPow2(x);
        float op3 = XPow2(x) * sumX(x) * XPow3(x);
        float total1 = op1 + op2 + op3;
        float ope1 = (float) Math.pow(XPow2(x), 3);
        float ope2 = (float) Math.pow(XPow3(x), 2) * numeroDatos;
        float ope3 = (float) (XPow4(x) * Math.pow(sumX(x), 2));
        float total2 = ope1 + ope2 + ope3;
        return total1 - total2;
    }

    public float b0(float x[], float y[]){
        float operacion1 = sumY(y) * XPow2(x) * XPow4(x);
        float operacion2 = sumXY(x, y) * XPow3(x) * XPow2(x);
        float operacion3 = sumXPow2Y(x, y) * sumX(x) * XPow3(x);
        float total1 = operacion1 + operacion2 + operacion3;
        float ope1 = (float) (Math.pow(XPow2(x), 2) * sumXPow2Y(x, y));
        float ope2 = (float) (Math.pow(XPow3(x), 2) *sumY(y));
        float ope3 = XPow4(x) *sumX(x) * sumXY(x, y);
        float total2 = ope1 + ope2 + ope3;
        float result = total1 - total2;

        return  result / matrixP(x);
    }

    public float b1(float x[], float y[]){
        int numeroDatos = x.length;
        float op1 = numeroDatos * sumXY(x, y) * XPow4(x);
        float op2 = sumX(x) * sumXPow2Y(x, y) * XPow2(x);
        float op3 = XPow2(x) * sumY(y) * XPow3(x);
        float total1 = op1 + op2 + op3;
        float ope1 = (float) Math.pow(XPow2(x), 2) * sumXY(x, y);
        float ope2 = XPow3(x) * sumXPow2Y(x, y) * numeroDatos;
        float ope3 = XPow4(x) * sumY(y) * sumX(x);
        float total2 = ope1 + ope2 + ope3;
        float result = total1 - total2;

        return result / matrixP(x);
    }

    public float b2(float x[], float y[]){
        int numeroDatos = x.length;
        float op1 = numeroDatos * XPow2(x) * sumXPow2Y(x, y);
        float op2 = sumX(x) * XPow3(x) * sumY(y);
        float op3 = XPow2(x) * sumX(x) * sumXY(x, y);
        float total1 = op1 + op2 + op3;
        float ope1 = (float) (sumY(y) * Math.pow(XPow2(x), 2));
        float ope2 = sumXY(x, y) * XPow3(x) * numeroDatos;
        float ope3 = (float) (sumXPow2Y(x, y) * Math.pow(sumX(x), 2));
        float total2 = ope1 + ope2 + ope3;
        float result = total1 - total2;

        return result / matrixP(x);
    }

}
