import java.util.List;

public class SimpleLinearRegression {
    private double beta0;
    private double beta1;

    public SimpleLinearRegression(List<Double> x, List<Double> y) {
        // Assume genetic algorithm will calculate these values
    }

    public SimpleLinearRegression(double beta0, double beta1) {
        this.beta0 = beta0;
        this.beta1 = beta1;
    }


    public double getBeta0() {
        return beta0;
    }

    public void setBeta0(double beta0) {
        this.beta0 = beta0;
    }

    public double getBeta1() {
        return beta1;
    }

    public void setBeta1(double beta1) {
        this.beta1 = beta1;
    }

    public double predict(double x) {
        return beta0 + beta1 * x;
    }
}

