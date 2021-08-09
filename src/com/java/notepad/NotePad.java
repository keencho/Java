package com.java.notepad;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.stream.Collectors;

public class NotePad {

    public static void main(String[] args) {
        LocalDate tt = LocalDate.now();

        tt.isLeapYear();
    }

    public static class Test2 {
        public String t1;
        public String t2;

        public Test2(String t1, String t2) {
            this.t1 = t1;
            this.t2 = t2;
        }
    }
}
