import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Chromosome> chromosomes;

    public Population(int size) {
        chromosomes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chromosomes.add(new Chromosome());
        }
    }

    public List<Chromosome> getChromosomes() {
        return chromosomes;
    }

    public Chromosome getFittest() {
        Chromosome fittest = chromosomes.get(0);
        for (Chromosome chromosome : chromosomes) {
            if (chromosome.getFitness() > fittest.getFitness()) {
                fittest = chromosome;
            }
        }
        return fittest;
    }

    public double getTotalFitness() {
        return chromosomes.stream().mapToDouble(Chromosome::getFitness).sum();
    }

    public void addChromosome(Chromosome chromosome) {
        chromosomes.add(chromosome);
    }
}

