import java.util.Scanner;
                                  ///Practice Work///
                            //🙌small banking project🙌//
                                
class Statebank{
    private int balance = 5000;
    private int pwd;

    void detail() {
        String acc = "40321564589";
        String name = "Mahi Raj";
        String ifsc="SBIN0006670";
        System.out.println("Your Name: " + name);
        System.out.println("Your Account number is: " + acc);
        System.out.println("Your IFSC Code is: " + ifsc);

    }

    void available() {
        System.out.print("Available balance: " + balance);
    }

    void withdraw() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Withdraw amount:");
        int with = sc1.nextInt();
        balance = balance - with;
        System.out.print("Amount after withdraw: " + balance);
    }

    void deposit() {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter Deposit amount:");
        int dep = sc2.nextInt();
        balance = balance + dep;
        System.out.print("Amount after deposit: " + balance);
    }

    public static void main(String[] args) {
        Statebank obj = new Statebank();
        String userr = "mahi";
        Scanner sc = new Scanner(System.in);
        System.out.println("-----STATE BANK OF INDIA-----");
        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        if (user.equals(userr)) { 
            System.out.print("Enter Password: ");
            int pass = sc.nextInt();
            if (pass == 123) {
                System.out.println("Please Wait............");
                obj.detail();

                System.out.print("Enter your choice:\n1-Withdraw \n2-Deposit\n3-Balance Enquiry \n-->");
                int choi = sc.nextInt();
                switch (choi) {
                    case 1:
                        obj.withdraw();
                        break;
                    case 2:
                        obj.deposit();
                        break;
                    case 3:
                        obj.available();
                        break;    
                    default:
                        System.out.println("invalid");
                }
              
                
                
            } else {
                System.out.println("Please enter correct password");
            }

        } else {
            System.out.println("Please enter correct username");
        }

    }

}
