package QueueInterface.hospitalTriageSystem;

public class Patient {
    public String name;
    public int severityLevel;

    public Patient(String name, int severityLevel){
        this.name = name;
        this.severityLevel = severityLevel;
    }

    @Override
    //To display patient info
    public String toString() {
        return "Name - " + name + " | Severity - " + severityLevel;
    }
}
