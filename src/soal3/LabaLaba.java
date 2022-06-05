package soal3;

public class LabaLaba extends Hewan {

    public LabaLaba(String namaHewan, String makanan) {
        super(namaHewan, makanan);
    }

    public void berburu(){
        System.out.println(this.namaHewan + " sedang berburu " + super.makanan);
    }

    public void berburu(String racun){
        System.out.println(this.namaHewan + " sedang berburu " + super.makanan + " dengan racun " + racun);
    }

    public void mengeluarkanJaring(){
        System.out.println(this.namaHewan  + " mengeluarkan jaring.");
    }
}
