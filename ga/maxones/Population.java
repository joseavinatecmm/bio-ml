import java.util.ArrayList;
import java.util.Random;


public class Population {
    private ArrayList<Individual> individuals;

    public Population(int size, int geneLength) {
        individuals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            individuals.add(new Individual(geneLength));
        }
    }

    public Population() {
        individuals = new ArrayList<>();
    }

    public ArrayList<Individual> getIndividuals() {
        return individuals;
    }

    public Individual getFittest() {
        Individual fittest = individuals.get(0);
        for (Individual individual : individuals) {
            if (individual.getFitness() > fittest.getFitness()) {
                fittest = individual;
            }
        }
        return fittest;
    }

    public void addIndividual(Individual individual) {
        individuals.add(individual);
    }

    public int getTotalFitness() {
        return individuals.stream().mapToInt(Individual::getFitness).sum();
    }
}




