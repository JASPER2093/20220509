package Phone;

public class Test4 {

    public static void main(String[] args) {
        SPhone myp = new SPhone();
        System.out.println("스마트폰 기능 점검");
        System.out.println("------------");
        myp.InternetON();
        myp.InternetOFF();
        myp.Mplay();
        myp.Mstop();
        myp.sendcall();
        myp.recivecall();
        myp.sendSMS();
        myp.reciveSMS();


    }

}
