package hudson.plugins.twitter.messages;

/**
 * A TweetDeliverer is the channel through which a tweet gets delivered.
 * 
 * @author Michael Irwin (mikesir87)
 */
public interface TweetDeliverer {

  /**
   * Deliver the provided tweet.
   * @param tweet The tweet that should be delivered
   */
  void deliverTweet(String tweet);
  
   /**
   * Send a message via DM
   * @param screenName The screenname of the recipient that should be sent
   * @param message The message that should be sent
   */
  void sendDirectMessage(String screenName, String message);
}
