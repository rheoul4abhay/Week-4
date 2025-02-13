package MapInterfaceTests;

import MapInterface.insurancePolicyManagementSystem.InsurancePolicy;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {
    public Map<String, InsurancePolicy> hashMap = new HashMap<>();
    public Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
    public TreeMap<LocalDate, InsurancePolicy> treeMap = new TreeMap<>();

    // Add policy to all maps
    public void addPolicy(InsurancePolicy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve policy by policy number
    public void retrievePolicyByNumber(String policyNumber) {
        InsurancePolicy policy = hashMap.get(policyNumber);
        if (policy != null) {
            System.out.println("Policy Details: " + policy);
        } else {
            System.out.println("No policy found with policy number: " + policyNumber);
        }
    }

    // List policies expiring within the next 30 days
    public void listExpiringPolicies() {
        System.out.println("Policies expiring within the next 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        treeMap.subMap(today, limit).values().forEach(System.out::println);
    }

    // List policies for a specific policyholder
    public void listPoliciesByPolicyHolder(String policyHolderName) {
        System.out.println("Policies for policyholder: " + policyHolderName);
        hashMap.values().stream()
                .filter(policy -> policy.getPolicyHolderName().equalsIgnoreCase(policyHolderName))
                .forEach(System.out::println);
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        System.out.println("Removing expired policies...");
        LocalDate today = LocalDate.now();

        // Remove from TreeMap using headMap
        treeMap.headMap(today, false).clear();

        // Remove from HashMap and LinkedHashMap
        hashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }

    // Display all policies in insertion order (LinkedHashMap)
    public void displayAllPolicies() {
        System.out.println("All policies in insertion order:");
        linkedHashMap.values().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MapInterface.insurancePolicyManagementSystem.InsurancePolicyManagementSystem policyManager = new MapInterface.insurancePolicyManagementSystem.InsurancePolicyManagementSystem();

        policyManager.addPolicy(new InsurancePolicy("P101", "Alice", LocalDate.of(2025, 3, 1), "Health", 5000.0));
        policyManager.addPolicy(new InsurancePolicy("P102", "Bob", LocalDate.of(2025, 2, 20), "Vehicle", 7500.0));
        policyManager.addPolicy(new InsurancePolicy("P103", "Alice", LocalDate.of(2025, 1, 15), "Home", 10000.0));
        policyManager.addPolicy(new InsurancePolicy("P104", "Charlie", LocalDate.of(2024, 12, 25), "Life", 15000.0));

        // Retrieve a policy by its number
        policyManager.retrievePolicyByNumber("P102");

        // List all policies expiring within the next 30 days
        policyManager.listExpiringPolicies();

        // List all policies for a specific policyholder
        policyManager.listPoliciesByPolicyHolder("Alice");

        // Remove expired policies
        policyManager.removeExpiredPolicies();

        // Display all policies
        policyManager.displayAllPolicies();
    }
}
