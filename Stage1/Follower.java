import java.io.PrintStream;

public class Follower extends Subscriber {
   public Follower(String name, String topicName, PrintStream out) {
      this.name = name;
      this.topicName = topicName;
      this.out = out;
   }
   public void update(String message) {
      //...
      System.out.println(message);
   }
   private PrintStream out;
} 