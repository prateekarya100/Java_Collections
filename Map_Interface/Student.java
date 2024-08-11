package Map_Interface;

public class Student<I extends Number, S> implements Comparable<Student<Number, S>>{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student<Number, S> student) {
        if (student.getRollNo()>rollNo){
            return 1;
        } else if (student.getRollNo()<rollNo) {
            return -1;
        }
        else {
            return 0;
        }
//        return rollNo < student.getRollNo() ? 1 : -1;
    }
}
