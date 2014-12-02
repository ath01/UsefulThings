import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by darkwawe on 02.12.2014.
 */
public class ArraysSort2 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] =  Integer.parseInt(br.readLine());
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]<array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }


            }
        }
        for (int i : array) {
            System.out.println(i);
        }


    }
}
