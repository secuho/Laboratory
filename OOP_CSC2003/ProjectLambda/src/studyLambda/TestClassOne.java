package studyLambda;

public class TestClassOne {
    public static void main(String[] args) {

        Messenger messenger = new Messenger();

        Messenger.InnerPrinter inner = messenger.new InnerPrinter();
        inner.print("Hello");

        MessagePrinter lambdaPrinter = messenger.getLambdaPrinter();
        lambdaPrinter.print("Hello");


    }
}
