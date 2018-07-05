import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.Color.white;
import static java.util.Comparator.comparing;

public class Main implements ComparaTo<> {
    public static void main(String[] args) {
        TreeToy toy1 = new TreeToy(ColourofToy.black,6);
        TreeToy toy2 = new TreeToy(ColourofToy.red,8);
        TreeToy toy3 = new TreeToy(ColourofToy.white,3);
        TreeToy toy4 = new TreeToy(ColourofToy.green,5);


        List<TreeToy> list = new ArrayList();
        list.add(toy1);
        list.add(toy2);
        list.add(toy3);
        list.add(toy4);
        System.out.println((list));

    }

    Comparable comp = new Comparable() {
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    };

}
