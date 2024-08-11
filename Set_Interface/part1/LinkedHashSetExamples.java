package Set_Interface.part1;

import List_Interface.ArrayList.Person;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetExamples {
    public static void main(String[] args) {
        List<List_Interface.ArrayList.Person> personList = Arrays.asList(
                new List_Interface.ArrayList.Person("prateek arya","PA","broadridge client onboarding"),
                new List_Interface.ArrayList.Person("shivangi upadhyay","PA","broadridge client onboarding"),
                new List_Interface.ArrayList.Person("ayush rathore","SA","goldman sachs"),
                new List_Interface.ArrayList.Person("yakub ahmed","PAT","alphabet"),
                new List_Interface.ArrayList.Person("manan singh","PA","pepsico"),
                new List_Interface.ArrayList.Person("jatin rao","PA","pepsico"),
                new Person("jagmohan yadav","AEM","pepsico"));
//------------------------------------------------------------------------------------------------------------
//        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
//        linkedHashSet.add(10);
//        linkedHashSet.add(50);
//        linkedHashSet.add(10);
//        linkedHashSet.add(60);
//        linkedHashSet.add(550);
//        System.out.println(linkedHashSet);

//      maintains order as LinkedList follows List properties
//      hashMap table is maintained,data store using hashCode
//      follow set properties not allows duplicates
        LinkedHashSet<Person> linkedHashSet=new LinkedHashSet<>(personList);
        System.out.println(linkedHashSet);

    }
}
