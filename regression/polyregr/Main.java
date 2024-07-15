public class Main {

    public static void main(String[] args) {
        
        double[] x = {108, 115, 106, 97, 95, 91, 97,83, 83, 78, 54, 67, 56, 53, 61, 115, 81, 78, 30, 45, 99,32, 25, 28, 90 ,89 };
        double[] y = {95, 96, 95, 97, 93, 94, 95,93, 92, 86, 73, 80, 65, 69, 77, 96, 87, 89, 60, 63, 95, 61, 55, 56, 94, 93 };
        int degree = 3;  

        PolynomialRegression polyRegr = new PolynomialRegression();

        double[] beta = polyRegr.fit(x, y, degree);
        
        for (int i = 0; i < beta.length; i++) 
            System.out.println("beta[" + i + "] = " + beta[i]);
    }
}

 
