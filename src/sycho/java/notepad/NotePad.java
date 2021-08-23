package sycho.java.notepad;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class NotePad {

    public static void main(String[] args) {
        Pattern tellPattern = Pattern.compile( "^(01\\d{1}|02|0505|0502|0506|0\\d{1,2})-?(\\d{3,4})-?(\\d{4})");

        String phoneNumber = "001034578021";

        if (!tellPattern.matcher(phoneNumber).matches()) {
            System.out.println("성공");
        }
    }
}
