import java.util.List;

public class DiscreteMaths {
    public static double sum(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static double sumOfProducts(List<Double> values1, List<Double> values2) {
        double sum = 0;
        for (int i = 0; i < values1.size(); i++) {
            sum += values1.get(i) * values2.get(i);
        }
        return sum;

    }

     public static double mean(List<Double> values) {
        return sum(values) / values.size();
    }

    public static double sumOfSquares(List<Double> values, double mean) {
        return values.stream().mapToDouble(value -> Math.pow(value - mean, 2)).sum();
    }

    public static double sumOfSquaredErrors(List<Double> x, List<Double> y, SimpleLinearRegression model) {
        double sum = 0;
        for (int i = 0; i < x.size(); i++) {
            double predicted = model.predict(x.get(i));
            sum += Math.pow(y.get(i) - predicted, 2);
        }
        return sum;
    }
}

