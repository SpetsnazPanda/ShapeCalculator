package praktic.geometry.interfaces; // package untuk interface-interface bentuk

public interface Weightable { // interface untuk bentuk 3D yang bisa dihitung beratnya

    double g = 9.8; // konstanta percepatan gravitasi (m/s^2)

    double getWeight(); // method untuk menghitung berat
}
