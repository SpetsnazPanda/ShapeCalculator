package praktic.geometry.shapes; // package untuk class bentuk-bentuk konkret

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

public class Square extends Shape implements TwoDimensional { // class Square turunan dari Shape dan implementasi TwoDemensional

    private double side; // atribut untuk menyimpan panjang sisi persegi

    public Square() { // konstruktor default tanpa parameter
        super(); // panggil konstruktor dari Shape
        setNama("2D Square"); // set nama default persegi
        this.side = 0; // atur sisi ke 0 secara default
    }

    public Square(double side) { // konstruktor dengan parameter sisi
        super(); // panggil konstruktor dari Shape
        setNama("Square"); // set nama bentuk menjadi "Square"
        this.side = side; // simpan nilai sisi dari parameter
    }

    public double getArea() { // implementasi method luas dari interface
        return Math.pow(side, 2); // rumus luas persegi = sisi²
    }

    public double getPerimeter() { // implementasi method keliling dari interface
        return 4 * side; // rumus keliling persegi = 4 × sisi
    }

    public void printInfo() { // override method untuk mencetak info bentuk persegi
        System.out.printf( // mencetak informasi dengan format rapi
            "%-16s: %s%n%-16s: %.2f%n%-16s: %.2f%n",
            "Nama", getNama(), // nama bentuk
            "Luas", getArea(), // luas persegi
            "Keliling", getPerimeter() // keliling persegi
        );
    }
}
