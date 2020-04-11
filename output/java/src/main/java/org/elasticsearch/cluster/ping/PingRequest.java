
package org.elasticsearch.cluster.ping;

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


public class PingRequest  implements XContentable<PingRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PingRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PingRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PingRequest, Void> PARSER =
    new ConstructingObjectParser<>(PingRequest.class.getName(), false, args -> new PingRequest());

  static {
    
  }

}
