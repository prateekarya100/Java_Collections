package Map_Interface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class HashMapExamples {
    public static void main(String[] args) {
//        List list = Arrays.asList(1,34,24,3,4,12,03);
//        HashMap<Integer,Integer> hashMap=new HashMap<>();
//        hashMap.put(1,10);
//        hashMap.put(1,70);
//        hashMap.put(2,20);
//        hashMap.put(3,40);
//        System.out.println(hashMap);

//        hashMap.putIfAbsent(4,80);
//        System.out.println(hashMap);
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//        System.out.println("Is HashMap isEmpty = "+hashMap.isEmpty());
//        System.out.println("Is HashMap containsKey = "+hashMap.containsKey(3));
//        System.out.println("Is HashMap containsValue = "+hashMap.containsValue(44));
//        System.out.println(hashMap);
//        System.out.println(hashMap.entrySet());
//
//        Iterator iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext())
//            System.out.println("Key = "+iterator.next()+" ");
//
//        Iterator iterator2 = hashMap.values().iterator();
//        while (iterator2.hasNext())
//            System.out.println("Value = "+iterator2.next()+" ");

        List<Student> list=Arrays.asList(
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

//        System.out.println(list);
        HashMap<Integer,Student> studentHashMap=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            studentHashMap.put(list.get(i).getRollNo(),
                    list.get(i));
        }
//        System.out.println(studentHashMap);
        studentHashMap.putIfAbsent(100,new Student(100,"varnita makrariya"));
//        System.out.println(studentHashMap);
//        System.out.println(studentHashMap.get(100));
//        System.out.println(studentHashMap);
//        System.out.println(studentHashMap.getClass());
//---------------------------------------------------------------------------------------------

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
