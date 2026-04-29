package Day5;
class GC extends Exception{
    GC(String message){
        super(message);
    }
}
public class LibraryDemo {
    static void checkAttendence(boolean absent) throws GC{
        if(absent){
            throw new GC("Penalty to Submit 5 books to library");
        }
        else{}
    }
    public static void main(String[] args) {
        try{
            checkAttendence(true);
        }
        catch(GC e){
            System.out.println("Caught "+e.getMessage());
        }
        finally{
            System.out.println("Welcome to Sapthagiri NPS");
        }
    }
}
