import java.util.ArrayList;
import java.util.Arrays;

public class GeneticAlgorithm {
    private int populationSize;
    private int geneLength;
    private int maxGenerations;
    private double crossoverRate;
    private double mutationRate;

    public GeneticAlgorithm(int populationSize, int geneLength, int maxGenerations,double crossoverRate, double mutationRate) {
        this.populationSize = populationSize;
        this.geneLength = geneLength;
        this.maxGenerations = maxGenerations;
        this.mutationRate = crossoverRate;
        this.mutationRate = mutationRate;
    }

    public void evolve() {
        Population population = new Population(populationSize, geneLength);

        for (int generation = 0; generation < maxGenerations; generation++) {
            Population newPopulation = new Population();

            for (int i = 0; i < populationSize; i++) {
                Individual parent1 = Selection.rouletteWheelSelection(population);
                Individual parent2 = Selection.rouletteWheelSelection(population);
                Individual offspring = crossover(parent1, parent2);
                offspring.mutate(mutationRate);
                newPopulation.addIndividual(offspring);
            }

            population = newPopulation;
            Individual fittest = population.getFittest();
            
            System.out.println("Generation " + generation + " Chromosome: "  
                               + Arrays.toString(fittest.getGenes()) + " - Fittest: " + fittest.getFitness());

            if (fittest.getFitness() == 20)
                generation = maxGenerations;
        }
    }

    private Individual crossover(Individual parent1, Individual parent2) {
        int[] genes1 = parent1.getGenes();
        int[] genes2 = parent2.getGenes();
        int[] newGenes = new int[genes1.length];
        for (int i = 0; i < genes1.length; i++) {
            newGenes[i] = (Math.random() < crossoverRate) ? genes1[i] : genes2[i];
        }
        return new Individual(newGenes);
    }

  }

