package WinAccademy.system;

import java.util.Scanner;

public class Login {
    public Login() {
        User user= new User();
    }

    public void login(){


    try(Scanner sc= new Scanner(System.in)){

    System.out.println("Entre your username");
    String name=sc.nextLine();
    System.out.println("Enter your password");
    String password = sc.nextLine();
    if("khalil".equals(name) && "123".equals(password)){
        System.out.println("You are loged");
    }
    else {
        System.out.println("Invalid password or user name");
    }
}
}
}
