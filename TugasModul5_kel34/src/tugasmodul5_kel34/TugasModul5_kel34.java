
package tugasmodul5_kel34;

import java.util.Scanner;
public class TugasModul5_kel34 {

   public static void main(String[] args) {
      

        String email, password;
        //objk untuk input
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
       //object untuk memanggil class 
        userService34 satu = new userService34( email, password );
        satu.login();//memanggil method tanpa parameter 
    }
    
}
