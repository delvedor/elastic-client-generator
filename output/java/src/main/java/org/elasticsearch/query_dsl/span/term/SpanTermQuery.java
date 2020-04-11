
package org.elasticsearch.query_dsl.span.term;

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


public class SpanTermQuery  implements XContentable<SpanTermQuery> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanTermQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanTermQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanTermQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanTermQuery.class.getName(), false, args -> new SpanTermQuery());

  static {
    
  }

}
