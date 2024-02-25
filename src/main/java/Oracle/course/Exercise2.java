package Oracle.course;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        int moneySaved = 500;
            int [] loanRequests = new int[]{60,20,100,80,40,300,200,100};
            List<Integer> loanRequestsNotFacilitated = new ArrayList<>();

        for (int loan: loanRequests) {
            if (moneySaved > 0) {
                System.out.println("Cash in the pot: " + moneySaved);
                System.out.print("Loan amount requested: " + loan);
                if (loan < moneySaved) {
                    moneySaved-=loan;
                    System.out.print(" - Loan amount granted");
                    System.out.println();
                } else {
                        System.out.print("Tne exact loan amount cannot be processed in full (insufficient funds available).\nHowever we will give you what we can... ");
                        System.out.println(moneySaved);
                        moneySaved-=moneySaved;
                }
            } else {
                loanRequestsNotFacilitated.add(loan);
            }
            System.out.println("");
        }
        if (!loanRequestsNotFacilitated.isEmpty()) {
            System.out.println("Cash in the pot: " + moneySaved);
            System.out.println("The following loan requests could not be facilitated");
            for (int loanValuesNotFacilitated : loanRequestsNotFacilitated) {
                System.out.println(loanValuesNotFacilitated);

            }
        }
    }
}
