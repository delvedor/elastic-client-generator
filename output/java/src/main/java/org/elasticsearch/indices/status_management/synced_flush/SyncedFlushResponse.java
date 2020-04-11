
package org.elasticsearch.indices.status_management.synced_flush;

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


public class SyncedFlushResponse  implements XContentable<SyncedFlushResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SyncedFlushResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SyncedFlushResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SyncedFlushResponse, Void> PARSER =
    new ConstructingObjectParser<>(SyncedFlushResponse.class.getName(), false, args -> new SyncedFlushResponse());

  static {
    
  }

}
