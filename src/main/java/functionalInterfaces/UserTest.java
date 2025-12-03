package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Ka").lastName("Ks").age(51).build());
        users.add(User.builder().firstName("Askar").lastName("Anwar").age(34).build());
        users.add(User.builder().firstName("Dilare").lastName("Mamat").age(14).build());
        //Print all users name
        printUsers(users, p ->true);
        //print all users name lastName stats with "M"
        printUsers(users, user -> user.getLastName().startsWith("M"));
    }
    private static void printUsers(List<User> users, Predicate <User> p){
        for (User user : users){
            if(p.test(user)){
                System.out.println(user);
            }
        }
    }
}
