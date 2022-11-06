package com.preview.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MethodMiaosa {

    public static void main(String[] args) throws ParseException {

//        需求
//        秒杀开始时间是2020年11月11日 00:00:00,
//        结束时间是2020年11月11日 00:10:00,
//        用户小贾下单时间是2020年11月11日 00:03:47,
//        用户小皮下单时间是2020年11月11日 00:10:11,
//        判断用户有没有成功参与秒杀活动

        String start = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:10:00";
        String jiaTime = "2020年11月11日 00:03:47";
        String piTime = "2020年11月11日 00:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        format格式化时间 : 把成Date类型的时间转换成String类型
//        parse解析 : 把String类型的时间转换成Date类型
        long Startime = sdf.parse(start).getTime();
        long Endtime = sdf.parse(end).getTime();
        long JiaTime = sdf.parse(jiaTime).getTime();
        long PiTime = sdf.parse(piTime).getTime();

        if (JiaTime>=Startime && JiaTime <=Endtime){
            System.out.println("小贾参与上了");
        }else {
            System.out.println("小贾没参与上");
        }

        if (PiTime>=Startime && PiTime <=Endtime){
            System.out.println("小皮参与上了");
        }else {
            System.out.println("小皮没参与上");
        }
    }
}
