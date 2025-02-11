package resumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class AI_DrivenResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer(), "Abhay");
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist(), "Ravi");
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager(), "Ankit");

        //processing individual resumes
        seResume.analyzeResume();
        dsResume.analyzeResume();
        pmResume.analyzeResume();

        //creating list of different job roles
        List<JobRole> jobRoleList = new ArrayList<>();
        jobRoleList.add(new SoftwareEngineer());
        jobRoleList.add(new DataScientist());
        jobRoleList.add(new ProductManager());

        //To process multiple job roles resumes using wildcard method
        System.out.println("Processing multiple job roles resume: ");
        ResumeProcessor.processMultipleResumes(jobRoleList);
    }
}
