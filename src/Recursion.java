public class Recursion {

    static int factorial(int n){
        System.out.println("n: "+n);
        if(n<=1)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int x = factorial(5);
        System.out.println("X : "+x);
    }
}
