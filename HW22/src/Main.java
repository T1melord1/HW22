import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> peopleAffairs = new ArrayList<>();
    private static final String ABC = "[А-я ]+";

    public static void main(String[] args) {
        //todo для выполнения дз создавать классы не нужно. Просто создавайте
        // необходимые вам методы и переменные. Основная логика программы будет в методе main

        peopleAffairs.add("Купить пиво");
        peopleAffairs.add("Найти монету");
        peopleAffairs.add("Заправить машину");
        peopleAffairs.add("Сходить на работу");

        while (true) {

            System.out.println("What do you want to do: ");
            System.out.println("1 - add\n" + "2 - del\n" + "3 - change\n" + "4 - print all");

            Integer choice = new Scanner(System.in).nextInt();

            if(choice == 1){
                System.out.println("Введите дело: ");
                String affair = new Scanner(System.in).nextLine();
                addLast(affair);
            }
            else if (choice == 2) {
                System.out.println("Введите индекс дела: ");
                Integer choice2 = new Scanner(System.in).nextInt();
                delOnIndex(choice2);
                print();
            }
            else if (choice == 3) {
                System.out.println("Введите индекс дела: ");
                Integer choice2 = new Scanner(System.in).nextInt();
                System.out.println("Введите дело: ");
                String affair = new Scanner(System.in).nextLine();
                changeAffair(choice2,affair);
            }
            else if (choice == 4) {
                print();
            }

        }
    }

    public static void addLast(String affair) {
        if (affair.matches(ABC)) {
            peopleAffairs.addLast(affair);
            System.out.println("Добавлено дело: " + affair + "\n");
        } else {
            System.out.println("Дело не добавлено, неправильный ввод" + "\n");
        }
    }

    public static void addOnIndex(int index, String affair) {
        if (peopleAffairs.size() < index) {
            addLast(affair);
            System.out.println("Добавлено дело: " + affair + " в конец списка" + "\n");
        } else {
            peopleAffairs.add(index, affair);
            System.out.println("Добавлено дело: " + affair + " на " + index + " место ");
        }
    }

    public static void delOnIndex(int index) {
        if (peopleAffairs.size() <= index) {
            System.out.println("Неправильный индекс!!");
        } else {
            peopleAffairs.remove(index);
        }
    }

    public static void changeAffair(int index, String affair) {
        delOnIndex(index);
        addOnIndex(index, affair);
    }

    public static void print() {
        for (String peopleAffair : peopleAffairs) {
            System.out.println(peopleAffair);
        }
    }
}