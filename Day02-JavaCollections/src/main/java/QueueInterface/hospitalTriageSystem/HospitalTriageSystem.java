package QueueInterface.hospitalTriageSystem;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTriageSystem {
    public static void main(String[] args){
        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return Integer.compare(o1.severityLevel, o2.severityLevel);
            }
        }.reversed()); //.reversed() for decreasing order of severity

        //Adding patients to priority queue
        queue.offer(new Patient("Abhay", 2));
        queue.offer(new Patient("Kartik", 1));
        queue.offer(new Patient("Lavish", 2));
        queue.offer(new Patient("Mohan", 4));
        queue.offer(new Patient("Isha", 1));

        System.out.println("Treating order of patients based on their severity levels is : ");
        while(!queue.isEmpty()){
            Patient patient = queue.poll();
            System.out.println(patient);
        }
    }
}
