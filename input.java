
//java maii input lane ke liye scanner ka use hota hai 
//jaise c language maii scanf ka use hota hai waise he java mai scanner use hota hai 
// java ke pass bhut sare ready made classes hoti hai unme se ek scanner ye input lena ka kaam kerti hai  lekin scanner dusre me rakhi hui hai   java ----util----scanner isliye use kere se phale sjava ko bolna padta hai  i want to use scanner class so please import it

import java.util.Scanner;

public class input{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        //scanner class ka object banaya sc naam ka
        //new memory me ek nayaaa object banata hai
        //System.in ka matlab input lena hai  . scanner ko btaya jara hai ki input kha se lena hai 
        System.out.println("enter your name");
        String name=Sc.nextLine();
        //isme do kamm ho rhe hai sc.nextLine() keybord se input lene ka kamm kerta hai aur usko name variable me store kerta hai
        System.out.println("welcome"+name);
        //+ ka use string ko join karne ke liye hota hai
        Sc.close();
    }
}

