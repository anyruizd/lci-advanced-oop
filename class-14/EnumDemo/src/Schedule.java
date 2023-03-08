public class Schedule {
    public Day day;

    public Schedule() {
    }

    public Schedule(Day day) {
        this.day = day;
    }

    public void printSchedule(Day day){
        switch (day) {
            case MONDAY -> {
                System.out.println("Your schedule for " + day + " is: " + Subject.PHP + " and " + Subject.CSHARP);
            }
            case TUESDAY -> {
                System.out.println("Your schedule for " + day + " is: " + Subject.IOS);
            }
            case WEDNESDAY -> {
                System.out.println("Your schedule for " + day + " is: " + Subject.CSHARP + " and " + Subject.JAVA);
            }
            case THURSDAY -> {
                System.out.println("Your schedule for " + day + " is: " + Subject.PYTHON + " and " + Subject.IOS);
            }
            case FRIDAY -> {
                System.out.println("Your schedule for today is: " + Subject.JAVA + " , " + Subject.PYTHON + " and " + Subject.PHP);
            }
            default -> {
                System.out.println("Your schedule for " + day.toString().toLowerCase() + " is unknown");
            }
        }
    }

}
