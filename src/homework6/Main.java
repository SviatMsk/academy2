package homework6;
//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
//        В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//        Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//        Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
//        Не забываем закрывать потоки.
//        В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("1", "2", 3));
        list.add(new User("4", "5", 6));
        list.add(new User("7", "8", 9));
        list.add(new User("10", "11", 12));
        list.add(new User("13", "14", 15));
        list.add(new User("16", "17", 18));
        list.add(new User("17", "18", 19));
        list.add(new User("20", "21", 22));
        list.add(new User("23", "24", 25));
        list.add(new User("26", "27", 28));

        File users = new File("src/homework6/usersFile");
        if (!users.exists()) {
            users.mkdirs();
        }
            for (User user : list) {
                String file = "src/homework6/usersFile/list" + user.getFirstName() + "" + user.getLastName() + ".txt";
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                    oos.writeObject(user);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println(user.getFirstName() + " " + user.getLastName() + " serialized");
            }
        }
    }