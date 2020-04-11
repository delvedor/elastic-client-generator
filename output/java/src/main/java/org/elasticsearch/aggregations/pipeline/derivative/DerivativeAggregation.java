
package org.elasticsearch.aggregations.pipeline.derivative;

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


public class DerivativeAggregation  implements XContentable<DerivativeAggregation> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DerivativeAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DerivativeAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DerivativeAggregation, Void> PARSER =
    new ConstructingObjectParser<>(DerivativeAggregation.class.getName(), false, args -> new DerivativeAggregation());

  static {
    
  }

}
