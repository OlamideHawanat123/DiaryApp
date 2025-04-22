package MyTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DiaryApp{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        System.out.println("Do you want to create an account?");
        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("yes")){
            System.out.println("What is your name?");
            String name = input.nextLine();

            System.out.println("What is your password?");
            String password = input.nextLine();

            Diary diary = new Diary(name, password);









        }

    }



}
