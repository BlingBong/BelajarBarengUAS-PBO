package soal2;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok(3,4,5);

        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Balok: " + balok.hitungVolume(1,2));
    }
}
