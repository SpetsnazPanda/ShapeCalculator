package praktic.geometry.bases; // package untuk class dasar

public abstract class Shape { // class abstract sebagai induk semua bentuk

    private String nama; // atribut untuk menyimpan nama bentuk

    public Shape() {} // konstruktor default

    public void setNama(String inputNama) { // method untuk mengatur nama bentuk
        this.nama = inputNama; // 'this' merujuk ke atribut class
    }

    public String getNama() { // method untuk mengambil nama bentuk
        return nama; // mengembalikan nilai nama
    }

    public abstract void printInfo(); // method abstract untuk mencetak informasi bentuk
}
