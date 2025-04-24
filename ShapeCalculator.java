package praktic.geometry.mains; // package utama tempat class main berada

/*

    _    _     ___ _____ ___    _    _   _ 
   / \  | |   |_ _|  ___|_ _|  / \  | \ | |
  / _ \ | |    | || |_   | |  / _ \ |  \| |
 / ___ \| |___ | ||  _|  | | / ___ \| |\  |
/_/   \_\_____|___|_|   |___/_/   \_\_| \_|
Muhammad Alifian Khoiron - 245150707111042
*/

import java.util.Scanner; // import Scanner untuk input dari user
import praktic.geometry.bases.CircularShape; // import class CircularShape
import praktic.geometry.bases.Shape; // import class Shape
import praktic.geometry.interfaces.Weightable; // import interface Weightable
import praktic.geometry.shapes.Circle; // import class Circle
import praktic.geometry.shapes.Cube; // import class Cube
import praktic.geometry.shapes.Sphere; // import class Sphere
import praktic.geometry.shapes.Square; // import class Square

public class ShapeCalculator { // class utama untuk menjalankan program
    public static void main(String[] args) { // method main sebagai titik masuk program
        Scanner in = new Scanner(System.in); // objek Scanner untuk input dari user

        String reset = "\u001B[0m"; // kode untuk reset warna ANSI
        String hijau = "\u001B[32m"; // kode warna hijau ANSI
        String garis = hijau + "======================================" + reset; // garis pembatas berwarna hijau

        System.out.println(garis); // cetak garis atas
        System.out.println("Shape Calculator"); // cetak judul aplikasi
        System.out.print("Nama Lengkap : "); // input nama
        String nama = in.nextLine(); // baca input nama
        System.out.print("NIM : "); // input NIM
        String nim = in.nextLine(); // baca input NIM
        System.out.println(garis); // cetak garis bawah

        System.out.println("2D Circle"); // label bagian lingkaran
        System.out.println(garis); // garis pemisah
        System.out.print("Enter radius     : "); // input jari-jari lingkaran
        double r1 = in.nextDouble(); // baca input jari-jari
        System.out.println(garis); // garis pemisah bawah input
        Shape circle1 = new Circle(); // buat objek Circle dengan konstruktor default
        CircularShape circle2 = new Circle(r1); // buat objek Circle dengan radius input
        circle2.printInfo(); // tampilkan informasi Circle
        System.out.println(garis); // garis penutup section Circle

        System.out.println("2D Square"); // label bagian persegi
        System.out.println(garis); // garis pemisah
        System.out.print("Enter side       : "); // input panjang sisi
        double s1 = in.nextDouble(); // baca input sisi
        System.out.println(garis); // garis pemisah bawah input
        Square square1 = new Square(); // buat objek Square dengan konstruktor default
        Square square2 = new Square(s1); // buat objek Square dengan sisi input
        square2.printInfo(); // tampilkan informasi Square
        System.out.println(garis); // garis penutup section Square

        System.out.println("3D Weightable Cube"); // label bagian kubus
        System.out.println(garis); // garis pemisah
        System.out.print("Enter edge       : "); // input panjang sisi kubus
        double e1 = in.nextDouble(); // baca input sisi
        System.out.print("Enter mass       : "); // input massa kubus
        double m1 = in.nextDouble(); // baca input massa
        System.out.println(garis); // garis pemisah bawah input
        Cube cube1 = new Cube(); // buat objek Cube dengan konstruktor default
        Cube cube2 = new Cube(e1, m1); // buat objek Cube dengan parameter
        cube2.printInfo(); // tampilkan informasi Cube
        System.out.println(garis); // garis penutup section Cube

        System.out.println("3D Weightable Sphere"); // label bagian bola
        System.out.println(garis); // garis pemisah
        System.out.print("Enter radius     : "); // input radius bola
        double r2 = in.nextDouble(); // baca input radius
        System.out.print("Enter mass       : "); // input massa bola
        double m2 = in.nextDouble(); // baca input massa
        System.out.println(garis); // garis pemisah bawah input
        Sphere sphere = new Sphere(r2, m2); // buat objek Sphere dengan parameter
        sphere.printInfo(); // tampilkan informasi Sphere
        System.out.println(garis); // garis penutup section Sphere

        System.out.println("Volume of Cube and Sphere"); // label bagian polymorphism
        System.out.println("POLYMORPHISM: INTERFACE"); // subtitle polymorphism
        System.out.println(garis); // garis pemisah
        System.out.print("Enter edge       : "); // input sisi kubus polymorph
        double e2 = in.nextDouble(); // baca input sisi
        System.out.print("Enter radius     : "); // input radius bola polymorph
        double r3 = in.nextDouble(); // baca input radius
        System.out.print("Enter mass       : "); // input massa objek
        double m3 = in.nextDouble(); // baca input massa
        System.out.println(garis); // garis pemisah bawah input

        Weightable cubeW = new Cube(e2, m3); // buat objek Cube sebagai Weightable
        Weightable sphereW = new Sphere(r3, m3); // buat objek Sphere sebagai Weightable

        System.out.printf("%-16s: %.2f%n", "Cube's volume", ((Cube) cubeW).getVolume()); // tampilkan volume Cube
        System.out.printf("%-16s: %.2f%n", "Sphere's volume", ((Sphere) sphereW).getVolume()); // tampilkan volume Sphere
        System.out.printf("%-16s: %.2f%n", "Weight", sphereW.getWeight()); // tampilkan berat Sphere
        System.out.println(garis); // garis penutup akhir program
    }
}