package student_anastasiia_bokareva.lesson12.level2;

public class BankClient {

    private String uid;
    private String fullName;

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

    BankClient(String uid, String fullName){
        this.uid=uid;
        this.fullName=fullName;
    }

}
