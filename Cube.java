package praktic.geometry.shapes; // package untuk class bentuk-bentuk konkret

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Cube extends Shape implements ThreeDimensional, Weightable { // class Cube turunan dari Shape, implementasi 3D dan berat

    private double edge; // atribut untuk menyimpan panjang sisi kubus
    private double mass; // atribut untuk menyimpan massa kubus
    
    public Cube() { // konstruktor default
        super(); // panggil konstruktor dari Shape
        setNama("Cube"); // set nama default Cube
        this.edge = 0; // sisi diatur default 0
        this.mass = 0; // massa diatur default 0
    }

    public Cube(double edge, double mass) { // konstruktor dengan parameter sisi dan massa
        super(); // panggil konstruktor dari Shape
        setNama("Cube"); // set nama objek menjadi 'Cube'
        this.edge = edge; // simpan panjang sisi ke atribut edge
        this.mass = mass; // simpan massa ke atribut mass
    }

    public double getSurfaceArea() { // implementasi luas permukaan dari interface ThreeDimensional
        return 6 * Math.pow(edge, 2); // rumus luas permukaan kubus = 6 × sisi²
    }

    public double getVolume() { // implementasi volume dari interface ThreeDimensional
        return Math.pow(edge, 3); // rumus volume kubus = sisi³
    }

    public double getWeight() { // implementasi berat dari interface Weightable
        return getVolume() * mass * g; // berat = volume × massa × gravitasi
    }

    public void printInfo() { // override method untuk mencetak info lengkap
        System.out.printf( // mencetak informasi bentuk dalam format rapi
            "%-16s: %s%n%-16s: %.2f%n%-16s: %.2f%n%-16s: %.2f%n",
            "Nama", getNama(), // nama bentuk
            "Luas permukaan", getSurfaceArea(), // luas permukaan
            "Volume", getVolume(), // volume
            "Berat", getWeight() // berat
        );
    }
}
