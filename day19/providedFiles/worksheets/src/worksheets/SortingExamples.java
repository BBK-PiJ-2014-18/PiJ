package worksheets;

import java.util.Arrays;
import java.util.Comparator;

import static worksheets.ArrayUtils.printArray;;
// import static means that I can say printArray(...)
// instead of ArrayUtils.printArray(...).

public class SortingExamples {
	
    public static void main(String[] args) {
    
        String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
        System.out.print("Original array: ");
        printArray(words);
        
        //adapted to use ComparatorImpl which I created.
        
        Comparator<String> ci = new ComparatorImpl();
        
        Arrays.sort(words, ci);
        System.out.print("MK Impl: Sorted by length ascending: ");
        printArray(words);
        
        //as provided: *** (s1, s2) -> s1.length() - s2.length() *** does the job of ci
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        System.out.print("Provided: Sorted by length ascending: ");
        printArray(words);
        
        //adapted to work in way that skips making ComparatorImpl.
        //automatically creates a instance of a class that implements Comparator
        //with the lambda expression defining its (single) abstract method.
    
        Comparator<String> markComparator;
        markComparator = (String s1, String s2) -> s1.length() - s2.length();
        
        Arrays.sort(words, markComparator);
        System.out.print("markComparator: Sorted by length descending : ");
        printArray(words);
        
        //as provided - same as above, just descending
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        System.out.print("Provided: Sorted by length descending : ");
        printArray(words);
        
        //as provided - same as above. just by first character
        Arrays.sort(words, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.print("Sorted by first letter : ");
        printArray(words);
        
        //as provided - but the bit after -> is more stuff & in { }
        Arrays.sort(words, (s1, s2) ->
        {
            int compareFlag = 0;
            if (s1.contains("e") && !s2.contains("e")) {
                compareFlag = -1;
            } else if (s2.contains("e") && !s1.contains("e")) {
                compareFlag = 1;
            }
            return (compareFlag);
        });
        System.out.print("Sorted by whether it contains 'e' [v1] : ");
        printArray(words);
        
        //as provided - question 2 on worksheet...
        //code in StringUtils STATIC method eChecker is same as example immediately above
        //public static int eChecker(String s1, String s2)
        Arrays.sort(words, StringUtils::eChecker);
        System.out.print("Sorted by whether it contains 'e' [v2] : ");
        printArray(words);
        
    }
}
