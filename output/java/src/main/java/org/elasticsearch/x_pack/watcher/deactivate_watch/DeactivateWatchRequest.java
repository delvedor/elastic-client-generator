
package org.elasticsearch.x_pack.watcher.deactivate_watch;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class DeactivateWatchRequest  implements XContentable<DeactivateWatchRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeactivateWatchRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeactivateWatchRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeactivateWatchRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeactivateWatchRequest.class.getName(), false, args -> new DeactivateWatchRequest());

  static {
    
  }

}
