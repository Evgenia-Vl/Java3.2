public class BmiService {
    public int calculate(double a, double b) {

        double height2 = b * b;

        double index = a / height2;

       int bmi = (int) index;

        return bmi;
    }
}
