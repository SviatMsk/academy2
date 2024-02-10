package homework6;

import java.io.Serializable;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
//        В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//        Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//        Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
//        Не забываем закрывать потоки.
//        В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
public class User  implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public User(String name, String lastname, int age) {
        this.firstName = name;
        this.lastName = lastname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}