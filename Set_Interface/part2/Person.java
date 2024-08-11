package Set_Interface.part2;

public class Person implements Comparable<Person> {
    private String name;
    private String designation;
    private String project;
    private Long salary;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", project='" + project + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Person(String name, String designation, String project, Long salary) {
        this.name = name;
        this.designation = designation;
        this.project = project;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Person person) {
//        CUSTOM LOGIC FOR SORT DATA
        if (salary > person.getSalary()) {
            return 1;
        } else if (salary < person.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }

//    public static void main(String[] args) {
//        List<Person> personList = Arrays.asList(
//                new Person("prateek arya","PA","broadridge client onboarding",30462L),
//                new Person("shivangi upadhyay","PA","broadridge client onboarding",10462L),
//                new Person("yakub ahmed","PAT","alphabet",30462L),
//                new Person("manan singh","PA","pepsico",35462L),
//                new Person("jatin rao","PA","pepsico",37752L),
//                new Person("jagmohan yadav","AEM","pepsico",56462L));
//                new Person("ayush rathore","SA","goldman sachs",4462L),
//
////        Person person1 = new Person("test1","test1","test1", 50000L);
////        Person person2 = new Person("test2","test2","test2",52200L);
////        Person person3 = new Person("test3","test3","test3",32000L);
//
////        treeSet.add(person1);
////        treeSet.add(person2);
////        treeSet.add(person3);
//
//        System.out.println(treeSet);
//        for (Person person:treeSet) {
//            System.out.println(person);
//        }

//        for (int i = 0; i <personList.size() ; i++) {
//                treeSet.add(new Person(personList.get(i).getName(),
//                        personList.get(i).getDesignation(),
//                        personList.get(i).getProject()));
//        }

//        System.out.println(treeSet);

}
