public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weightKg = 90;

        double heightM = 1.68;

        int result = service.calculate(weightKg, heightM);

        System.out.println(result);

    }
}