package pl.uwm.zadb;

class Car {
    public Car()
    {

    }
    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    private double pojemnoscSilnika;
    private String marka;
}
