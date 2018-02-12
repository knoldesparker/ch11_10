import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String elements[]={"oneString","twoString", "ALongStringOfLengh", "1", "Freja", "Casper", "hunde", "is" };
        Set<String> set = new HashSet<>(Arrays.asList(elements));
        removeOddLength(set);
    }
    public static void removeOddLength(Set<String> stringSet){
        Set<String> temp = new HashSet<>();
        for (String str : stringSet){
            if(str.length() % 2 == 0 ){
                temp.add(str);
            }
        }
        //Deletes the original Set for all the values
        stringSet.clear();
        //Adds all the found values that are even to the set list, so only even numbers remains
        stringSet.addAll(temp);
        System.out.println(stringSet);
    }
}
