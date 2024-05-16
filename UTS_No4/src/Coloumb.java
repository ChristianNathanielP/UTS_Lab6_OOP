import java.text.DecimalFormat;

public class Coloumb {
    public static final double K = 9 * Math.pow(10,9);
    public static final double vp = 8.854 * Math.pow(10, -12); //vacuum permittivity
    public static final double rp = 1.0; //default relative permittivity
//    Jika yang ditanya adalah Gaya Coloumb
    public static double calculate(double q1, double q2, double r){
        return K * q1 * q2 / (r*r);
    }
//    Overloading untuk menghitung Gaya Coloumb di ruang vacuum
    public static double calculate(double q1, double q2, double r, boolean isVacuum){
        if(isVacuum)
            return vp * q1 * q2 / (r*r);
        else
            return rp * q1 * q2 / (r*r);
    }

//    Jika yang ditanya adalah q1
    public static double calculateQ1(double q2, double r, double gayaColoumb){
        return gayaColoumb * (r*r) / K * q2;
    }
//    Jika yang ditanya adalah q2
    public static double calculateQ2(double q1, double r, double gayaColoumb){
        return gayaColoumb * (r*r) / K * q1;
    }
//    Jika yang ditanya adalah r
    public static double calculateR(double q1, double q2, double gayaColoumb){
        return Math.sqrt(K * q1 * q2 / gayaColoumb);
    }



}
