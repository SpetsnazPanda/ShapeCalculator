package praktic.geometry.shapes; // package untuk class bentuk-bentuk konkret

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

public class Circle extends CircularShape implements TwoDimensional { // class Circle turunan CircularShape dan implementasi bentuk 2D

    public Circle() { // konstruktor default tanpa parameter
        super(); // panggil konstruktor CircularShape
        setNama("2D Circle"); // set nama default
        setRadius(0); // set radius default ke 0
    }

    public Circle(double radius) { // konstruktor dengan parameter radius
        super(); // panggil konstruktor CircularShape
        setNama("Circle"); // set nama bentuk menjadi "Circle"
        setRadius(radius); // set nilai jari-jari dari parameter
    }

    public double getArea() { // implementasi method luas dari interface TwoDemensional
        return ((double)PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 2); // rumus πr²
    }

    public double getPerimeter() { // implementasi method keliling dari interface TwoDemensional
        return 2 * ((double)PI_NUMERATOR / PI_DENOMINATOR) * getRadius(); // rumus 2πr
    }

    public void printInfo() { // override method untuk mencetak info bentuk lingkaran
        System.out.printf( // mencetak informasi dengan format rapi
            "%-16s: %s%n%-16s: %.2f%n%-16s: %.2f%n",
            "Nama", getNama(), // nama bentuk
            "Luas", getArea(), // luas lingkaran
            "Keliling", getPerimeter() // keliling lingkaran
        );
    }
}
