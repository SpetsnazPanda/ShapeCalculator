package praktic.geometry.shapes; // package untuk class bentuk-bentuk konkret

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Sphere extends CircularShape implements ThreeDimensional, Weightable { // class Sphere turunan dari CircularShape, implementasi interface 3D dan berat

    private double mass; // atribut untuk menyimpan massa bola

    public Sphere() {
        super(); // memanggil konstruktor dari CircularShape
        setNama("Sphere"); // atur nama default menjadi 'Sphere'
        setRadius(0); // radius default = 0
        this.mass = 0; // massa default = 0
    }

    public Sphere(double radius, double mass) { // konstruktor dengan parameter radius dan massa
        super(); // memanggil konstruktor dari CircularShape
        setNama("Sphere"); // atur nama objek menjadi 'Sphere'
        setRadius(radius); // atur nilai jari-jari bola
        this.mass = mass; // set nilai massa ke atribut class
    }

    public double getSurfaceArea() { // implementasi method dari ThreeDimensional untuk menghitung luas permukaan
        return 4 * ((double)PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 2); // rumus 4πr²
    }

    public double getVolume() { // implementasi method dari ThreeDimensional untuk menghitung volume
        return (4.0 / 3.0) * ((double)PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 3); // rumus 4/3πr³
    }

    public double getWeight() { // implementasi method dari Weightable untuk menghitung berat
        return getVolume() * mass * g; // berat = volume × massa × gravitasi
    }

    public void printInfo() { // override method printInfo dari class Shape
        System.out.printf( // mencetak info dalam format rapi
            "%-16s: %s%n%-16s: %.2f%n%-16s: %.2f%n%-16s: %.2f%n",
            "Nama", getNama(), // nama bentuk
            "Luas permukaan", getSurfaceArea(), // luas permukaan bola
            "Volume", getVolume(), // volume bola
            "Berat", getWeight() // berat bola
        );
    }
}
