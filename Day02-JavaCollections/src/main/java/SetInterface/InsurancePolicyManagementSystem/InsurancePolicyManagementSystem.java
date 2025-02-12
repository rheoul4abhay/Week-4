package SetInterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {
    public Set<InsurancePolicy> hashSet = new HashSet<>();
    public Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    public Set<InsurancePolicy> treeSet = new TreeSet<>();

    //To add policy to all sets
    public void addPolicy(InsurancePolicy policy){
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    //To Retrieve all unique policies using hash set
    public void displayAllPolicies(){
        System.out.println("All unique policies in system: ");
        hashSet.forEach(System.out::println);
    }

    //To display all policies that are gonna expire in next 30 days
    public void displayExpiringPolicies(){
        System.out.println("Displaying policies which will expire soon(in 30 days): ");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        treeSet.stream().filter(policy -> policy.getExpiryDate().isAfter(today) && policy.getExpiryDate().isBefore(limit)).forEach(System.out::println);
    }

    //To retrieve policies by their coverage types
    public void displayByCoverageType(String coverageType){
        System.out.println("Policies with coverage type : " + coverageType);
        hashSet.stream().filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType)).forEach(System.out::println);
    }

    //To find duplicate policies based on their policy number
    public void findDuplicatePolicies(){
        System.out.println("Duplicate policies found based on policy number : ");
        Set<String> uniquePolicyNumbers = new HashSet<>();
        Set<InsurancePolicy> duplicates = new HashSet<>();

        for(InsurancePolicy policy: linkedHashSet){
            if(!uniquePolicyNumbers.add(policy.getPolicyNumber())){
                duplicates.add(policy);
            }
        }

        if(duplicates.isEmpty()){
            System.out.println("No duplicate policies found!");
        } else {
            duplicates.forEach(System.out::println);
        }
    }

    //Compare performance
    public void comparePerformance(){
        System.out.println("Different sets performance comparison: ");
        List<Set<InsurancePolicy>> setsList = Arrays.asList(hashSet, linkedHashSet, treeSet);
        String[] setNames = {"HashSet", "LinkedHashSet", "TreeSet"};

        for(int i = 0;i < setsList.size();i++){
            Set<InsurancePolicy> currentSet = setsList.get(i);
            String currentSetName = setNames[i];

            long startTime = System.nanoTime();
            currentSet.add(new InsurancePolicy("P123", "Abhay", LocalDate.now(), "Test Coverage", 100.0));
            double addTime = (System.nanoTime() - startTime)/ 1000000.0;

            startTime = System.nanoTime();
            currentSet.contains(new InsurancePolicy("P123", "Abhay", LocalDate.now(), "Test Coverage", 100.0));
            double searchTime = (System.nanoTime() - startTime)/1000000.0;

            startTime = System.nanoTime();
            currentSet.remove(new InsurancePolicy("P123", "Abhay", LocalDate.now(), "Test Coverage", 100.0));
            double removeTime = (System.nanoTime() - startTime)/1000000.0;

            System.out.println("Displaying performance of " + currentSetName);
            System.out.println("Add time -> " + addTime + "ms, Search time -> " + searchTime + "ms, Remove time -> " + removeTime + "ms");
        }
    }

    public static void main(String[] args){
        InsurancePolicyManagementSystem policyManager = new InsurancePolicyManagementSystem();

        policyManager.addPolicy(new InsurancePolicy("P123", "Abhay", LocalDate.of(2025, 3, 1), "Health", 5000.0));
        policyManager.addPolicy(new InsurancePolicy("P456", "Rohit", LocalDate.of(2025, 2, 20), "Home", 10000.0));
        policyManager.addPolicy(new InsurancePolicy("P456", "Ramesh", LocalDate.of(2025, 1, 7), "Health", 7500.0));
        policyManager.addPolicy(new InsurancePolicy("P123", "Abhay Duplicate", LocalDate.of(2025, 4, 1), "Vehicle", 15000.0));

        //display all unique policies
        policyManager.displayAllPolicies();

        //display expiring policies
        policyManager.displayExpiringPolicies();

        //display by coverage type
        policyManager.displayByCoverageType("Health");

        //display duplicate policies
        policyManager.findDuplicatePolicies();

        //compare differest sets performance
        policyManager.comparePerformance();
    }
}
