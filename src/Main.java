
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(250, 2.1);
        int i = (int) bmi;
        System.out.println(i);
    }
}