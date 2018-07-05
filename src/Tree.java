import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tree{
    public String redtoy;
    public int counttoy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree tree = (Tree) o;

        if (counttoy != tree.counttoy) return false;
        return redtoy != null ? redtoy.equals(tree.redtoy) : tree.redtoy == null;
    }

    @Override
    public int hashCode() {
        int result = redtoy != null ? redtoy.hashCode() : 0;
        result = 31 * result + counttoy;
        return result;
    }

    public Tree() {
    }
    Object Tree = new Object();


    public static void main(String[] args) {



    }
    public void ToyAddToTree(){
        List<Integer > toys = new ArrayList<Integer>();
        toys.add(2);
        toys.add(1);
        toys.add(4);
        toys.add(3);
        toys.add(6);
        toys.add(5);
        toys.add(7);
        toys.add(8);
        toys.add(9);
        toys.add(11);
        toys.add(10);




    }
}
