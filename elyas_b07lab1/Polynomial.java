package elyas_b07lab1;

public class Polynomial {
    private double[] coeffs;

    public Polynomial() {
        this.coeffs = new double[]{0};
    }

    public Polynomial(double[] values) {
        this.coeffs = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            this.coeffs[i] = values[i];
        }
    }

    public Polynomial add(Polynomial other) {
        int maxLen = Math.max(this.coeffs.length, other.coeffs.length);
        double[] result = new double[maxLen];

        for (int i = 0; i < maxLen; i++) {
            double a = i < this.coeffs.length ? this.coeffs[i] : 0;
            double b = i < other.coeffs.length ? other.coeffs[i] : 0;
            result[i] = a + b;
        }

        return new Polynomial(result);
    }

    public double evaluate(double x) {
        double total = 0;
        for (int i = 0; i < coeffs.length; i++) {
            total += coeffs[i] * Math.pow(x, i);
        }
        return total;
    }

    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }

}
