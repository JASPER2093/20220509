package Phone;

public class SPhone implements SmartPhoneinterface {

    @Override
    public void sendSMS() {
        System.out.println("문자 보내기");
        
    }

    @Override
    public void reciveSMS() {
        System.out.println("문자 받기");
        
    }

    @Override
    public void sendcall() {
        System.out.println("전화 걸기");
        
    }

 

    @Override
    public void recivecall() {
        System.out.println("전화 받기");
        
    }

    @Override
    public void Mplay() {
       System.out.println("음악플레이기하기");
        
    }

    @Override
    public void Mstop() {
        System.out.println("음악 멈추기");
        
    }

    @Override
    public void InternetON() {
        System.out.println("인터넷 접속하기");
        
    }

    @Override
    public void InternetOFF() {
        System.out.println("인터넷 접속 끝내기");
        
    }



    
}
