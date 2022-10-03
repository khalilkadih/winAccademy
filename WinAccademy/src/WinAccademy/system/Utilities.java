package WinAccademy.system;

import java.util.Optional;
import java.util.Scanner;

public class Utilities {


    public static boolean login() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Entre your username");
        String name = sc.nextLine();
        System.out.println("Enter your password");
        String password = sc.nextLine();
       Optional<User> userOptional= Main.users.stream().filter(user -> user.getEmail().equalsIgnoreCase(name) && user.getPassword().equals(password)).findFirst();
        if(userOptional.isPresent()){
            Main.loggedInUser=userOptional.get();
        }
        return userOptional.isPresent();
    }

}


