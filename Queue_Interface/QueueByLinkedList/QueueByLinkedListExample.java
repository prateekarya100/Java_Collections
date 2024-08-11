package Queue_Interface.QueueByLinkedList;

import Set_Interface.practiceTreeSet.Person;

import java.util.*;

public class QueueByLinkedListExample {
//    offer(),poll(),peek()
//    add = offer [ adding new element from end of the queue list]
//    remove = poll [remove 1st element from queue list]
//    LinkedList ==> [add(),remove()]
/*
                 WHY WE USE OFFER() WITH QUEUE NOT ADD()
                 ---------------------------------------
                   NOT RECOMMENDED THESE METHODS
                   [add(),remove()],
                   BECAUSE AT THE TIME OF ADDING
                   ELEMENTS INTO QUEUE, IF THE ELEMENT
                   NOT ADDED SUCCESSFULLY INTO QUEUE ,
                   THEN QUEUE CAN GENERATE EXCEPTION
                   BUT WITH OFFER() METHOD
                   OFFER RETURNS TRUE IF ELEMENT ADDED SUCCESSFULLY
                   OTHERWISE RETURNS FALSE;
*/

    /*
                     WHY WE USE POLL() WITH QUEUE NOT REMOVE()
                     ---------------------------------------
                       NOT RECOMMENDED THESE METHODS
                       [add(),remove()],
                       BECAUSE AT THE TIME OF DELETING
                       ELEMENTS FROM QUEUE, IF THE ELEMENT
                       NOT DELETED SUCCESSFULLY FROM QUEUE ,
                       THEN QUEUE CAN GENERATE EXCEPTION
                       BUT WITH POLL() METHOD
                       POLL RETURNS NULL VALUE IF ELEMENT NOT DELETED
                       SUCCESSFULLY OTHERWISE RETURNS TRUE;
    */
    public static void main(String[] args) {
        List<Set_Interface.practiceTreeSet.Person> personList = Arrays.asList(
                new Set_Interface.practiceTreeSet.Person("prateek arya", "programmer analyst", "goldman sachs", 30462L),
                new Set_Interface.practiceTreeSet.Person("kavita singh", "programmer analyst", "goldman sachs", 34672L),
                new Set_Interface.practiceTreeSet.Person("anuj arya", "programmer analyst", "goldman sachs", 74462L),
                new Set_Interface.practiceTreeSet.Person("varnita makrariya", "programmer analyst trainee", "iot io practice", 2462L),
                new Set_Interface.practiceTreeSet.Person("rishab kumar", "programmer analyst", "pepsico", 7462L),
                new Person("prateek kuhad", "programmer analyst trainee", "broadridge financial sols", 30462L));
//============================================================================================================================================================

//        Queue<Integer> queue=new LinkedList<>();
//        queue.offer(10);
//        queue.offer(20);
//        queue.offer(30);
//        queue.offer(40);
//        queue.add(50);
//////        NULL ALLOWED
//        queue.offer(null);
//        System.out.println(queue.getClass());
//============================================================================================================================================================

        Queue<Person> personQueue=new LinkedList<>(personList);
        System.out.println(personQueue);
        System.out.println("DELETED :: "+personQueue.poll());
        System.out.println(personQueue);
        personQueue.offer(new Person("lovely singh","data analyst","maruti suzuki",27373L));
        System.out.println(personQueue);

        System.out.println(personQueue.stream()
                .filter(person -> person.getSalary()>34500).toList());

    }
}
