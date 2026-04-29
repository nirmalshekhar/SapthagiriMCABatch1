package Day5;
class TooManySamosaException extends Exception{
    TooManySamosaException(String message){
        super(message);
    }
}
public class ExceptionDemo {
    static void eatSamosa(int count)throws TooManySamosaException{
        if(count>5){
            throw new TooManySamosaException("Stop! Donot Eat more");
        }
        else{
            System.out.println("You ate "+count);
        }
    }
    public static void main(String[] args) {
        try{
            eatSamosa(7);
        }
        catch(TooManySamosaException e){
            System.out.println("Caught Exception :"+e.getMessage());
        }
        finally{
            System.out.println("Remember : Sharing Samosa is caring");
        }
    }
}
