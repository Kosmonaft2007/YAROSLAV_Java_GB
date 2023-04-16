package Kata.Block_1;

public class Ex_1_6_11 {
    public static void main(String[] args) {
        String email = "kata12@gmail.com";

        System.out.println(isGmailOrOutlook(email));

    }

    public static boolean isGmailOrOutlook(String email) {
//        if (!email.matches("[a-zA-Z\\d]+(@)+[a-zA-Z\\d]+(.)+[a-z]")) {
        if (!email.matches("[a-zA-Z\\d]+((@gmail.com)|(@outlook.com))")) {
            return false;
        }
//        else if (!email.matches("[a-zA-Z\\d]+(@)+(outlook)+(.)+[a-z]")) {
//            return false;
//        }
        return true;
    }
}
