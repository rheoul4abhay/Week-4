package resumeScreeningSystem;

import java.util.List;

//Generic method for dynamic resume handling
public class ResumeProcessor {
    public static void processMultipleResumes(List<? extends JobRole> jobRoles){
        for(JobRole jobRole: jobRoles){
            System.out.println("Processing job role : " + jobRole.getName());
            jobRole.displayResponsibility();
        }
    }
}
