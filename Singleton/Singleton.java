public class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton(){}
    
    public static Singleton getInstance(){
        if(Singleto.obj==null){
          Singleto.obj = new Singleton();  
        }
       
        return Singleton.obj;  
    }
