public class BmiService {
    public int calculate(double weightKg, double heightM) {

        double height2 = heightM * heightM;

        double index = weightKg / height2;

        int bmi = (int) index;

        return bmi;
    }
}
