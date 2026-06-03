package studyLambda;

public class Messenger {

    class InnerPrinter {
        void print(String msg) {
            System.out.println("Inner: " + msg);
        }
    }

    public MessagePrinter getLambdaPrinter() { return msg -> System.out.println("Lambda: " + msg); }

}