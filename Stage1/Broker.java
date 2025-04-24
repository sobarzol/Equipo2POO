import java.util.ArrayList;

public class Broker {
   public Broker() {
      topics = new ArrayList<Topic>();
   }

   public Topic createTopic (String topicName){
      if(this.findTopic(topicName) == null){
         Topic topic = new Topic(topicName);
         topics.add(topic);
         return topic;
      }
      else
         return this.findTopic(topicName);
   }
   public boolean subscribe (Subscriber sub){
      Topic topic;
      String topicName = sub.getTopicName();
      topics.
      if ((topic=findTopic(topicName))!=null) {
         topic.subscribe(sub);
         return true;
      } else 
         return false; // topic does not exist.
   }
   private Topic findTopic (String topicName) {
      for(element : topics){
         if(element.hasThisName(topicName)){
            return element;
         }
      }
      return null;  // topic not found
   }
   private ArrayList<Topic> topics;
}

