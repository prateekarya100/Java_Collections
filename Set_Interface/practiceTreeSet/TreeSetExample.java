package Set_Interface.practiceTreeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("prateek arya", "programmer analyst", "goldman sachs", 30462L),
                new Person("kavita singh", "programmer analyst", "goldman sachs", 3462L),
                new Person("anuj arya", "programmer analyst", "goldman sachs", 74462L),
                new Person("varnita makrariya", "programmer analyst trainee", "iot io practice", 2462L),
                new Person("rishab kumar", "programmer analyst", "pepsico", 7462L),
                new Person("prateek kuhad", "programmer analyst trainee", "broadridge financial sols", 30462L));

        TreeSet<Person> treeSet = new TreeSet<>(personList);
//        System.out.println(treeSet);

//        find details of the person from list of objects by matching their name
//        for (Person person:treeSet) {
//            if (person.getName().equals("varnita makrariya"))
//            System.out.println(person);
//        }

//        System.out.println(treeSet.stream()
//                .filter(person -> person.getName().equals("varnita makrariya")).toList());
        System.out.println(treeSet.stream()
                .filter(person -> person.getDesignation()
                        .equals("programmer analyst trainee")).toList());
    }
}
