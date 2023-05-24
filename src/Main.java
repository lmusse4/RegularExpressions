import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        // Regular expression to match a valid email address
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; //assign regular expression pattern
        String email = "lmusse@example.com"; // correct email to check
        String email2 = "lmusse_example.com"; //testing for wrong email
        Pattern emailPattern = Pattern.compile(emailRegex); //match patterns against string
        Matcher emailMatcher = emailPattern.matcher(email); //matching against string using the pattern
        boolean isValidEmail = emailMatcher.matches(); //returns boolean value whether the input string matches or not
        System.out.println("Email is valid: " + isValidEmail);
        emailMatcher.reset(email2); //resets emailMatcher for email2 to be tested
        boolean isValidEmail2 = emailMatcher.matches();
        System.out.println("Email 2 is valid: " + isValidEmail2);

        // Regular expression to match a valid phone number
        String phoneNumberRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        String phoneNumber = "(952) 846-7890";
        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);
        Matcher phoneNumberMatcher = phoneNumberPattern.matcher(phoneNumber);
        boolean isValidPhoneNumber = phoneNumberMatcher.matches();
        System.out.println("Phone number is valid: " + isValidPhoneNumber);

        // Regular expression to match a valid date
        String dateRegex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/\\d{4}$";
        String date = "05/23/2023";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher dateMatcher = datePattern.matcher(date);
        boolean isValidDate = dateMatcher.matches();
        System.out.println("Date is valid: " + isValidDate);

        // Regular expression to match a valid URL
        String urlRegex = "^(http|https)://([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,4}(/{1}[a-zA-Z0-9]+)*(/)?$";
        String url = "https://www.randomurl.com";
        Pattern urlPattern = Pattern.compile(urlRegex);
        Matcher urlMatcher = urlPattern.matcher(url);
        boolean isValidURL = urlMatcher.matches();
        System.out.println("URL is valid: " + isValidURL);

        // Regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces)
        String creditCardRegex = "^(\\d{4}[- ]){3}\\d{4}|\\d{16}$";
        String creditCardNumber = "1234-5678-9012-3456";
        Pattern creditCardPattern = Pattern.compile(creditCardRegex);
        Matcher creditCardMatcher = creditCardPattern.matcher(creditCardNumber);
        boolean isValidCreditCard = creditCardMatcher.matches();
        System.out.println("Credit card number is valid: " + isValidCreditCard);

        // Regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits)
        String zipCodeRegex = "^\\d{5}(-\\d{4})?$";
        String zipCode = "12345-6789";
        Pattern zipCodePattern = Pattern.compile(zipCodeRegex);
        Matcher zipCodeMatcher = zipCodePattern.matcher(zipCode);
        boolean isValidZipCode = zipCodeMatcher.matches();
        System.out.println("Zip code is valid: " + isValidZipCode);

        // Regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit)
        String identifierRegex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";
        String identifier = "$java";
        Pattern identifierPattern = Pattern.compile(identifierRegex);
        Matcher identifierMatcher = identifierPattern.matcher(identifier);
        boolean isValidIdentifier = identifierMatcher.matches();
        System.out.println("Java identifier is valid: " + isValidIdentifier);

        // Regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits)
        String colorCodeRegex = "^#[0-9A-Fa-f]{6}$";
        String colorCode = "#AABBCC";
        Pattern colorCodePattern = Pattern.compile(colorCodeRegex);
        Matcher colorCodeMatcher = colorCodePattern.matcher(colorCode);
        boolean isValidColorCode = colorCodeMatcher.matches();
        System.out.println("Color code is valid: " + isValidColorCode);

        // Regular expression to match a valid time in the 24-hour format (HH:MM)
        String timeRegex = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
        String time = "14:30";
        Pattern timePattern = Pattern.compile(timeRegex);
        Matcher timeMatcher = timePattern.matcher(time);
        boolean isValidTime = timeMatcher.matches();
        System.out.println("Time is valid: " + isValidTime);

        //For each regular expression, write a test program that uses the regular expression to validate some input and print whether the input is valid or not.

    }
}