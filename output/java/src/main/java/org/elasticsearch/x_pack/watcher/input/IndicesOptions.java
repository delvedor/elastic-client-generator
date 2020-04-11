
package org.elasticsearch.x_pack.watcher.input;

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

public class IndicesOptions  implements XContentable<IndicesOptions> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public IndicesOptions setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public IndicesOptions setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public IndicesOptions setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IndicesOptions fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndicesOptions.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IndicesOptions, Void> PARSER =
    new ConstructingObjectParser<>(IndicesOptions.class.getName(), false, args -> new IndicesOptions());

  static {
    PARSER.declareBoolean(IndicesOptions::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(IndicesOptions::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(IndicesOptions::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
  }

}
