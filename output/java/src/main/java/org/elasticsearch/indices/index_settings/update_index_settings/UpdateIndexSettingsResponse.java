
package org.elasticsearch.indices.index_settings.update_index_settings;

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


public class UpdateIndexSettingsResponse  implements XContentable<UpdateIndexSettingsResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UpdateIndexSettingsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateIndexSettingsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UpdateIndexSettingsResponse, Void> PARSER =
    new ConstructingObjectParser<>(UpdateIndexSettingsResponse.class.getName(), false, args -> new UpdateIndexSettingsResponse());

  static {
    
  }

}
