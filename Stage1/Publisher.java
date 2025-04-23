public class Publisher extends Component {
   protected Publisher() {} // to ban calls to this constructor
   public Publisher(String name, Broker broker, String topicName) {
      super(name, topicName);
      if (broker.findTopic(topicName)==null){
         topic = broker.createTopic(topicName);
      }
      else{
         topic = broker.find(topicName);
      }
   }
   protected void publishNewEvent(String message) {
//..
      if (topic==null) {
         topic.notify(message);
      }

   }
   private Topic topic;
}