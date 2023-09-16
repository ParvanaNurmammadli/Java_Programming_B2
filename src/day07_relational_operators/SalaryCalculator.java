package day07_relational_operators;

public class SalaryCalculator {

    public static void main(String[] args){


       double salary=100_000;
       double stateTaxRate=0.06; // 6%
       double federalTaxRate=0.22;
double stateTax, federalTax, totalTax, salaryAfterTax;

         stateTax=salary * stateTaxRate;
         federalTax=salary * federalTaxRate;
         totalTax=stateTax + federalTax;
         salaryAfterTax=salary - totalTax;





    }
}
