import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //// Task 1
        System.out.println("Task 1");

        Scanner read = new Scanner(System.in);

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        // System.out.print("Введите имя - ");
        // String firstName = read.next();

        // System.out.print("Введите отчество ");
        // String middleName = read.next();

        // System.out.print("Введите фамилию ");
        // String lastName = read.next();

        // String fullName = "Ф. И. О. сотрудника — " + lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        read.close();

        //// Task 2
        System.out.println();
        System.out.println("Task 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //// Task 3
        System.out.println();
        System.out.println("Task 3");

        String fullName2 = "Иванов Семён Семёнович";

        // String modificationFullName2 = fullName2.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2.replace('ё', 'е'));
        // System.out.println("Данные Ф. И. О. сотрудника — " + modificationFullName2);


    }
}