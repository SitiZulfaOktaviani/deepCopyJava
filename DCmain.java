public class DCmain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Producs prd = new Producs(11,"Smart Phone XiaO", 800);
        Categories ctg;
        ctg = new Categories(1, "Elektronik", "Smartphone", "padat");

        Object object = ctg.clone();
        Categories ctg2 = (Categories)object;
        ctg2.setNama("baju");
        ctg2.setJenis("pakaian");

        System.out.println("Objek Asli");
        System.out.println(ctg);
        System.out.println("Objek Clone");
        System.out.println(ctg2);
    }
}
