import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        User newUser = new User("Vasiliy", "Sokolov", 30);
        newUser.addOneUser(new User("John", "Smith", 35));
        Personal personal = new Personal();

        personal.addUser(newUser);
        personal.addUser(new User("John", "Smith", 35));
        personal.addUser(new User("Brus", "Uillis", 60));
        personal.addUser(new User("Jenifer", "Lopes", 19));
        personal.addUser(new User("Jenifer", "Lopes", 18));
        personal.addUser(new User("John", "Lopes", 18));



        for (User user : personal) {
            System.out.println(user);   // список юзеров
        }
        System.out.println("________");
        Collections.sort(personal.getUsers());

        // for (User user : personal) {
        //     System.out.println(user);
        // }
        // System.out.println("________");

        User bigBoss = new User("Bill", "Klinton", 70);
        bigBoss.addSubordinators(personal);

        System.out.println(bigBoss);
    }
}