package Map_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class TreeMapExamples {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(
                new Student(1,"prateek"),
                new Student(2,"aman"),
                new Student(3,"prajjwal"),
                new Student(4,"kartik"),
                new Student(5,"prateek arya"),
                new Student(1,"kavita singh"),
                new Student(45,"anuj arya"),
                new Student(22,"varnita makrariya"),
                new Student(13,"rishab kumar"),
                new Student(19,"prateek kuhad"));

        TreeMap<Integer,Student> studentTreeMap=new TreeMap<>();
        for (int i = 0; i < list.size(); i++){
            studentTreeMap.put(list.get(i).getRollNo(),
                    list.get(i));
        }
//        System.out.println(studentTreeMap.pollFirstEntry());
//        System.out.println(studentTreeMap);

//        System.out.println(studentTreeMap);
//        System.out.println(studentTreeMap.pollLastEntry());
//        System.out.println(studentTreeMap);

//        System.out.println(studentTreeMap.keySet());
//        System.out.println(studentTreeMap.entrySet());
//        System.out.println("Size of studentTreeMap = "+studentTreeMap.size());
//        System.out.println(studentTreeMap.descendingKeySet());

//        DESCENDING ORDERING OF TreeMap
        for (Integer key:studentTreeMap.descendingKeySet()) {
            System.out.println(studentTreeMap.get(key));
        }
        System.out.println(studentTreeMap.containsKey(45));
        studentTreeMap.putIfAbsent(26,new Student(26,"ravina yadav"));
        System.out.println(studentTreeMap);
//        System.out.println(studentTreeMap.getClass());
    }
}
