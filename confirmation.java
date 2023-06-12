package railway;

import java.util. *;
public class confirmation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i;
        ArrayList<train> trains=new ArrayList<train>();
        trains.add(new train(1234,false,2));
        trains.add(new train(1235,true,1500));
        trains.add(new train(1236,false,1300));
        trains.add(new train(1237,true,1200));
        ArrayList<booking> bookings=new ArrayList<booking>();//arraylist
        for(train t:trains)
        {
            t.displayinfo();
        }

        //arraylist-collection
        do {

            System.out.println("enter 1 to book and 2 to exit");
             i = scan.nextInt();
            if (i == 1) {
                booking book=new booking();
                if(book.isavailable(bookings,trains)){
                    bookings.add(book);
                    System.out.println("reservcation confirmed");

                }
                else {
                    System.out.println("train is full!try for another date");
                }
            }
        } while (i == 1);

    }
}
