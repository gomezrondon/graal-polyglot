import org.graalvm.polyglot.*;

public class Main {
    public static void main(String[] args) {
        Context context = Context.newBuilder().allowIO(true).build();
        Value array = context.eval("python", "[1,2,42,4]");
        int result = array.getArrayElement(2).asInt();
        System.out.println(result);
        System.out.println("test----------------");
    }
}
 // java -jar polyglot.jar