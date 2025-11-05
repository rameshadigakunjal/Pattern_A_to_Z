// case 1: without input and without output

package methods;

class Addition1 {
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("sum = " +c);
    }
}

class Case1 {
    public static void main(String[] args) {
        Addition1 obj = new Addition1();
        obj.add();
    }
    

}
