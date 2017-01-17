package hudson.plugins.twitter.messages;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * A LinkGenerator that uses TinyUrl for its url creation.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class StandardLinkGenerator implements LinkGenerator {

  /**
   * {@inheritDoc}
   */
  public String getShortenedLink(String url) {
    return url;
  }
  
}
