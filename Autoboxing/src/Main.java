import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer boxedint = Integer.valueOf(15);  // Preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK9
        int unboxedint = boxedint.intValue(); // Unnecessary

        // Auto-boxing
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
     //   System.out.println(autoUnboxed.getclass().getName());

        Double resultBoxed = getDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(characterArray));


        // Unboxing
        int i = returnAnInt(10);
        System.out.println(i);

        // Auto-boxing
        Integer integer = returnAnInteger(10);
        System.out.println(integer);

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer... varargs) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : varargs) {
            list.add(i);
        }
        return list;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100);
    }

    private static double getDoublePrimitive() {
        return 100;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }
}