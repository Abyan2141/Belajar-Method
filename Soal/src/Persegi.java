class Persegi {
    private double s;

    public Persegi() {
        s = 0;
    }

    public Persegi (double s) {
        this.s = s;
    }

    public double getSisi() {
        return s;
    }
    
    public void setSisi(double s) {
        this.s = s;
    }

    public double getLuas() {
        return s * s;
    }
}
