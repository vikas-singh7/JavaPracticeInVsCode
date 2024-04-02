import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        System.out.println(list);
        Integer a=1;
        list.remove((Integer)5);
        System.out.println(list);
        System.out.println(list.contains(5));
    }
}
