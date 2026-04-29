package Day5;
public class ThrowInBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            throw new ArithmeticException("Exception from try");
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught :"+e.getMessage());
            throw new NullPointerException("Exception from catch");
        }
        catch(NullPointerException e){
            System.out.println("Exception from catch"+e.getMessage());
        }
        finally {
            System.out.println("Inside Finally Block");
            throw new IllegalStateException("Exception from Finally");
        }
    }
}
