package Set_Interface.part2;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExamples  {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("prateek arya","PA","broadridge client onboarding",46000L),
                new Person("shivangi upadhyay","PA","broadridge client onboarding",46000L),
                new Person("ayush rathore","SA","goldman sachs",46000L),
                new Person("yakub ahmed","PAT","alphabet",66250L),
                new Person("manan singh","PA","pepsico",213400L),
                new Person("jatin rao","PA","pepsico",39200L),
                new Person("jagmohan yadav","AEM","pepsico",46000L));
//------------------------------------------------------------------------------------------------------------------
//      provides sorted data
//      used BINARY SEARCH TREE internally
//      duplicates not allows as follows Set properties
//      NULL not allowed
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(60);
//        treeSet.add(null);
        System.out.println(treeSet);

//=========================================================================================================
//        TreeSet<String> treeSet=new TreeSet<>();
//        System.out.println(treeSet.getClass());
//        System.out.println(treeSet);

//        TreeSet<String> treeSet=new TreeSet<>();
//        for (int i = 0; i < personList.size() ; i++) {
//            String names=personList.get(i).getName();
//            treeSet.add(names);
//        }
//        System.out.println(treeSet);
//-------------------------------------------------------------------------------------

//        ** Important Problem with TreeSet
//    ==> if Class object is passed into TreeSet then,
//                we got Comparable Interface class cast exception
//
//                SOLUTION==> implement Comparable Interface first,
//        and write CompareTo() by which
//        TreeSet can sort data.

//        TreeSet<Person> treeSet=new TreeSet<Person>();
//        for (int i = 0; i < personList.size(); i++) {
//            treeSet.add(personList.get(i));
//        }
//        System.out.println(treeSet);
//        System.out.println(treeSet.stream().
//                filter(person -> person.getSalary()<=50000)
//                .collect(Collectors.toList()));
    }
}
