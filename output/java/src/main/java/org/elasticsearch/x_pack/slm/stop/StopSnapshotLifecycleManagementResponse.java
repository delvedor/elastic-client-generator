
package org.elasticsearch.x_pack.slm.stop;

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


public class StopSnapshotLifecycleManagementResponse  implements XContentable<StopSnapshotLifecycleManagementResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    
    builder.endObject();
    return builder;
  }

  @Override
  public StopSnapshotLifecycleManagementResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StopSnapshotLifecycleManagementResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<StopSnapshotLifecycleManagementResponse, Void> PARSER =
    new ObjectParser<>(StopSnapshotLifecycleManagementResponse.class.getName(), false, StopSnapshotLifecycleManagementResponse::new);

  static {
    
  }

}