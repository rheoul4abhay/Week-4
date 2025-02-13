package MapInterface.insurancePolicyManagementSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() { // Ensure this method exists
        return policyHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsurancePolicy)) return false;
        InsurancePolicy policy = (InsurancePolicy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Policy Number: " + policyNumber +
                ", Policy Holder: " + policyHolderName +
                ", Expiry Date: " + expiryDate.format(formatter) +
                ", Coverage Type: " + coverageType +
                ", Premium Amount: $" + premiumAmount;
    }
}
