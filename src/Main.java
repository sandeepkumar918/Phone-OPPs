public class Main {
    public static void main(String[] args) {
        Landline l1=new Landline("1234567890");
        Landline l2=new Landline("9876543210");
        l1.callNumber("9876543210");
        l2.receiveCall("9876543210");
        System.out.println(l2.answerCall());
    }
}