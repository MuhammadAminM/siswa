public class Siswa {
    //variable
    int id;
    String nama;
    double ipk;

    //Constructor (yang membangun object)
    public Siswa(){
        id = 0;
        nama = "Kosong";
        ipk = 0.0;

    }

    //Getter
    //Setter
    //Method
    public void print(){
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
