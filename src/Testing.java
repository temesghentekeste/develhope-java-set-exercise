import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Define a testing class with a main() method where you:

create an HashSet with all the days of the week and print the content of the HashSet
create another implementation of Set that preserves the insertion order of the days of the week and print it
print the new Set
print the answer to the question Is the first Set equal to the second one?
 */
public class Testing {
    public static void main(String[] args) {
        // create an HashSet with all the days of the week and print the content of the HashSet
        Set<String> daysOfTheWeekSet = new HashSet<>();
        daysOfTheWeekSet.add("Monday");
        daysOfTheWeekSet.add("Tuesday");
        daysOfTheWeekSet.add("Wednesday");
        daysOfTheWeekSet.add("Thursday");
        daysOfTheWeekSet.add("Friday");
        daysOfTheWeekSet.add("Saturday");
        daysOfTheWeekSet.add("Sunday");
        System.out.println("Days of the week set: " + daysOfTheWeekSet);


        // create another implementation of Set that preserves the insertion order of the days of the week and print it
        Set<String> daysOfTheWeekSortedSet = new LinkedHashSet<>();
        daysOfTheWeekSortedSet.add("Monday");
        daysOfTheWeekSortedSet.add("Tuesday");
        daysOfTheWeekSortedSet.add("Wednesday");
        daysOfTheWeekSortedSet.add("Thursday");
        daysOfTheWeekSortedSet.add("Friday");
        daysOfTheWeekSortedSet.add("Saturday");
        daysOfTheWeekSortedSet.add("Sunday");
        System.out.println("Days of the week sorted set: " + daysOfTheWeekSortedSet);
    }
}