public class Example1 {
    public static void main(String[] args) {
        try{
            int res = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero: " + e);
        } finally{
            System.out.println("Finally block is always executed");
        }
    }
}
