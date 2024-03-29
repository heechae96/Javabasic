package ch8;

public class Ch8_9 {
    // 2 4 7
    public static void main(String[] args) {
        try {
            method1();
            System.out.println(6);
        } catch (Exception e) {
            System.out.println(7);  // 3
        }
    }

    static void method1() throws Exception {
        try {
            method2();
            System.out.println(1);
        } catch (NullPointerException e) {
            System.out.println(2);      // 1
            throw e;
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);  // 2
        }

        System.out.println(5);
    }

    static void method2() {
        throw new NullPointerException();
    }
}
