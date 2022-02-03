import service.ManagePricingCustomers;

public class Main {


    public static void main(String[] args) {
        ManagePricingCustomers managePricingCustomers = new ManagePricingCustomers();

        managePricingCustomers.manage("/CandidateInputExample.txt", "CandidateOutputExample.json");
        //managePricingCustomers.manage(args[0], args[1]);
    }


}
