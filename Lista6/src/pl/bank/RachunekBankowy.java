package pl.bank;

class RachunekBankowy {

    public RachunekBankowy(double saldo)
    {
        this.saldo=saldo;
    }

    public void obliczMiesieczneOdsetki()
    {
        this.saldo +=(this.saldo * rocznaStopaProcentowa) / 12;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    static double rocznaStopaProcentowa;

    private double saldo;
}
