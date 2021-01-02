/* Student ID = 170315008
*  Name-Surname = Baran GEZENOGLU
*  2nd ed.
* */


import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n"); // For read to white spaces in the message string
        System.out.println("Welcome to the Caesar Decodify");

       for(;;){
            System.out.println("Decide Encrypt or Decrypt \n 1-Encrypt \n 2-Decrypt \n 0-Exit ");
            int decide = sc.nextInt();
            sc.nextLine();
            Caesar caesar = new Caesar();
            if(decide == 1 ) {
                System.out.println("Enter the message for Encrypt : ");
                String message = new String();
                message = sc.next();
                System.out.println("The message is : "+ message);
                System.out.println("The Encrypted message is : " + caesar.encrypt(message));
            }
            else if(decide == 2){
                System.out.println("Enter the message for Decrypt : ");
                String message = new String();
                message = sc.next();
                System.out.println("The message is : "+ message);
                System.out.println("The Decrypted meesage is : " +caesar.decrypt(message));
            }
            else{
                System.exit(0);
            }
        }

    }


}
