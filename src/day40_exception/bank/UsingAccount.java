package day40_exception.bank;

public class UsingAccount {

        public static void main(String[] args)  {

            Bank accountOne = new Bank();
            accountOne.balance = 100_000;



            try {
                accountOne.login("loopcamp", "123456!");
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
            }

            try {
                accountOne.withdraw(120_000);
            }catch (NotEnoughBalanceException e){
                System.out.println(e.getMessage());
            }

            System.out.println("DONE");

        }


    }
