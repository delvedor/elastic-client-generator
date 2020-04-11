
package org.elasticsearch.cat.cat_segments;

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

public class CatSegmentsRequest  implements XContentable<CatSegmentsRequest> {
  
  static final ParseField BYTES = new ParseField("bytes");
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatSegmentsRequest setBytes(Bytes val) { this._bytes = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatSegmentsRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatSegmentsRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatSegmentsRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatSegmentsRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatSegmentsRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatSegmentsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatSegmentsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatSegmentsRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatSegmentsRequest.class.getName(), false, args -> new CatSegmentsRequest());

  static {
    PARSER.declareObject(CatSegmentsRequest::setBytes, (p, t) -> Bytes.PARSER.apply(p), BYTES);
    PARSER.declareString(CatSegmentsRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatSegmentsRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatSegmentsRequest::setHelp, HELP);
    PARSER.declareStringArray(CatSegmentsRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatSegmentsRequest::setVerbose, VERBOSE);
  }

}
