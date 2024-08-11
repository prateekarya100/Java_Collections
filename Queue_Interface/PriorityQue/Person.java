package Queue_Interface.PriorityQue;

public class Person implements Comparable<Person> {
    private String name;
    private String designation;
    private String project;
    private Long salary;


    public Person(String name, String designation, String project, Long salary) {
        this.name = name;
        this.designation = designation;
        this.project = project;
        this.salary = salary;
    }

    public Person() {

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", project='" + project + '\'' +
                ", salary=" + salary +
                '}';
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
//        SORTING APPROACH 1
//--------------------------
//        if (salary>person.getSalary()){
//            return 1;
//        } else if (salary< person.getSalary()) {
//            return -1;
//        }else {
//            return 0;
//        }
//---------------------------------------------
//  SORTING APPROACH 2
//--------------------
//        ascending
//        return salary>person.getSalary() ? 1 : -1;
//        descending
        return salary<person.getSalary() ? 1 : -1;
    }
}
