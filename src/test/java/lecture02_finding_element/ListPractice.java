package lecture02_finding_element;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Josh");   // 0
        names.add("Anna");   // 1
        names.add("Ali");    // 2
        names.add("Merve");  // 3
        names.add("Ebony");  // 4
        names.add("Sofia");  // 5

        names.add(1, "Yuri");
        System.out.println(names);


        // add(data)      --> boolean
        // contains(data) --> boolean
        // indexOf(data)  --> index number, -1
        // set(idx, newData) --> oldData
        // size()         --> int: # of element in the array
        // get(idx)       --> data
        // isEmpty()      --> boolean
    }
}
