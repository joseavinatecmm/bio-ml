public class PolynomialRegression {

    public double[] fit(double[] x, double[] y, int degree) {
        int n = x.length;
        int m = degree + 1;
        LinearAlgebra linearAlgbr = new LinearAlgebra();

        // Vandermonde matrix
        double[][] X = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                X[i][j] = Math.pow(x[i], j);
            }
        }

        double[][] XT = linearAlgbr.transpose(X);
        double[][] XT_X = linearAlgbr.multiplyMatrices(XT, X);
        double[] XT_y = linearAlgbr.multiplyMatrixVector(XT, y);
        double[] beta = linearAlgbr.gaussianElimination(XT_X, XT_y);

        return beta;
    }
}

