 
public class Main {
  public static void main(String[] args) {
        int populationSize = 30;
        int geneLength = 20;
        int maxGenerations = 1000;
        double crossoverRate = 0.5;
        double mutationRate = 0.03;

        GeneticAlgorithm ga = new GeneticAlgorithm(populationSize, geneLength, maxGenerations, crossoverRate, mutationRate);
        ga.evolve();
    }
}
