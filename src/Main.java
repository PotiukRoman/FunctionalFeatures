import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        User user1=new User("Одисей",25);
        User user2=new User("Аврора",70);
        User user3=new User("Соломон",60);
        User user4=new User("Весняна",20);
        User user5=new User("Ахілес",28);
        User user6=new User("Кассандра",45);
        User user7=new User("Златослав",18);
        User user8=new User("Санта",22);
        User user9=new User("Ксенофонт",35);
        User user10=new User("Октавія",28);

        List<User> list=new ArrayList<>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);

        System.out.println(list);
        System.out.println();

        List<User> result = list.stream()
                .filter(user -> user.getAge()<=30)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}