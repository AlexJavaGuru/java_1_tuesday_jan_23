package student_anastasiia_bokareva.lesson7.level7;

public class UserRepository {
    private  UserEntity[] users;

    UserRepository (UserEntity[] arrayOfUsers){
        this.users=arrayOfUsers;
    }
    UserEntity getUserById(int id){
        for (int i=0; i< users.length;i++){
            if (id==users[i].getId()){
                return users[i];
            }
        }
        return null;
    }

    UserEntity getUserByName(String name){
        for (int i=0; i< users.length;i++){
            if (name==users[i].getName()){
                return users[i];
            }
        }
        return null;
    }
    UserEntity[] getAllUsers(){
        return users;
    }

}
