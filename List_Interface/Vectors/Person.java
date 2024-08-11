package List_Interface.Vectors;

public class Person {
    String name;
    private String designation;
    private String project;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
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

    public Person(String name, String designation, String project) {
        this.name = name;
        this.designation = designation;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}
