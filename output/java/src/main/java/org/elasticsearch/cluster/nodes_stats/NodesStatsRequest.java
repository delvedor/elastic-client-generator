
package org.elasticsearch.cluster.nodes_stats;

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
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class NodesStatsRequest  implements XContentable<NodesStatsRequest> {
  
  static final ParseField COMPLETION_FIELDS = new ParseField("completion_fields");
  private List<Field> _completionFields;
  public List<Field> getCompletionFields() { return this._completionFields; }
  public NodesStatsRequest setCompletionFields(List<Field> val) { this._completionFields = val; return this; }


  static final ParseField FIELDDATA_FIELDS = new ParseField("fielddata_fields");
  private List<Field> _fielddataFields;
  public List<Field> getFielddataFields() { return this._fielddataFields; }
  public NodesStatsRequest setFielddataFields(List<Field> val) { this._fielddataFields = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public NodesStatsRequest setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField GROUPS = new ParseField("groups");
  private Boolean _groups;
  public Boolean getGroups() { return this._groups; }
  public NodesStatsRequest setGroups(Boolean val) { this._groups = val; return this; }


  static final ParseField INCLUDE_SEGMENT_FILE_SIZES = new ParseField("include_segment_file_sizes");
  private Boolean _includeSegmentFileSizes;
  public Boolean getIncludeSegmentFileSizes() { return this._includeSegmentFileSizes; }
  public NodesStatsRequest setIncludeSegmentFileSizes(Boolean val) { this._includeSegmentFileSizes = val; return this; }


  static final ParseField LEVEL = new ParseField("level");
  private Level _level;
  public Level getLevel() { return this._level; }
  public NodesStatsRequest setLevel(Level val) { this._level = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesStatsRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField TYPES = new ParseField("types");
  private List<String> _types;
  public List<String> getTypes() { return this._types; }
  public NodesStatsRequest setTypes(List<String> val) { this._types = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodesStatsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesStatsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodesStatsRequest, Void> PARSER =
    new ConstructingObjectParser<>(NodesStatsRequest.class.getName(), false, args -> new NodesStatsRequest());

  static {
    PARSER.declareObjectArray(NodesStatsRequest::setCompletionFields, (p, t) -> Field.createFrom(p), COMPLETION_FIELDS);
    PARSER.declareObjectArray(NodesStatsRequest::setFielddataFields, (p, t) -> Field.createFrom(p), FIELDDATA_FIELDS);
    PARSER.declareObjectArray(NodesStatsRequest::setFields, (p, t) -> Field.createFrom(p), FIELDS);
    PARSER.declareBoolean(NodesStatsRequest::setGroups, GROUPS);
    PARSER.declareBoolean(NodesStatsRequest::setIncludeSegmentFileSizes, INCLUDE_SEGMENT_FILE_SIZES);
    PARSER.declareObject(NodesStatsRequest::setLevel, (p, t) -> Level.PARSER.apply(p), LEVEL);
    PARSER.declareObject(NodesStatsRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
    PARSER.declareStringArray(NodesStatsRequest::setTypes, TYPES);
  }

}
