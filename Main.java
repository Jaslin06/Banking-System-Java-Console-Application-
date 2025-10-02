import java.util.*;
class bankAccount{
     private double balance;
     public bankAccount(double initialbalance){
         balance=initialbalance;
     }
     public  void  Checkbalance(){
         System.out.println("current balance "+balance);
     }
    public void Deposits(double amount){
         balance+=amount;
        System.out.println("Deposited ammount"+ amount);
        System.out.println("updated balance"+balance);
    }
    public void Withdrawn(double amount){
         if(balance>amount){
             balance=balance-amount;
             System.out.println("Withdrawn "+amount);
             System.out.println("updated balance "+balance);
         }else{
             System.out.println("Insufficient fund!");
         }

    }
}
public  class Main{
    public static void main(String[] args) {
        bankAccount account=new bankAccount(1000);
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter Your Account Number:");
        long accountnumber= sc.nextLong();
        long [] arr={232201,232202,232203,232204,232205,232206};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==accountnumber){
                System.out.println(accountnumber+" Your account is present in our bank ");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println(accountnumber+" Your account is not present in our bank,visit our nearest IOB bank and get information regarding your AccountNumber");
        }
        if(found) {
            int choice;
            do {
                System.out.println("Banking menu");
                System.out.println("1,Check balance your account");
                System.out.println("2,Deposits money");
                System.out.println("3,Withdraw money");
                System.out.println("4,Exit");
                System.out.println("Enter  your choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        account.Checkbalance();
                        break;
                    case 2:
                        System.out.println("Enter the deposits amount:");
                        double dipositammount = sc.nextDouble();
                        account.Deposits(dipositammount);
                        break;
                    case 3:
                        System.out.println("Enter the withdrawn amount:");
                        double withdrawamount = sc.nextDouble();
                        account.Withdrawn(withdrawamount);
                        break;
                    case 4:
                        System.out.println("Existing");
                        break;
                    default:
                        System.out.println("Invalid choice try again");
                }
            } while (choice != 4);
        }

    }
}