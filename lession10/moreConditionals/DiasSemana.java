package lession10.moreConditionals;

public class DiasSemana {

    public static void main(String[] args) {
        int month = 11;

        boolean isLeapYear = true;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in the month.");
                break;
            case 2:
                if (!isLeapYear) {
                    System.out.println("28 days in the month.");
                } else {
                    System.out.println("29 days in the month.");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in the month.");
                break;
            default:
                System.out.println("Invalid month.");
        }

    }
}
