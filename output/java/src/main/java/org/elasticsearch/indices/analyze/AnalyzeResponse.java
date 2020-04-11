
package org.elasticsearch.indices.analyze;

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
import org.elasticsearch.indices.analyze.*;

public class AnalyzeResponse  implements XContentable<AnalyzeResponse> {
  
  static final ParseField DETAIL = new ParseField("detail");
  private AnalyzeDetail _detail;
  public AnalyzeDetail getDetail() { return this._detail; }
  public AnalyzeResponse setDetail(AnalyzeDetail val) { this._detail = val; return this; }


  static final ParseField TOKENS = new ParseField("tokens");
  private List<AnalyzeToken> _tokens;
  public List<AnalyzeToken> getTokens() { return this._tokens; }
  public AnalyzeResponse setTokens(List<AnalyzeToken> val) { this._tokens = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AnalyzeResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AnalyzeResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AnalyzeResponse, Void> PARSER =
    new ConstructingObjectParser<>(AnalyzeResponse.class.getName(), false, args -> new AnalyzeResponse());

  static {
    PARSER.declareObject(AnalyzeResponse::setDetail, (p, t) -> AnalyzeDetail.PARSER.apply(p, t), DETAIL);
    PARSER.declareObjectArray(AnalyzeResponse::setTokens, (p, t) -> AnalyzeToken.PARSER.apply(p, t), TOKENS);
  }

}
