package praktic.geometry.bases; // package untuk class dasar

public abstract class CircularShape extends Shape { // class abstract untuk bentuk melingkar (turunan dari Shape)

    private double radius; // atribut untuk menyimpan nilai jari-jari

    protected int PI_NUMERATOR = 22; // pembilang dari nilai π (pi)
    protected int PI_DENOMINATOR = 7;  // penyebut dari nilai π (pi)

    public CircularShape() {} // konstruktor default

    public void setRadius(double inputRadius) { // method untuk mengatur nilai jari-jari
        this.radius = inputRadius; // menyimpan nilai parameter ke dalam atribut radius
    }

    public double getRadius() { // method untuk mengambil nilai jari-jari
        return radius; // mengembalikan nilai radius
    }
}
