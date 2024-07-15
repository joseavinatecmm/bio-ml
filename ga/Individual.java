import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

class Individual {
    private int[] genes;
    private int fitness;
    private static final Random random = new Random();

    public Individual(int length) {
        genes = new int[length];
        for (int i = 0; i < length; i++) {
            genes[i] = random.nextInt(2);
        }
        calculateFitness();
    }

    public Individual(int[] genes) {
        this.genes = genes;
        calculateFitness();
    }

    public int[] getGenes() {
        return genes;
    }

    public int getFitness() {
        return fitness;
    }

    public void calculateFitness() {
        fitness = 0;
        for (int gene : genes) {
            if (gene == 1) {
                fitness++;
            }
        }
    }

    public void mutate(double mutationRate) {
        for (int i = 0; i < genes.length; i++) {
            if (random.nextDouble() < mutationRate) {
                genes[i] = 1 - genes[i];
            }
        }
        calculateFitness();
    }

    public String toString() {
       return "Individual{" +
                "Chromosome" + Arrays.toString(genes) +
                ", fitness=" + fitness +
                "}"; 
    }

 }

