public class DCmain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Producs prd = new Producs(11,"Smart Phone XiaO", 800);
        Categories ctg = new Categories(1, "Elektronik", "Elektronik","padat" );

        Object object = ctg.clone();
        Categories ctg2 = (Categories)object;
        ctg2.setNama("baju");

        System.out.println("Original Employee object:::");
        System.out.println(ctg);
        System.out.println("Cloned Employee object:::");
        System.out.println(ctg2);
    }
}
