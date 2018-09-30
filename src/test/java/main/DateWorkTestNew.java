package main;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.*;

public class DateWorkTestNew {

    @Test
    public void getAge() {
        String[] dateSet ={"26/06/2000",
                "26-06-2000" ,
                "7-5-2000" ,
                "29/02/80" ,
                "12/12/12"};
        int[] daySet ={18,
                18 ,
                18 ,
               38 ,
                5};
        DateWork dateWork;
        for(int i =0 ;i<dateSet.length;i++)
    //    for(String currentDate:dateSet)
        {
            dateWork = new DateWork();
            dateWork.setStringDate(dateSet[i]);
            dateWork.convertDate();
            assertEquals(daySet[i], dateWork.GetAge());
        }
    }

    @Test
    public void getDayrToNextBithday() {
        String[] dateSet ={"26/06/2000",
                "26-06-2000" ,
                "7-5-2000" ,
                "29/02/80" ,
                "12/12/12"};
        String[] dateClearSet ={"06/26/2019",
                "06/26/2019" ,
                "05/07/2019" ,
                "02/28/2019" ,
                "12/12/2018"};

        DateWork dateWork;
        for(int i =0 ;i<dateSet.length;i++)
        {

            DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy");

            DateTime dateTime = dtf.parseDateTime(dateClearSet[i]);
            DateTime dateTime2 = new DateTime(new Date());

            int daysToNext= Days.daysBetween(dateTime2.toLocalDate(),
                    dateTime.toLocalDate()).getDays();

            dateWork = new DateWork();
            dateWork.setStringDate(dateSet[i]);
            dateWork.convertDate();
            assertEquals(daysToNext, dateWork.GetDayrToNextBithday());
        }


    }
}