package generic_tasks;

public class Add {

    public static <N extends Number> void add (N n1, N n2) {
        N n3 = (N) Double.valueOf(n2.doubleValue()  + n1.doubleValue());
        System.out.println(n3);
    }

    public static void main(String[] args) {
        add(1.5,2);

    }
}
