package MyTasks;
import java.util.Scanner;

public class DiaryApplication {

    public static void unsuccessfulUnlockStatus() {
        System.out.println("Enter the correct password to unlock the diary, you thief!");
    }

        public static void menu(){

            System.out.println("""
                    
                    Welcome to Olamide Diary App
                    1). Create an entry
                    2). Update an existing entry
                    3). Delete existing entry
                    4). View entry
                    5). Lock Diary App
                    6). Unlock Diary App
                    7). Exit
                    """);

        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        while (name.isEmpty()) {
            System.out.println("Invalid name, enter your real name mf");
            name = scanner.nextLine();
        }
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        while (password.isEmpty()) {
            System.out.println("Invalid password, enter your password mf");
            password = scanner.nextLine();

        }

        Diary diary = new Diary(name, password);
       /* if (diary.isLocked()) {
            diary.unlockDiary(password);
*/

        boolean isRunning = true;
        while (isRunning) {
            menu();
            System.out.println("Kindly Select from these options");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("What is the title of the entry?");
                    String title = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("What is the content of the entry?");
                    String content = scanner.nextLine();

                    diary.createEntry(title, content);
                    break;

                case 2:

                    System.out.println("What is the id of the entry you want to update?");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the updated title:");
                    String updatedTitle = scanner.next();
                    scanner.nextLine();

                    System.out.println("Enter the updated content:");
                    String updatedContent = scanner.nextLine();
                    diary.updateEntry(updateId, updatedTitle, updatedContent);
                    break;

                case 3:
                    System.out.println("What is the id of the entry you want to delete?");
                    int deleteId = scanner.nextInt();

                    diary.deleteEntry(deleteId);
                    System.out.println("Diary deleted successfully");
                    break;

                case 4:
                    System.out.println("What is the id of the entry you want to view?");
                    int entryId = scanner.nextInt();
                    scanner.nextLine();

                    Entry entry = (Entry) diary.findEntryById(entryId);
                    if(entry != null) {
                        System.out.println("Title: " + entry.getTitle());
                        System.out.println("Content: " + entry.getContent());
                        System.out.print("Date: " + entry.getDate());
                    }

                    break;

                case 5:
                    diary.lock();
                    System.out.println("Locked successfully");
                    break;

                case 6:

                    System.out.println("Enter your password");
                    String yourPassword = scanner.nextLine();
                    while (!yourPassword.equals(password)) {
                        System.out.println("Invalid password, enter your password mf");
                        yourPassword = scanner.nextLine();
                    }
                    diary.unlockDiary(password);

                    break;


                case 7:
                    isRunning = false;
                    System.out.println("Exiting the app, thank you for using Olamide Diary App");
                    break;


                default:
                    System.out.print("Choice should be within the range of provided options!, you seriously don't need me to spell that out to you");

            //}
        }
        }

    }
}
