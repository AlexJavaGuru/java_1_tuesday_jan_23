package student_julija_raudive.lesson_3.level_7;

public class StoreDemo {

    public static void main(String[] args) {

        Store store1 = new Store("store1","Riga", false );
        store1.StoreInfo();
        store1.ChangeLocation("Ventspils");
        store1.OpenStore();
        store1.StoreInfo();


        Store store2 = new Store("store2", "Cesis", true);
        store2.StoreInfo();
        store2.setName("store3");
        store2.CloseStore();
        store2.StoreInfo();

    }
}
