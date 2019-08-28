package se.ecutb.erik;

import java.time.LocalDate;

public class StringBuilderExample {

    public static void main(String[] args) {
        String firstName = "Erik";
        String lastName = "Svensson";
        LocalDate dateOfBirth = LocalDate.parse("1976-09-11");


        StringBuilder sb = new StringBuilder();
        sb.append(firstName + "\n");
        sb.append(lastName + "\n");
        sb.append(dateOfBirth);
        sb.reverse();

        System.out.println(sb);
    }

}
