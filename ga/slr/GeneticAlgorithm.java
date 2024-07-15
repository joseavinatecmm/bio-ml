import java.util.Arrays;
import java.util.List;

public class GeneticAlgorithm {
    private int populationSize;
    private int maxGenerations;
    private double mutationRate;
    private List<Double> x;
    private List<Double> y;

    public GeneticAlgorithm(int populationSize, int maxGenerations, double mutationRate, List<Double> x, List<Double> y) {
        this.populationSize = populationSize;
        this.maxGenerations = maxGenerations;
        this.mutationRate = mutationRate;
        this.x = x;
        this.y = y;
    }

    public SimpleLinearRegression evolve() {
        SimpleLinearRegression randomModel, evolvedModel; 
        Population population = new Population(populationSize);
        for (Chromosome chromosome : population.getChromosomes()) {
             randomModel = new SimpleLinearRegression(chromosome.getBeta0(), chromosome.getBeta1());
            chromosome.calculateFitness(x, y, randomModel);
        }

        for (int generation = 0; generation < maxGenerations; generation++) {
            Population newPopulation = new Population(0);

            for (int i = 0; i < populationSize; i++) {
                Chromosome parent1 = Selection.rouletteWheelSelection(population);
                Chromosome parent2 = Selection.rouletteWheelSelection(population);
                Chromosome offspring = crossover(parent1, parent2);
                offspring.mutate(mutationRate);
               
                evolvedModel = new SimpleLinearRegression(offspring.getBeta0(), offspring.getBeta1());
                
                offspring.calculateFitness(x, y, evolvedModel);
                newPopulation.addChromosome(offspring);
            }

            population = newPopulation;
            Chromosome fittest = population.getFittest();
            System.out.println("Generation " + generation +  " Chromosome: " + fittest 
                               + " - Fittest Fitness: " + fittest.getFitness());
          
            if (fittest.getFitness() > 0.99)
                generation = maxGenerations;
        }

        Chromosome bestChromosome = population.getFittest();
        SimpleLinearRegression model = new SimpleLinearRegression(x, y);
        model.setBeta0(bestChromosome.getBeta0());
        model.setBeta1(bestChromosome.getBeta1());
        return model;
    }

    public Chromosome crossover(Chromosome parent1, Chromosome parent2) {
        double newBeta0 = (Math.random() < 0.5) ? parent1.getBeta0() : parent2.getBeta0();
        double newBeta1 = (Math.random() < 0.5) ? parent1.getBeta1() : parent2.getBeta1();
        return new Chromosome(newBeta0, newBeta1);
    }

  }

