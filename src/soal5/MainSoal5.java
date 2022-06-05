package soal5;

import java.io.RandomAccessFile;

public class MainSoal5 {
    public static void main(String[] args) throws Exception {
        // membuat objek raf dengan kelas RandomAccessFile dengan file "contoh.txt"
        RandomAccessFile raf = new RandomAccessFile("D:\\TEMPORARY FILES\\contoh.txt", "rw");
        byte b;
        byte[] content = new byte[(int)raf.length()];

        // mencetak posisi awal pointer
        System.out.println("Posisi pointer awal : "+raf.getFilePointer());

        // mengubah posisi pointer ke nilai 5
        raf.seek(5);
        System.out.println("\nMenjalankan fungsi \"seek(5)\"");
        System.out.println("Posisi pointer setelah proses : "+raf.getFilePointer());

        // membaca karakter yang terdapat pada posisi pointer sekarang
        b = (byte)raf.read();
        System.out.println("\nMenjalankan fungsi \"read()\"");
        System.out.println("Karakter yang terbaca : "+(char)b);
        System.out.println("Posisi pointer setelah proses : "+raf.getFilePointer());

        // merubah karakter pada file eksternal yang terdapat pada posisi pointer sekarang
        raf.write('x');
        System.out.println("\nMenjalankan fungsi \"write('x')\"");
        System.out.println("Posisi pointer setelah proses : "+raf.getFilePointer());

        // membaca seluruh isi file
        raf.seek(0);
        raf.read(content);
        System.out.println("\nMenjalankan fungsi \"read(content)\"");
        System.out.println("String yang terbaca : "+new String(content));
        System.out.println("Posisi pointer setelah proses : "+raf.getFilePointer());
    }
}
