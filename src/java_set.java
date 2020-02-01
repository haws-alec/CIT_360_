import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class java_set {
    public static void main(String[] args) {
        //Create three sets, each representing a separate classroom
        System.out.println("This program combines multiple rolls from different classes to get a roll for the whole school.");
        Set<String> classA =  new HashSet<String>();
        classA.add("Adam West");
        classA.add("Adam Driver");
        classA.add("John Doe");
        classA.add("Aaron Parker");
        classA.add("Joseph Smith");
        classA.add("Runil Waslib");
        classA.add("Herford Afud");
        //Create Tree set from hash set to alphabetize the list for each classroom
        Set<String> classASorted = new TreeSet<String>(classA);
        System.out.println("The first class has the following people in it: " + classASorted +"\n");

        Set<String> classB =  new HashSet<String>();
        classB.add("Adam West");
        classB.add("Brigham Young");
        classB.add("John Doe");
        classB.add("Janelle Haws");
        classB.add("Gordon Hinkley");
        classB.add("Alec Haws");
        //Create Tree set from hash set to alphabetize the list for each classroom
        Set<String> classBSorted = new TreeSet<String>(classB);
        System.out.println("The first class has the following people in it: " + classBSorted +"\n");

        Set<String> classC =  new HashSet<String>();
        classC.add("Zach Green");
        classC.add("Brigham Young");
        classC.add("Anthony Young");
        classC.add("Janelle Haws");
        classC.add("Frank Furter");
        classC.add("Al Dunn");
        //Create Tree set from hash set to alphabetize the list for each classroom
        Set<String> classCSorted = new TreeSet<String>(classC);
        System.out.println("The first class has the following people in it: " + classCSorted +"\n");

        //Combining all sets and eliminating duplicates-- UNION
        Set<String> masterRoll = new HashSet<String>(classA);
        masterRoll.addAll(classB);
        masterRoll.addAll(classC);
        //Create Tree set from hash set to alphabetize the list for each classroom
        Set<String> masterRollSorted = new TreeSet<String>(masterRoll);

        Set<String> masterRollUnique = new HashSet<String>(classA);
        masterRollUnique.removeAll(classB);
        masterRollUnique.removeAll(classC);
        System.out.println("\nAll of the people at the school in one class: " + masterRollUnique);
        System.out.println("\nAll of the people at the school: " + masterRollSorted);
    }
}
