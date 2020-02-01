import java.util.ArrayList;
import java.util.List;

public class Java_Collections {
    public static void main(String[] args) {
        //This is a list. Like an array but without a set size. More spaces can be added to the list after initilization
        List<Integer> myownfrigginname = new ArrayList<>();

            //Add items to the list
        myownfrigginname.add(1);
        myownfrigginname.add(3);
        myownfrigginname.add(69);

        //list can be printed as a whole array
        System.out.println(myownfrigginname);
        //Size of list can be displayed as an INT
        System.out.println(myownfrigginname.size());
        //xxx.get(y) retrieves cvalue stored in position Y
        //Lists would more difficult to use with a large dataset, because of the difficulty of knowing which index to reference to find the item you're looking for

        //removed obkect at index position 2
        System.out.println(myownfrigginname.get(2));
       //Overwrites valus at position 2 with value 420
        myownfrigginname.set(2,420);
        System.out.println(myownfrigginname);

        //Example code to create: Test score reports for teacher. Five student's grades are entered. Prompt for any retakes and allow grade for student X to be updated. Present highest score
        //lowest score, and average
    }
}
