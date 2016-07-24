package nog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sid on 19/07/2016.
 */
public class NamesOfGBetter {
    public static void main (String[] ar) {
        List<List<Integer>> allNames = names ( 4, 1);

        allNames.forEach(x -> System.out.print(x +"\n"));

    }

    private static List<List<Integer>> names (int total, int current) {

        System.out.println("Looking " + total + ":" + current);
        List<List<Integer>> allNames = new ArrayList<>();

        if (current >= total) {

            List<Integer> subList = new ArrayList<>();subList.add(total);
            allNames.add(subList);
        }

        else {

            for (int i = current; i <= total -1; i++) {

                List<List<Integer>> subNames = names(total - i, i);
                for (List<Integer> subName : subNames) {
                    subName.add(0, i);
                    allNames.add(subName);
                }
            }
        }
        System.out.println(String.format ("(%d,%d) -> %s", total,current,allNames));

        return allNames;
    }
}
