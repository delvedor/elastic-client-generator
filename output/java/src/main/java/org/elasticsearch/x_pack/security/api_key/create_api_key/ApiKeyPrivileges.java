
package org.elasticsearch.x_pack.security.api_key.create_api_key;

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


public class ApiKeyPrivileges  implements XContentable<ApiKeyPrivileges> {
  
  static final ParseField NAMES = new ParseField("names");
  private List<String> _names;
  public List<String> getNames() { return this._names; }
  public ApiKeyPrivileges setNames(List<String> val) { this._names = val; return this; }


  static final ParseField PRIVILEGES = new ParseField("privileges");
  private List<String> _privileges;
  public List<String> getPrivileges() { return this._privileges; }
  public ApiKeyPrivileges setPrivileges(List<String> val) { this._privileges = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ApiKeyPrivileges fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ApiKeyPrivileges.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ApiKeyPrivileges, Void> PARSER =
    new ConstructingObjectParser<>(ApiKeyPrivileges.class.getName(), false, args -> new ApiKeyPrivileges());

  static {
    PARSER.declareStringArray(ApiKeyPrivileges::setNames, NAMES);
    PARSER.declareStringArray(ApiKeyPrivileges::setPrivileges, PRIVILEGES);
  }

}
