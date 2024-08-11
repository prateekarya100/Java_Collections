package Queue_Interface.ArrayDeque;

public class Patients implements Comparable<Patients> {
    private String name;
    private String cause;
    private Long severity;

    @Override
    public String toString() {
        return "Patients{" +
                "name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", severity=" + severity +
                '}';
    }

    public Patients(String name, String cause, Long severity) {
        this.name = name;
        this.cause = cause;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Long getSeverity() {
        return severity;
    }

    public void setSeverity(Long severity) {
        this.severity = severity;
    }

    @Override
    public int compareTo(Patients patients) {
        return severity<patients.getSeverity() ? 1 : -1;
    }
}
