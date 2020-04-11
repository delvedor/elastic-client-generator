
package org.elasticsearch.indices.mapping_management.get_field_mapping;

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
import org.elasticsearch.common.*;

public class GetFieldMappingRequest  implements XContentable<GetFieldMappingRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetFieldMappingRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetFieldMappingRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetFieldMappingRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField INCLUDE_DEFAULTS = new ParseField("include_defaults");
  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public GetFieldMappingRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  static final ParseField INCLUDE_TYPE_NAME = new ParseField("include_type_name");
  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public GetFieldMappingRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetFieldMappingRequest setLocal(Boolean val) { this._local = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetFieldMappingRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetFieldMappingRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetFieldMappingRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetFieldMappingRequest.class.getName(), false, args -> new GetFieldMappingRequest());

  static {
    PARSER.declareBoolean(GetFieldMappingRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(GetFieldMappingRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(GetFieldMappingRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(GetFieldMappingRequest::setIncludeDefaults, INCLUDE_DEFAULTS);
    PARSER.declareBoolean(GetFieldMappingRequest::setIncludeTypeName, INCLUDE_TYPE_NAME);
    PARSER.declareBoolean(GetFieldMappingRequest::setLocal, LOCAL);
  }

}
