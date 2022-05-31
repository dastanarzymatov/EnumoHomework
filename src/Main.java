import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Кундорго enum тузунуз (Monday, Tuesday ...)
//консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же
// Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
//        Жуманын кундорун кыргыз тилинде корсотунуз.

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" ~~~~~KUNDORDU JAZYNYZ~~~~~~Z ");
            System.out.println();
            String a = sc.nextLine();
            Week week = Week.MONDAY;
            Week week2 = Week.TUESDAY;
            Week week3 = Week.WEDNESDAY;
            Week week4 = Week.THURSDAY;
            Week week5 = Week.FRIDAY;
            Week week6 = Week.SATUDAY;
            Week week7 = Week.SUNDAY;
            switch (a) {
                case "MONDAY":
                    System.out.println(week + " JAVA UROK ");
                    break;
                case "TUESDAY":
                    System.out.println(week2 + " practik java ");
                    break;
                case "WEDNESDAY":
                    System.out.println(week3 + " English lesson ");
                    break;
                case "THURSDAY":
                    System.out.println(week4 + " Sofskils lesson ");
                    break;
                case "FRIDAY":
                    System.out.println(week5 + " new lesson java ");
                    break;
                case "SATUDAY":
                    System.out.println(week6 + " igrovoi lesson ");
                    break;
                case "SUNDAY":
                    System.out.println(week7 + " There's no class off");
                    break;
                default:
                    System.out.println(" proshu proshenia ");
            }
        }
    }


}