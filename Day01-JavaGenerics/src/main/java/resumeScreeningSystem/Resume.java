package resumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

//Generic class that accepts resume from classes which extend JobRole
public class Resume<T extends JobRole> {

    List<T> resumeList;
    private T jobRole;
    private String applicantName;
    public Resume(T jobRole, String applicantName){
        this.resumeList = new ArrayList<>();
        this.jobRole = jobRole;
        this.applicantName = applicantName;
    }

    public void addResume(T resume){
        resumeList.add(resume);
    }

    public List<T> getResumeList(){
        return resumeList;
    }

    public T getJobRole(){
        return jobRole;
    }

    public String getApplicantName(){
        return applicantName;
    }

    public void analyzeResume() {
        System.out.println("Screening resume for : " + getApplicantName() + " for role - " + getJobRole().getName());
        jobRole.displayResponsibility();
    }
}
