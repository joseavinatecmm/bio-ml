import java.util.Random;

public class Selection {
    private static final Random random = new Random();

    public static Individual rouletteWheelSelection(Population population) {
        int totalFitness = population.getTotalFitness();
        double randomPoint = random.nextDouble() * totalFitness;

        double cumulativeFitness = 0.0;
        for (Individual individual : population.getIndividuals()) {
            cumulativeFitness += individual.getFitness();
            if (cumulativeFitness >= randomPoint) {
                return individual;
            }
        }
        return population.getIndividuals().get(population.getIndividuals().size() - 1);
    }
}
