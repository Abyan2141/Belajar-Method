class Segitiga {
    private double a;
    private double t;

    public Segitiga() {
        a = 0;
        t = 0;
    }

    public Segitiga (double a, double t) {
        this.a = a;
        this.t = t;
    }

    public double getAlas() {
        return a;
    }

    public void setAlas(double a) {
        this.a = a;
    }

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public double getLuas() {
        return (a * t) / 2;
    }

}