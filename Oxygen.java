import java.util.Scanner;
//Enter the state of blood level of oxygen, Whether you tell a hospital or not.
class oxygen{
    public static void main(String args[]){

        Scanner scan = new Scanner (System.in);
        int sanso;

        System.out.println("Please enter your blood level of oxygen.");
        sanso = scan.nextInt();

        if(0>sanso){
            System.out.println("Error! Plese enter your blood level of oxygen.");
            return;
        }

        if(sanso >= 97){
            System.out.println("Your blood level of oxygen(" +sanso+ ") is fine. You don't have to call a hospital now.");
        }
        else if(sanso <= 96){
            System.out.println("Your blood level of oxygen(" +sanso+ ") is low. Please call a hospital immediately.");
        }
    }
}
