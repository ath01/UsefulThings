import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by darkwawe on 01.12.2014.
 */
public class ArraySort
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        if (N>0) {
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                array[i] = Integer.parseInt(s);
            }
            int j = array[0];
            for (int i : array) {
                for (int k = 0; k < array.length; k++) {
                    if (i > array[k] && i > j) j = i;
                }
            }
            int maximum = j;
            System.out.println(maximum);
        }




    }
}

