package Set_Interface.part1;

import List_Interface.ArrayList.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetExamples {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("prateek arya","PA","broadridge client onboarding"),
                new Person("shivangi upadhyay","PA","broadridge client onboarding"),
                new Person("ayush rathore","SA","goldman sachs"),
                new Person("yakub ahmed","PAT","alphabet"),
                new Person("manan singh","PA","pepsico"),
                new Person("jatin rao","PA","pepsico"),
                new Person("jagmohan yadav","AEM","pepsico"));
//------------------------------------------------------------------------------------------------------------------

//        HashSet<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(2);
//        set.add(80);
//        set.add(40);
//        set.add(10);
//        set.add(5);
//        System.out.println(set);

//      hashSet-->implements-->Set Interface
//      not maintains order
//      not synchronized
//      not thread safe
        HashSet<Person> hashSet=new HashSet<>(personList);
        System.out.println(hashSet);
    }
}
