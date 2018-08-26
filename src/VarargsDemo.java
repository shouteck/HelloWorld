class Calculator {
    public int add(int ... n) {
        int total = 0;
        for (int x : n) {
            total += x;
        }
        return total;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(1,2,3,4,5));
    }
}
