public class BmiService {
    public double calculate(double WeightKg, double HeightM) {

        double bmi = WeightKg / (HeightM * HeightM);

        return bmi;
    }
}
