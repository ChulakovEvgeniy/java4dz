import javax.swing.text.NumberFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class lesson4dz3 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, Integer.toString(i));
        }
        System.out.println(list);
        System.out.println(summa(list));



    }
    static int summa(List list){
        ListIterator<String> listIterator = list.listIterator();
        int summ = 0;
        while (listIterator.hasNext()){
                summ += Integer.parseInt(listIterator.next());
        }
        return summ;
    }

}
