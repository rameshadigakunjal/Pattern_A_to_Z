//case 2: with input and without output

package methods;

class Addition2 {
    int c;

    void add(int x, int y) {
        c = x + y;
        System.out.println("Sum => " + c);
    }
}

public class Case2 {
    public static void main(String[] args) {
        Addition2 A = new Addition2();
        int a, b;
        a = 10;
        b = 20;
        A.add(a, b);

    }
    
}
