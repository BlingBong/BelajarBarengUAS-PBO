package soal3;

public abstract class Hewan {
    String namaHewan;
    String makanan;

    public Hewan(String namaHewan, String makanan) {
        this.namaHewan = namaHewan;
        this.makanan = makanan;
    }

    public void makan(){
        System.out.println(this.namaHewan + " memakan " + this.makanan + ".");
        System.out.println(this.namaHewan + " kenyang.");
    }
}
