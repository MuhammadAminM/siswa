import java.lang.reflect.Constructor;

public class SiswaTester {
    public static void main(String[] args) {
        //membuat object
        //namaClass namaObject = new
        //Constructor
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa angga = new Siswa();
        Siswa rehan = new Siswa();
        Siswa kevin = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 87.5;
        angga.id = 9;
        angga.nama = "Angga";
        angga.ipk = 88.8;
        rehan.id = 29;
        rehan.nama = "Rehan";
        rehan.ipk = 99.9;
        kevin.id = 20;
        kevin.nama = "Kevin";
        kevin.ipk = 86.6;

        sabrina.print();
        System.out.println("-------------");
        rasyid.print();
        System.out.println("-------------");
        angga.print();
        System.out.println("-------------");
        rehan.print();
        System.out.println("-------------");
        kevin.print();
        System.out.println("-------------");
    }
    
}
