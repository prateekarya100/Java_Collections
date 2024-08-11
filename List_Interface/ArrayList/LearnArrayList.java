package List_Interface.ArrayList;

import java.util.Arrays;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        /*ArrayList KEY FEATURES
        --------> increase capacity by 50% of previous size
        --------> not thread safe
        --------> used array internally
        --------> not synchronized
        --------> dynamic in nature
        --------> provides only [iterator] which is not fast
        * */

         List<Person> personList = Arrays.asList(
                 new Person("prateek arya","PA","broadridge client onboarding"),
                 new Person("shivangi upadhyay","PA","broadridge client onboarding"),
                 new Person("ayush rathore","SA","goldman sachs"),
                 new Person("yakub ahmed","PAT","alphabet"),
                 new Person("manan singh","PA","pepsico"),
                 new Person("jatin rao","PA","pepsico"),
                 new Person("jagmohan yadav","AEM","pepsico"));
//        personList.stream().toList().toString();
        System.out.println(personList);
//        System.out.print(personList.stream()
//                .filter(p->p.getDesignation().equals("PA")).toList());

//        List_Interface.LinkedList.ArrayList<Integer> List_Interface.LinkedList.ArrayList=new List_Interface.LinkedList.ArrayList<>();
//        List_Interface.LinkedList.ArrayList.add(10);
//        List_Interface.LinkedList.ArrayList.add(20);
//        List_Interface.LinkedList.ArrayList.add(30);
//        List_Interface.LinkedList.ArrayList.add(15);
//        List_Interface.LinkedList.ArrayList.add(40);
//        System.out.println(List_Interface.LinkedList.ArrayList.stream().filter(integer -> integer%2!=0).collect(Collectors.toList()));

//        List_Interface.LinkedList.ArrayList<Integer> List_Interface.LinkedList.ArrayList=new List_Interface.LinkedList.ArrayList<>(5);
//        List_Interface.LinkedList.ArrayList.add(2);
//        List_Interface.LinkedList.ArrayList.add(5);
//        List_Interface.LinkedList.ArrayList.add(12);
//        List_Interface.LinkedList.ArrayList.add(79);
//        List_Interface.LinkedList.ArrayList.add(11);
//        List_Interface.LinkedList.ArrayList.add(124);
//        List_Interface.LinkedList.ArrayList.add(112);
//        System.out.println(List_Interface.LinkedList.ArrayList);
    }
}
