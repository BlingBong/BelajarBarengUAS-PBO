package soal3;

public class SpiderMan extends LabaLaba implements Parkour {
    private String namaOrang;
    private String pekerjaan;

    private int sisaEnergi = energi;

    public SpiderMan(String namaOrang, String makanan, String pekerjaan) {
        super(namaOrang, makanan);
        this.namaOrang = namaOrang;
        this.pekerjaan = pekerjaan;
    }

    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public int getSisaEnergi() {
        return sisaEnergi;
    }

    public void setSisaEnergi(int sisaEnergi) {
        this.sisaEnergi = sisaEnergi;
    }

    public void berubah(){
        System.out.println(this.namaOrang + " berubah menjadi Spider-Man.");
    }

    @Override
    public void berburu() {
        super.berburu();
    }

    @Override
    public void berburu(String racun) {
        super.berburu(racun);
    }

    @Override
    public void mengeluarkanJaring() {
        super.mengeluarkanJaring();
    }

    @Override
    public void makan() {
        super.makan();
    }

    @Override
    public void memanjat() {
        sisaEnergi -= costMemanjat;
        System.out.println(this.namaOrang + " memanjat gedung. (Sisa energi: " + sisaEnergi + ")");
    }

    @Override
    public void berayun() {
        sisaEnergi -= costBerayun;
        System.out.println(this.namaOrang + " berayun dari satu gedung ke gedung lain. (Sisa energi: " + sisaEnergi + ")");
    }

    @Override
    public void bekerja() {
        System.out.println(this.namaOrang + " bekerja sebagai seorang " + this.pekerjaan + " saat tidak beraksi menjadi Spider-Man.");
    }

    @Override
    public void tidur() {
        System.out.println(this.namaOrang + " sedang tidur di rumah Bibi May.");
    }
}
