import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String monthInput = input.nextLine().trim();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if (isValidMonth(monthInput)) {
            int days = getDaysInMonth(monthInput, year);
            System.out.println("Number of days: " + days);
        } else {
            System.out.println("Invalid month. Please try again!");
        }
    }  

    private static boolean isValidMonth(String month) {
        String[] months = {"1", "January", "Jan", "Jan.", "2", "February", "Feb", "Feb.", "3", "March", "Mar", "Mar.",
                           "4", "April", "Apr", "Apr.", "5", "May", "6", "June", "Jun", "7", "July", "Jul",
                           "8", "August", "Aug", "Aug.", "9", "September", "Sep", "Sept.", "10", "October", "Oct", "Oct.",
                           "11", "November", "Nov", "Nov.", "12", "December", "Dec", "Dec."};
        for (String validMonth : months) {
            if (month.equalsIgnoreCase(validMonth)) {
                return true;
            }
        }
        return false; 
    }

    private static int getDaysInMonth(String month, int year) {
        int monthNumber = convertMonthToNumber(month);
        switch (monthNumber) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    private static int convertMonthToNumber(String month) {
        switch (month.toLowerCase()) {
            case "1": case "january": case "jan": case "jan.": return 1;
            case "2": case "february": case "feb": case "feb.": return 2;
            case "3": case "march": case "mar": case "mar.": return 3;
            case "4": case "april": case "apr": case "apr.": return 4;
            case "5": case "may": return 5;
            case "6": case "june": case "jun": return 6;
            case "7": case "july": case "jul": return 7;
            case "8": case "august": case "aug": case "aug.": return 8;
            case "9": case "september": case "sep": case "sept.": return 9;
            case "10": case "october": case "oct": case "oct.": return 10;
            case "11": case "november": case "nov": case "nov.": return 11;
            case "12": case "december": case "dec": case "dec.": return 12;
            default: return -1;
        }
    }
}
