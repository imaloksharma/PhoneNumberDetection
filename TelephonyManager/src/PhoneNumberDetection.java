import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberDetection {
    public static void main(String[] args) {
        // Sample text containing phone numbers
        String text = "You can contact us at 7761064230 ";

        // Regular expression to detect phone numbers
        String phoneRegex = "\\b(\\+?\\d{1,3}-?\\d{1,4}-?\\d{6,10}|\\d{10}|\\(\\d{3}\\) \\d{3}-\\d{4})\\b";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Detected phone numbers:");
        // Find and print phone numbers
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
