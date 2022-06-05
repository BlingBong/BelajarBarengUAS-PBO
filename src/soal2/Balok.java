package soal2;

public class Balok extends PersegiPanjang {
    private double tinggi, hasilVolume;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // kalau input sama
    public double hitungVolume() {
        hasilVolume = super.getHasilLuas() * tinggi;
        return hasilVolume;
    }

    // kalau input berbeda
    public double hitungVolume(double panjang, double lebar) {
        super.setPanjang(panjang);
        super.setLebar(lebar);

        hasilVolume = super.hitungLuas() * tinggi;
        return hasilVolume;
    }
}
