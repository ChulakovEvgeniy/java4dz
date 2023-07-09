import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class lesson4dz1 {

//    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, Integer.toString(i));
        }
        System.out.println(list);
        List<String> newList = reversiv(list);
        System.out.println(newList);


    }
    static List reversiv(List list){
        ListIterator<String> listIterator = list.listIterator(list.size());
        List<String> list2 = new LinkedList<>();
        while (listIterator.hasPrevious()){
            list2.add(listIterator.previous());
        }
        return list2;
    }

}
