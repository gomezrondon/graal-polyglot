import org.graalvm.polyglot.*;

public class Main {
    public static void main(String[] args) {
        Context context = Context.newBuilder().allowIO(true).build();
        String script = "import time\n" +
                "start_before = time.time()\n" +
                "print(start_before)\n" +
                "\"-\".join(str(n) for n in range(100))";
        Value array = context.eval("python", script);

        System.out.println(array);
        System.out.println("test----------------");
    }
}
 // time java -jar polyglot.jar