package railway;

public class train {



       private int trainno;
        private boolean ac;
        private int seatavailable;//get and set
        train(int no,boolean ac,int cap)
        {
                trainno=no;
                this.ac=ac;
                seatavailable=cap;
        }

        public int getSeatavailable() {
                return seatavailable;
        }

        public void setSeatavailable(int seatavailable) {
                this.seatavailable = seatavailable;
        }

        public boolean isAc() {
                return ac;
        }

        public void setAc(boolean ac) {
                this.ac = ac;
        }

        public int getTrainno() {
                return trainno;
        }

        public void setTrainno(int trainno) {
                this.trainno = trainno;
        }
        public void displayinfo()
        {
                System.out.println("train no: "+trainno +"  AC: "+ac+"  capacity:"+seatavailable);
        }
}
