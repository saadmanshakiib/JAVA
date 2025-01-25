public class array {
    public static void main(String[] args){
        int array[] = new int[5];
        array[0] = 34;
        array[1] = 32;
        array[2] = 234;
        array[3] = 90;
        array[4] = 53;
        try{for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Ended");
    }
    finally{
        System.out.println("Array printed");
    }

    }
}
