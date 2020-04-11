
package org.elasticsearch.x_pack.security.user.put_user;

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


public class PutUserResponse  implements XContentable<PutUserResponse> {
  
  static final ParseField CREATED = new ParseField("created");
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public PutUserResponse setCreated(Boolean val) { this._created = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutUserResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutUserResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutUserResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutUserResponse.class.getName(), false, args -> new PutUserResponse());

  static {
    PARSER.declareBoolean(PutUserResponse::setCreated, CREATED);
  }

}
