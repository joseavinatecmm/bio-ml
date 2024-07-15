
public class CoefficientOfDetermination {
    public static double calculate(List<Double> x, List<Double> y, SimpleLinearRegression model) {
        double meanY = DiscreteMaths.mean(y);
        double totalSumOfSquares = DiscreteMaths.sumOfSquares(y, meanY);
        double sumOfSquaredErrors = DiscreteMaths.sumOfSquaredErrors(x, y, model);
        return 1 - (sumOfSquaredErrors / totalSumOfSquares);
    }

        SimpleLinearRegression model = new SimpleLinearRegression(beta0, beta1);

    }
}
