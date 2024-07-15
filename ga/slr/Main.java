import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> x = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> y = List.of(2.0, 4.0, 6.0, 8.0, 10.0);

        GeneticAlgorithm ga = new GeneticAlgorithm(100, 1000, 0.01, x, y);
        SimpleLinearRegression model = ga.evolve();
        System.out.println("Beta0: " + model.getBeta0());
        System.out.println("Beta1: " + model.getBeta1());
    }
}
