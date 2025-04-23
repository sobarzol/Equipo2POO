import java.util.ArrayList;

public class Topic {
   protected Topic(){ // to ban calls to this constructor
      throw new UnsupportedOperationException("El nombre del topico es requerido"); // Manejo de excepciones
   }
   public Topic(String topicName) {
      if (topicName == null || topicName.trim().isEmpty()) {
         throw new IllegalArgumentException("El nombre no puede ser nulo o vacio"); // Manejo de excepciones
         this.topicName = topicName;
         this.subscribers = new ArrayList<Subscriber>(); //Inicializa(crea espacio en memoria) una lista vacia para el topico (aqui se guardaran los sub)
      }
      public void subscribe(Subscriber sub){
         if (sub == null) {
            throw new IllegalArgumentException("El suscriptor no puede ser vacio");
         }
         if (!subscribers.contains(sub)) {   //Si no esta en la lista lo agrega
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
      // Verifica si el tópico tiene un nombre específico
      public boolean hasThisName(String name) {
         return topicName.equals(name);
      }


      public boolean hasThisName(String name) {
         return topicName.equals(name);
      }
      private String topicName;  // Se le agrega final?
      private ArrayList<Subscriber> subscribers;
   }