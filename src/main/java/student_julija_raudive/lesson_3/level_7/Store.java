package student_julija_raudive.lesson_3.level_7;



class Store {
    String name;
    String location;
    boolean isOpened;

    Store(String name, String location, boolean isOpened) {
        this.name = name;
        this.location = location;
        this.isOpened = isOpened;

    }




    void StoreInfo(){

        String condition;

        if (isOpened){
            condition = "Opened";
        }
        else {
            condition = "Closed";
        }

        System.out.println("Store " + name + "\nLocation: " + location + "\nCondition: " + condition + "\n");
    }

    void ChangeLocation(String newLocation){
        location = newLocation;
     }

     void CloseStore(){
        isOpened = false;
         System.out.println("Store " + name + " is closed!");
     }

     void OpenStore(){
         isOpened = true;
         System.out.println("Store " + name + " is opened!");
     }


     void setName(String name) {
        this.name = name;
    }
}
