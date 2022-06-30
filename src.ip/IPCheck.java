package src.ip;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPCheck {
    public static final String IPV4REGEX = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void checkConsoleIP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR IP ADDRESS:");
        String consoleIP = scanner.nextLine();

        Pattern pattern = Pattern.compile(IPV4REGEX);
        Matcher matcher = pattern.matcher(consoleIP);

        if (matcher.matches())
            System.out.println("Correct IP address");
        else System.out.println("Wrong format of your value! Restart and try again");
    }
}
