package threadOne;

import java.util.Date;

/**
 * Created by Administrator on 2018/11/15.
 */
public class TestString {
    private static boolean stopRequested;

    public static void main(String[] args) {
        long time = new Date().getTime();
        System.out.println(time);

        Long bankTime = Long.valueOf(null);
        System.out.println(bankTime);
//        int[] a = new int[10];
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        a[3] = 3;
        //  srcPos 原数组要复制的起始位置；
        //  destPos目标数组开始的起始位置index
//        System.arraycopy(a, 2, a, 3, 5);
//        a[2]=99;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }


//        Calendar calendar = Calendar.getInstance();
//        System.out.println("11111"+calendar);
//        //设置日期第一天，是为了处理 3月31号month+1成5月1号的问题。
//        calendar.set(Calendar.DATE,1);
//        System.out.println(calendar.get(Calendar.DATE));
//        System.out.println("22222"+calendar);
//        /*
//         * 获取当前月度相关 年份 月份
//         */
//        Integer curYear = calendar.get(Calendar.YEAR);
//        System.out.println("===="+curYear);
//        Integer curMonth = calendar.get(Calendar.MONTH) + 1;
//        System.out.println("===="+curMonth);
//
//
//        calendar.add(Calendar.MONTH,1);
//
//        /*
//         * 获取下一月度相关 年份 月份
//         */
//        Integer nextYear = calendar.get(Calendar.YEAR);
//        System.out.println("222===="+nextYear);
//        Integer nextMonth = calendar.get(Calendar.MONTH) + 1;
//        System.out.println("222===="+nextMonth);


//        String path = "/usr/local/tomcat/webapps/performance-core/logs/hrcloud.log";
//        String str = path.replace("webapps","W");
//        System.out.println(path+"11111111111111111111111");
//        int m = str.indexOf("W");
//        System.out.println(m+"====================");
//        String s = str.substring(0, m);
//        System.out.println(s+"222222222222222");
//        System.out.println("<--------------------------------------------->");
//
//        String current = "10";
//        Integer integer = Integer.valueOf(current);
//        System.out.println(integer);
//        List<String> list = new ArrayList<>();
//        list.add("111");
//        list.add("222");
//        boolean contains = list.contains(null);
//        System.out.println(contains);
    }
}
