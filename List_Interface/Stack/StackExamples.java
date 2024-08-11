package List_Interface.Stack;

import List_Interface.ArrayList.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
/*        push(),pop(),peek(),empty(),search()

    HOW STACK IMPLEMENTS
    stack --> extends--> vector -->
                         extends--> abstractList
                                        -->extends-->AbstractCollection
                                            --> implements--> List interface

    note** //        -------> used array internally
    ------
    stack does not implement list interface directly but follow above workflow
  */
//        adding few car names into stack
//---------------------------------------
//---------------------------------------
//        **remember
//        -------> List interface does not support some methods
//                 which is inside stack so try to create object directly by
//                 stack at both side.


//        List Interface--> stack implementation class
//        List<String> stack=new List_Interface.LinkedList.Stack<>();
//        list reference ----> stack constructor calling = [ creates object of stack by taking
//                                                         [  reference of list interface
//        List_Interface.LinkedList.Stack<String> stack=new List_Interface.LinkedList.Stack<>();
//        System.out.println(stack.isEmpty());
//        stack.add("maruti suzuki");
//        stack.add("honda city");
//        stack.add("ciaz");
//        stack.add("verna");
//        stack.add("mercedes benz");
//        System.out.println(stack.isEmpty());
//        System.out.println(stack);

//        stack.push("micra");
//        System.out.println(stack);
//        stack.pop();
//        stack.pop();
//        System.out.println(stack);

//        int index=stack.search("maruti suzuki");
//        System.out.println("element found at::"+index);
//        System.out.println("top of the stack::"+stack.peek());
//        System.out.println(stack.empty());
//###################################################################################

        List<Person> personList = Arrays.asList(
                new Person("prateek arya","PA","broadridge client onboarding"),
                new Person("shivangi upadhyay","PA","broadridge client onboarding"),
                new Person("ayush rathore","SA","goldman sachs"),
                new Person("yakub ahmed","PAT","alphabet"),
                new Person("manan singh","PA","pepsico"),
                new Person("jatin rao","PA","pepsico"),
                new Person("jagmohan yadav","AEM","pepsico"));

        //      Exercise ==> adding realtime list of objects into stack
                Stack<Person> personStack=new Stack<>();
        for (int i = 0; i < personList.size() ; i++) {
            personStack.add(personList.get(i));
        }
//        check type of class hold objects
//        System.out.println(personStack.getClass());
//          System.out.println(personStack);

        //top of the stack
//          System.out.println(personStack.peek());
//        check whether stack is empty or not
//        System.out.println("Is List_Interface.LinkedList.Stack is Empty :: "+personStack.empty());

//        adding new object into stack
        personStack.push(new Person("manu bhaker","agile specialist","mexmento"));
//        System.out.println(personStack);
//        System.out.println(personStack.peek());
//      pop delete element from top of the stack
//        personStack.pop();
//        System.out.println(personStack);
//      search specific element from stack
//        int foundAtIndex=personStack.search(personList.get(3));
//        System.out.println("found_At_Index :: "+foundAtIndex);
//        System.out.println(personStack.get(foundAtIndex).setName("vani garg"));
//        personStack.get(foundAtIndex).setDesignation("PAT");
        System.out.println(personStack);

    }
}
