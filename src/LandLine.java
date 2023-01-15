public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNumber) {
        if(isPowerOn()){
            System.out.println("You are dialing the no : "+phoneNumber);
        }
        else{
            System.out.println("Your landline is off");
        }
    }

    @Override
    public void receiveCall(String phoneNumber) {
        if(isPowerOn() && myPhoneNo.equals(phoneNumber)){
            this.isRinging = true;
            System.out.println("hey , "+myPhoneNo+"you are receiving a call");
        }
        else{
            System.out.println("call not received");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging()){
            System.out.println("call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
