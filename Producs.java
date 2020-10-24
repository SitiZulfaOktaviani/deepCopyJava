public class Producs {
    private int id_produk;
    private String nama_produk;
    private int berat;

//    contruktor
    public Producs(int id_produk, String nama_produk, int berat){
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.berat = berat;
    }

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }


//    toString
    @Override
    public String toString() {
        return "Producs{" +
                "id_produk=" + id_produk +
                ", nama_produk='" + nama_produk + '\'' +
                ", berat=" + berat +
                '}';
    }
}
