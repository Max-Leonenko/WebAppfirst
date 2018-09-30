package main;



import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Years;
import java.util.Date;

public class DateWork {
    private String stringDate;
    private Date date;

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void convertDate(){
        try {
            this.date = DateUtils.parseDate( this.stringDate,
                new String[] {"dd-MM-yyyy","dd/MM/yy","dd/MM/yyyy", "dd-MM-yyyy"});
        }
        catch (java.text.ParseException tt){
          //  this.date= new Date();
        }


    }

    public int GetAge(){
        DateTime dateNow = new DateTime(new Date());
        DateTime dateTime = new DateTime(this.date);

        return  Years.yearsBetween(dateTime.toLocalDate(),dateNow.toLocalDate()).getYears();
    }

    public int GetDayrToNextBithday(){

        DateTime dateTime = new DateTime(this.date).plusYears(this.GetAge()+1);
        DateTime dateTime2 = new DateTime(new Date());

        return Days.daysBetween(dateTime2.toLocalDate(),
                dateTime.toLocalDate()).getDays();
       }
}
