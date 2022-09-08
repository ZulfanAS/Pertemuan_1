

public class Penjumlahan{
    
    public static void main(String[] args){
        int[] nim = {2,1,4,1,7,6,2,1,4,4};
        int i = 0;
       
        for(int pen : nim){
            i = i + pen;
        }
        System.out.println(i);
    }
}