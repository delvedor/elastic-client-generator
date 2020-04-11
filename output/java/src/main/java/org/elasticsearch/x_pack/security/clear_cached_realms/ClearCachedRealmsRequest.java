
package org.elasticsearch.x_pack.security.clear_cached_realms;

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


public class ClearCachedRealmsRequest  implements XContentable<ClearCachedRealmsRequest> {
  
  static final ParseField USERNAMES = new ParseField("usernames");
  private List<String> _usernames;
  public List<String> getUsernames() { return this._usernames; }
  public ClearCachedRealmsRequest setUsernames(List<String> val) { this._usernames = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClearCachedRealmsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClearCachedRealmsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClearCachedRealmsRequest, Void> PARSER =
    new ConstructingObjectParser<>(ClearCachedRealmsRequest.class.getName(), false, args -> new ClearCachedRealmsRequest());

  static {
    PARSER.declareStringArray(ClearCachedRealmsRequest::setUsernames, USERNAMES);
  }

}
