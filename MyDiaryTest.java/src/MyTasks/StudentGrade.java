package MyTasks;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
        public static void successfulSaving() {
            System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saving successful!");
        }

        public static void unsuccessfulSaving() {
            System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saving unsuccessful!");
        }

        public static void displayScores(int numberOfStudents, int numberOfCourses, int[][] studentScores) {
            System.out.println("===================================================================");
            System.out.print("STUDENT\t\t");

            for (int count = 1; count <= numberOfCourses; count++) {
                System.out.print("SUB" + count + "\t");
            }
            System.out.print("TOT\t");
            System.out.print("AVE\t");
            System.out.println("POS");
            System.out.println("===================================================================");

            for (int count = 0; count < studentScores.length; count++) {
                for (int counter = 0; counter < studentScores[count].length; counter++) {
                    System.out.print(studentScores[count][counter]);
                }

            }
        }


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();

            System.out.print("Enter the number of courses: ");
            int numberOfCourses = input.nextInt();

            if(numberOfStudents > 0 && numberOfCourses > 0){
                successfulSaving();
            }
            else {
                unsuccessfulSaving();
                System.out.print("Enter the number of students: ");
                numberOfStudents = input.nextInt();

                System.out.print("Enter the number of courses: ");
                numberOfCourses = input.nextInt();
            }

            int[][] students = new int[numberOfStudents][numberOfCourses];

            int score;
            for (int count = 0; count < numberOfStudents; count++) {
                for (int counter = 0; counter < numberOfCourses; counter++) {
                    System.out.println("Entering score for student" + (count + 1) + ":");
                    System.out.println("Enter score for course" + (counter + 1) + ":");
                    students[count][counter] = input.nextInt();

                    successfulSaving();
                }
            }


            displayScores(numberOfStudents, numberOfCourses, students);






        }
    }



