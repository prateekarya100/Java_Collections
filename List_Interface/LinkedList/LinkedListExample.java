package List_Interface.LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListExample {
            static java.util.List<List_Interface.ArrayList.Person> personList = Arrays.asList(
                    new List_Interface.ArrayList.Person("prateek arya","PA","broadridge client onboarding"),
                    new List_Interface.ArrayList.Person("shivangi upadhyay","PA","broadridge client onboarding"),
                    new List_Interface.ArrayList.Person("ayush rathore","SA","goldman sachs"),
                    new List_Interface.ArrayList.Person("yakub ahmed","PAT","alphabet"),
                    new List_Interface.ArrayList.Person("manan singh","PA","pepsico"),
                    new List_Interface.ArrayList.Person("jatin rao","PA","pepsico"),
                    new List_Interface.ArrayList.Person("jagmohan yadav","AEM","pepsico"));
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
//        linkedList.add(0,10);
//        linkedList.add(20);
//        linkedList.add(30);
//        linkedList.add(40);
//        System.out.println(linkedList);

//      storing List_Interface.LinkedList.ArrayList objects into linkedList
        for (int i = 0; i < personList.size(); i++) {
            linkedList.add(personList.get(i));
        }
//        System.out.println(linkedList);
//        System.out.println(linkedList.getClass());

//        delete 3rd object from linkedList
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.remove());
//        System.out.println(linkedList);

//        GET firstElement
//          System.out.println(linkedList.getFirst());
//        GET lastElement
//        System.out.println(linkedList.getLast());

//      GETTING FIRST ELEMENT FROM THE LIST
//        System.out.println(linkedList.pop());
        linkedList.push(new Person("kavita kaushik",
                "servicenow developer",
                "commsMedia"));
//        System.out.println(linkedList);

        Set<List_Interface.ArrayList.Person> personSet=new HashSet<>();
        for (int i = 0; i < personList.size() ; i++) {
            personSet.add(personList.get(i));
        }
//       getting type which class it relates
//       System.out.println(personSet.getClass());

//       List Interface => implementation classes=> [List_Interface.LinkedList.ArrayList,List_Interface.LinkedList,List_Interface.LinkedList.Stack,Vector]
//       -----------------------------------------------------------------------------
//       # maintains order
//       # can store Any-Type of values
       /*
        linkedList.add('R');
        linkedList.add(10);
        linkedList.add(false);
        */
//        linkedList.set(0,new Person("testing","test","test project"));
        System.out.println(linkedList);
    }
}
