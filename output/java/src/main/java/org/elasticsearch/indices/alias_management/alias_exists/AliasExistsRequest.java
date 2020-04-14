
package org.elasticsearch.indices.alias_management.alias_exists;

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

public class AliasExistsRequest  implements XContentable<AliasExistsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public AliasExistsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public AliasExistsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public AliasExistsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public AliasExistsRequest setLocal(Boolean val) { this._local = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(ALLOW_NO_INDICES.getPreferredName(), _allowNoIndices);
    if (_expandWildcards != null) {
      builder.field(EXPAND_WILDCARDS.getPreferredName());
      _expandWildcards.toXContent(builder, params);
    }
    builder.field(IGNORE_UNAVAILABLE.getPreferredName(), _ignoreUnavailable);
    builder.field(LOCAL.getPreferredName(), _local);
    builder.endObject();
    return builder;
  }

  @Override
  public AliasExistsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AliasExistsRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<AliasExistsRequest, Void> PARSER =
    new ObjectParser<>(AliasExistsRequest.class.getName(), false, AliasExistsRequest::new);

  static {
    PARSER.declareBoolean(AliasExistsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareField(AliasExistsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareBoolean(AliasExistsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(AliasExistsRequest::setLocal, LOCAL);
  }

}