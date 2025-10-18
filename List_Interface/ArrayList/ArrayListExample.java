package List_Interface.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {


        // printing names of my friends in uppercase using stream api
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("prateek","varnita","jamaal","vani","kavita","naveen"));

//        names.forEach(System.out::println);
//        names.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
