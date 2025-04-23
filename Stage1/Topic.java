import java.util.ArrayList;

public class Topic {
   private String topicName;  // Variable de clase
   private ArrayList<Subscriber> subscribers;  // Variable de clase

   // Constructor
   public Topic(String topicName) {
      if (topicName == null || topicName.trim().isEmpty()) {
         throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
      }
      this.topicName = topicName;
      this.subscribers = new ArrayList<Subscriber>();  // Inicialización correcta
   }

   // Métodos
   public void subscribe(Subscriber sub) {
      if (sub == null) {
         throw new IllegalArgumentException("El suscriptor no puede ser vacío");
      }
      if (!subscribers.contains(sub)) {
         subscribers.add(sub);
      }
   }

   public void notify(String message) {
      if (message == null) {
         throw new IllegalArgumentException("El mensaje no puede ser nulo");
      }
      for (Subscriber sub : subscribers) {
         sub.update(message);
      }
   }

   public boolean hasThisName(String name) {
      return topicName.equals(name);
   }
}