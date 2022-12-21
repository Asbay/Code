package collections.list;



import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

    public class LinkedList02 {
        public static void main(String[] args) {

            List<Integer> liste= new ArrayList<>();

            liste.add(5);
            liste.add(7);
            liste.add(8);
            liste.add(6);
            liste.add(9);

            ListIterator itr=liste.listIterator();

            while (itr.hasNext()){
                System.out.print(itr.next()+ " ");
            }
            System.out.println();
            System.out.println("========");
            while (itr.hasPrevious()){
                System.out.print(itr.previous()+ " ");
            }

        }
}
