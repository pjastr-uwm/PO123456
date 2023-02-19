package pl.uwm.wmii;

class Punkt
{

    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

    public int x()
    {
        return x;
    }

    public int y()
    {
        return y;
    }

    public boolean equals(Object otherObject) {
        // sprawdzamy czy obie referncje: this oraz otherObject
        // odnoszą sie do tego samego obiektu
        if (this == otherObject) {
            return true;
        }

        // zwracamy false gdy argument ma wartość null
        if (otherObject == null) {
            return false;
        }

        // zwracamy false gdy obiekty różnych klas
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Punkt other = (Punkt) otherObject;
        return this.x == other.x && this.y == other.y;
    }

    private int x, y;
}