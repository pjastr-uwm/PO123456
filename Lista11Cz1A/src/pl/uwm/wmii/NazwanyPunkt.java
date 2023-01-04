package pl.uwm.wmii;

class NazwanyPunkt extends Punkt
{

    NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }

    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) {
            return false;
        }
        NazwanyPunkt other = (NazwanyPunkt) otherObject;
        return this.name.equals(other.name);
    }

    private String name;
}
