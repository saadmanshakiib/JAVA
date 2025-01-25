package LessAge;

public class age {
    public static void main(String[] args) throws agelessthanzeroexception{
        checkage(-9);
    }
    public static void checkage(int a) throws agelessthanzeroexception{
        if(a<0)
            throw new agelessthanzeroexception("age less than zero");
    }
}
