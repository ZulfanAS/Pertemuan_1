
public class DoWhile {
    public static void main(String[] args) {
        System.out.print("Nama : Zulfan Akmal Santoso\n");
        System.out.print("NIM  : 2141762144\n");
 		System.out.print("Urutan Angka dari 1 sampai 10\n");
        
        int a = 1;
        int y = 0;
        do {
            int b = 5;
            do {
                System.out.print(" ");
                b--;
            } while (b > a);
            int c = 1;
            int x = 1;
            do {
                y++;
                System.out.print(" " + y);
                x++;
                c++;
            } while (c <= a);
            System.out.println();
            a++;
        } while (a <= 4);

        System.out.print("\n");
        System.out.print("Urutan Angka Berdasarkan NIM\n");
		System.out.print("NIM  : 2141762144\n");
        
        int nim[] = {2,1,4,1,7,6,2,1,4,4};
        
        int w = 1;
        int e = 0;

        do {
            int q = 5;
            do {
                System.out.print(" ");
                q--;
            } while (q > w);
            int r = 1;
            int t = 1;
            do {
                System.out.print(" " + nim[e]);
                e++;
                t++;
                r++;
            } while (r <= w);
            System.out.println();
            w++;
        } while (w <= 4);
    }
}