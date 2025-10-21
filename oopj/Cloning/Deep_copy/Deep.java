package Java.oopj.Cloning.Deep_copy;

public class Deep {
    public static void main(String[] args) {
        int [] original={100,200,300};
        int [] deep=original.clone();

        System.out.println(original);
        System.out.println(deep);

        deep[0]=5000;
        System.out.println(deep[0]);
        System.out.println(original[0]);

    }
}
