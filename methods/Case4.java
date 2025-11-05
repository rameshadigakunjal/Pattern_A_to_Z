// case 4: with input and with output

package methods;

class Addition4 {
    int add(int x, int y) {
        return x + y;
    }
}
public class Case4 {
    public static void main(String[] args) {
         Addition4 a = new Addition4();
        int result = a.add(10, 20);
        System.out.println("Case 4 Result: " + result);
    }
}
