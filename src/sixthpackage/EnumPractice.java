package sixthpackage;


public class EnumPractice {

    private final Months months;

    public EnumPractice(Months months) {

        this.months = months;
    }

    public void monthsUsage() {

        switch (months) {
            case January:
                System.out.println("it's a cold season again");
                break;
            case march:
                System.out.println("spring spring");
                break;
            case june:
                System.out.println("Summer");
                break;
            case september:
                System.out.println("It's fall with its beautiful vieus ");
                break;
            default:
                System.out.println("enjy the rest of the year");

        }
    }
    public static void main(String[] args){
        EnumPractice enumpractice = new EnumPractice(Months.January);
        enumpractice.monthsUsage();

    }
}
