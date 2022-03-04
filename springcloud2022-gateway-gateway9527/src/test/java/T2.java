import java.time.ZonedDateTime;

public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2022-02-11T21:42:54.879+08:00[Asia/Shanghai]
    }

}
