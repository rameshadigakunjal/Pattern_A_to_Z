// case 3: without input and with output

package methods;

class Addition3 {
    int a, b;

    int add() {
        a = 10;
        b = 20;
        return a + b;
    }
}
public class Case3 {
     public static void main(String[] args) {
        Addition3 a = new Addition3();
        int result = a.add();
        System.out.println("Case 3 Result: " + result);
    }
    
}
