public class Exercise4_1 {

    // Amerikan tarzı tarih yazdırma metodu
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa tarzı tarih yazdırma metodu
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {

        // Örnek değerler
        String day = "Tuesday";
        int date = 3;
        String month = "December";
        int year = 2024;

        // Test çağrıları
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
