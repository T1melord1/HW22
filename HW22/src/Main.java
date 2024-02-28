import java.util.ArrayList;
import java.util.List;

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

        addLast("Сходить на улицу");

//        addOnIndex(2, "Сломать дом");
//
//        delOnIndex(0);
//
//        changeAffair(0, "Changed affair");

        for (String peopleAffair : peopleAffairs) {
            System.out.println(peopleAffair);
        }


    }

    public static void addLast(String affair) {
        if(affair.matches(ABC)) {
            peopleAffairs.addLast(affair);
            System.out.println("Добавлено дело: " + affair + "\n");
        }else{
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
        if (peopleAffairs.size() < index) {
            System.out.println("");
        } else {
            peopleAffairs.remove(index);
        }
    }

    public static void changeAffair(int index, String affair){
        delOnIndex(index);
        addOnIndex(index,affair);
    }

}