class Lingkaran {
    private double r = 0;

    public Lingkaran() {
        r = 0;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getJarijari() {
        return r;
    }

    public void setJarijari(double r) {
        this.r = r;
    }

    public double getLuas() {
        return Math.PI * r * r; 
    }
}
