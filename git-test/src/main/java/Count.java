/**
 *
 */
public class Count {
    public static void main(String[] args){
        int a=10;
        int b=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                b++;

            }

        }
        System.out.println(b);
    }
}
