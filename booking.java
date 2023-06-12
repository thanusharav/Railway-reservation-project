package railway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class booking {
    String name;
    int trainno;
    Date date;
    booking()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name");
        name=scan.next();
        System.out.println("enter trainno: ");
        trainno=scan.nextInt();
        System.out.println("enter date in dd-mm-yyyy");
        String dateInput =scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date =dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isavailable(ArrayList<booking> bookings,ArrayList<train>trains)
    {
        int capacity=0;
        for(train t:trains)
        {
            if(t.getTrainno()==trainno)
            capacity=t.getSeatavailable();
        }
        int booked=0;
        for(booking b: bookings)
        {
            if(b.trainno==trainno && b.date.equals(date));
            booked++;
        }
        return booked<capacity?true:false;
    }



}
