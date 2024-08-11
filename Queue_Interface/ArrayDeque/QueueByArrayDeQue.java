package Queue_Interface.ArrayDeque;

import Set_Interface.practiceTreeSet.Person;

import java.util.*;

public class QueueByArrayDeQue {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Set_Interface.practiceTreeSet.Person("prateek arya", "programmer analyst", "goldman sachs", 30462L),
                new Set_Interface.practiceTreeSet.Person("kavita singh", "programmer analyst", "goldman sachs", 34672L),
                new Set_Interface.practiceTreeSet.Person("anuj arya", "programmer analyst", "goldman sachs", 74462L),
                new Set_Interface.practiceTreeSet.Person("varnita makrariya", "programmer analyst trainee", "iot io practice", 2462L),
                new Set_Interface.practiceTreeSet.Person("rishab kumar", "programmer analyst", "pepsico", 7462L),
                new Person("prateek kuhad", "programmer analyst trainee", "broadridge financial sols", 30462L));
//============================================================================================================================================================
//        offerFirst = addFirst = push
//        removeFirst = poll = remove = pollFirst
//        removeLast = pollLast
//---------------------------------------------------------


//        Deque<Integer> arrayDeque=new ArrayDeque<>();
//        arrayDeque.offer(10);
//        arrayDeque.offer(20);
//        arrayDeque.offer(30);
//        arrayDeque.addFirst(40);
//        arrayDeque.offerFirst(50);
//        arrayDeque.addLast(60);
//        arrayDeque.offerLast(70);
//        System.out.println(arrayDeque);
//        arrayDeque.poll();
//        System.out.println(arrayDeque.pollFirst());;
//        System.out.println(arrayDeque);
//=========================================================================================================

        Deque<Person> personArrayDeque = new ArrayDeque<>(personList);
        System.out.println(personArrayDeque);
//        FIND LAST PERSON INSIDE ARRAY_DeQUE
//        System.out.println(personArrayDeque.peekLast());

//        FIND PERSON WHO ADDED FIRST INSIDE DeQUEUE
//        System.out.println(personArrayDeque.peekFirst());
//        System.out.println(personArrayDeque);

//        REMOVE FROM FIRST INSIDE DeQUEUE
//        -------------------------------
//        System.out.println(personArrayDeque.poll());
//        System.out.println(personArrayDeque.removeFirst());
//        System.out.println(personArrayDeque.remove());
//        System.out.println(personArrayDeque.pollFirst());

//        REMOVE FROM LAST
//        -----------------
//        System.out.println(personArrayDeque.removeLast());
//        System.out.println(personArrayDeque.pollLast());

//        ADD NEW PERSON DETAILS INSIDE DeQUEUE AT STARTING
//        personArrayDeque.addFirst(
//                new Person("varnita makrariya","programmer analyst trainee","iot io practice",27800L));

//        personArrayDeque.offerFirst(new Person("varnita makrariya","programmer analyst trainee","iot io practice",27800L));
//        personArrayDeque.push(new Person("varnita makrariya","programmer analyst trainee","iot io practice",27800L));
//        System.out.println(personArrayDeque);
    }
}
