package SetInterface.InsurancePolicyManagementSystem;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Objects;

public class InsurancePolicy implements Comparable<InsurancePolicy>{
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount){
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    //getters
    public String getPolicyNumber(){
        return policyNumber;
    }

    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    public String getCoverageType(){
        return coverageType;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof InsurancePolicy)) return false;
        InsurancePolicy policy = (InsurancePolicy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(policyNumber);
    }

    //Implementing comparable abstract method of comparable interface
    @Override
    public int compareTo(InsurancePolicy other){
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Policy Number: " + policyNumber +", Policy Holder : " + policyHolderName + ", Policy Expiry Date : " + expiryDate.format(formatter) + ", Coverage Type : " + coverageType + ", Premium Amount : $" + premiumAmount;
    }
}
