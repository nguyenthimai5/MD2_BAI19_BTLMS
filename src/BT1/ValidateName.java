package BT1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    public static void main(String[] args) {
        String email="^[APC]\\d{4,}[GHIKLM]$";
        System.out.println("Nhap ten lop:");
        Scanner scanner=new Scanner(System.in);
        String emailString=scanner.nextLine();
        Pattern pattern=Pattern.compile(email);
        Matcher matcher= pattern.matcher(emailString);
        System.out.println("Ten lop: "+matcher.matches());
    }
}
