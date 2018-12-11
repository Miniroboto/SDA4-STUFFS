package Interfaces;

public class Main {
    public static void main(String[] args) {
        StoragePersons sp = new BucketStorage();
        sp.add("12345");
        sp.add("2563");
        sp.add("14646");
        sp.add("23344");
        sp.add("1234434");
        sp.add("222222");


        System.out.println(sp);

        sp.remove("2563");

        System.out.println(sp);

        System.out.println(sp.exists("235"));
        System.out.println(sp.list());
    }
}
