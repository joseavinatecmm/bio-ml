import java.util.Random;

public class Selection {
    private static final Random random = new Random();

    public static Chromosome rouletteWheelSelection(Population population) {
        double totalFitness = population.getTotalFitness();
        double randomPoint = random.nextDouble() * totalFitness;

        double cumulativeFitness = 0.0;
        for (Chromosome chromosome : population.getChromosomes()) {
            cumulativeFitness += chromosome.getFitness();
            if (cumulativeFitness >= randomPoint) {
                return chromosome;
            }
        }
        return population.getChromosomes().get(population.getChromosomes().size() - 1);
    }
}

