package pl.uwm.zadb;

class Car {

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

    public static Car create(double pojemonoscSilnika, String marka)
    {
        return new Car(pojemonoscSilnika, marka);
    }

    private Car()
    {

    }

    private Car(double pojemonoscSilnika, String marka)
    {
        this.pojemnoscSilnika=pojemonoscSilnika;
        this.marka=marka;
    }

    private double pojemnoscSilnika;
    private String marka;
}
