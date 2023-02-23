import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel);

        String str = "BLACK";
        Color myColor = Color.BLACK;
        Test test1 = new Test(Color.valueOf(str));
        Test test2 = new Test(myColor);

        test1.colorIsLike();
        test2.colorIsLike();

//        Schedule schedule = new Schedule();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day you want to see the schedule: ");
//        String day = sc.nextLine();
//        day = day.toUpperCase();
//        schedule.printSchedule(Day.valueOf(day));

        Day myArrayOfDays[] = Day.values(); // this is gonna create an array with the list of values
        for(Day day : myArrayOfDays) {
            System.out.println(day);
        }

        Color myArrayOfColor[] = Color.values();
        for(Color color : myArrayOfColor){
            System.out.println(color);
        }
    }
}