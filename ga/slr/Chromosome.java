import java.util.Random;
import java.util.List;

public class Chromosome {
    private double beta0;
    private double beta1;
    private double fitness;
    private static final Random random = new Random();

    public Chromosome() {
        this.beta0 = random.nextDouble();
        this.beta1 = random.nextDouble();
    }

    public Chromosome(double beta0, double beta1) {
        this.beta0 = beta0;
        this.beta1 = beta1;
    }

    public double getBeta0() {
        return beta0;
    }

    public double getBeta1() {
        return beta1;
    }

    public double getFitness() {
        return fitness;
    }

    public void calculateFitness(List<Double> x, List<Double> y, SimpleLinearRegression model) {

        double meanY = DiscreteMaths.mean(y);
        double totalSumOfSquares = DiscreteMaths.sumOfSquares(y, meanY);
        double sumOfSquaredErrors = DiscreteMaths.sumOfSquaredErrors(x, y, model);
    
        this.fitness = 1 - (sumOfSquaredErrors / totalSumOfSquares);

    }

    public void mutate(double mutationRate) {
        if (random.nextDouble() < mutationRate) {
            beta0 += random.nextGaussian();
        }
        if (random.nextDouble() < mutationRate) {
            beta1 += random.nextGaussian();
        }
    }

     @Override
    public String toString() {
        return "Chromosome {" + this.beta0 + ", " + this.beta1 + "}";
    }
}

