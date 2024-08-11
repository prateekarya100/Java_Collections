package Queue_Interface.PriorityQue;

import Queue_Interface.ArrayDeque.Patients;

import java.util.*;

public class PriorityQueExamples {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("prateek arya", "programmer analyst", "goldman sachs", 30462L),
                new Person("kavita singh", "programmer analyst", "goldman sachs", 34672L),
                new Person("anuj arya", "programmer analyst", "goldman sachs", 74462L),
                new Person("varnita makrariya", "programmer analyst trainee", "iot io practice", 2462L),
                new Person("rishab kumar", "programmer analyst", "pepsico", 7462L),
                new Person("prateek kuhad", "programmer analyst trainee", "broadridge financial sols", 30462L));
//      Java uses MIN_Heap PriorityQue By Default

//      gives 1st item --> peek() provides --> NULL
//      gives 1st item --> element() throws --> Exception
//        Queue<Integer> priorityQueue = new PriorityQueue<>();
//        System.out.println(priorityQueue);
//        priorityQueue.add(100);
//        System.out.println(priorityQueue);
//        priorityQueue.poll();
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.element());

//--------------------------------------------------------------------------------------------
//QUESTION--> FIND 2ND MINIMUM VALUE FROM THE QUEUE/LIST
//        List<Integer> arr = Arrays.asList(8, 4, 1, 16, 2, 3);
//        MAX HEAP
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        for (int i = 0; i < arr.size(); i++) {
//            pq.offer(arr.get(i));
//        }
//        while (!pq.isEmpty())
//        System.out.print(pq.poll()+" ");
//        System.out.println();
//        System.out.println(pq);

//        if (!pq.isEmpty()){
//            pq.poll();
//            System.out.println(pq.peek());
//        }

//        System.out.println(pq.peek());
//----------------------------------------------------------------------------------------------------

//        Collections.reverse(personList);
//        FOLLOW MIN HEAP
        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>(personList);
//        System.out.println(personPriorityQueue);
//        System.out.println("REMOVED :: "+personPriorityQueue.poll());
//        System.out.println(personPriorityQueue);
//        System.out.println(personPriorityQueue.peek());
        personPriorityQueue.offer(new Person("ravina yadav", "biologist", "neural pathy research", 47232L));
//        personPriorityQueue.poll();
//        System.out.println(personPriorityQueue);
//        for (Person p:personPriorityQueue) {
//            System.out.println(p);
//        }
//------------------------------------------------------------------------------------------------------
        List<Patients> patientsList=Arrays.asList(
                new Patients("prateek","fever",4L),
                new Patients("abhishek","stomach pain",5L),
                new Patients("kusum","fever",6L),
                new Patients("aman","cardiac arrest",9L));
        PriorityQueue<Patients> patients=new PriorityQueue<>(patientsList);
        System.out.println(patients);
    }
}
