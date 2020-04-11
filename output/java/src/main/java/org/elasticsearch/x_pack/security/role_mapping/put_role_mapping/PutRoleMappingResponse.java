
package org.elasticsearch.x_pack.security.role_mapping.put_role_mapping;

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
import org.elasticsearch.x_pack.security.role_mapping.put_role_mapping.*;

public class PutRoleMappingResponse  implements XContentable<PutRoleMappingResponse> {
  
  static final ParseField CREATED = new ParseField("created");
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public PutRoleMappingResponse setCreated(Boolean val) { this._created = val; return this; }


  static final ParseField ROLE_MAPPING = new ParseField("role_mapping");
  private PutRoleMappingStatus _roleMapping;
  public PutRoleMappingStatus getRoleMapping() { return this._roleMapping; }
  public PutRoleMappingResponse setRoleMapping(PutRoleMappingStatus val) { this._roleMapping = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutRoleMappingResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutRoleMappingResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutRoleMappingResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutRoleMappingResponse.class.getName(), false, args -> new PutRoleMappingResponse());

  static {
    PARSER.declareBoolean(PutRoleMappingResponse::setCreated, CREATED);
    PARSER.declareObject(PutRoleMappingResponse::setRoleMapping, (p, t) -> PutRoleMappingStatus.PARSER.apply(p, t), ROLE_MAPPING);
  }

}
