package BT2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        String validatePhone="^\\d{2}[-][0]\\d{8,}$";;
        System.out.println("Nhap sdt:");
        Scanner scanner=new Scanner(System.in);
        String numberPhoneCheck=scanner.nextLine();
        Pattern pattern=Pattern.compile(validatePhone);
        Matcher matcher= pattern.matcher(numberPhoneCheck);
        System.out.println("Phone: "+matcher.matches());
    }
}
