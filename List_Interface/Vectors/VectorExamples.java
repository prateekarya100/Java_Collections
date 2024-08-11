package List_Interface.Vectors;

import List_Interface.ArrayList.Person;

import java.util.*;

public class VectorExamples {
    public static void main(String[] args) {
/*KEY FEATURES OF VECTORS
-------> not maintains insertion order
-------> thread safe
-------> used array internally
-------> synchronized,locked
-------> double 100% capacity
-------> ConcurrentModificationException Error => vector provides --> iterator,enumerators
* */

        List<Person> personList = Arrays.asList(
                new Person("prateek arya","PA","broadridge client onboarding"),
                new Person("shivangi upadhyay","PA","broadridge client onboarding"),
                new Person("ayush rathore","SA","goldman sachs"),
                new Person("yakub ahmed","PAT","alphabet"),
                new Person("manan singh","PA","pepsico"),
                new Person("jatin rao","PA","pepsico"),
                new Person("jagmohan yadav","AEM","pepsico"));
//########################################################################################################

        Vector<String> friends=new Vector<>();
        for (int i = 0; i < personList.size(); i++) {
            friends.add(personList.get(i).getName());
        }
//        getting class name which hold objects of arraylist
//        System.out.println(friends.getClass());
//        System.out.println(friends);
        Enumeration<String> enumeration=friends.elements();
        while (enumeration.hasMoreElements()){
            String currentElement= enumeration.nextElement();
            if (currentElement.equals("yakub ahmed")){
                friends.add("varnita makrariya");
            }
        }
//        Collections.sort(friends);
    //        friends.add(null);
        System.out.println(friends);

        Vector<String> friendNames=new Vector<>();
        for (int i = 0; i < personList.size(); i++) {
            String currName= personList.get(i).getName();
            friendNames.add(currName);
        }
//        System.out.println(friendNames);
//        Iterator<String> iterator= friendNames.iterator();
//        while (iterator.hasNext()){
//            String currValue=iterator.next();
//            if ("jatin rao".equals(currValue)){
//                friendNames.add("monika shetty");
//            }
//        }
//            System.out.println(friendNames);

// # CONVERTING VECTOR INTO ARRAYLIST

//        ArrayList<String> convertFromVector=new ArrayList<>(friendNames);
//        System.out.println(convertFromVector.getClass());
    }
}
