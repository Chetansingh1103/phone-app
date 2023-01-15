public interface Phone {
    void powerOn();
    void callNumber(String phoneNumber);
    void receiveCall(String phoneNumber);
    boolean answerCall();
    boolean isRinging();
}
