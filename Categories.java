public class Categories {
    private int id;
    private String nama;
    private String jenis;
    private String bentuk;

//    construktor
    public Categories(int id, String nama, String jenis, String bentuk){
        this.id = id;
        this.nama = nama;
        this.jenis =  jenis;
        this.bentuk = bentuk;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getBentuk(){
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public Categories clone() {
        try {
            return (Categories) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Categories(this.getId(), this.getNama(), this.getJenis(), this.getBentuk());
        }
    }

//    toString
    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", bentuk='" + bentuk + '\'' +
                '}';
    }
}
