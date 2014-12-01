import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by darkwawe on 01.12.2014.
 */
public class DateTest {
    public static void main(String[] args)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));

    }
}
