
package org.elasticsearch.aggregations.bucket.ip_range;

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


public class IpRangeAggregationRange  implements XContentable<IpRangeAggregationRange> {
  
  static final ParseField FROM = new ParseField("from");
  private String _from;
  public String getFrom() { return this._from; }
  public IpRangeAggregationRange setFrom(String val) { this._from = val; return this; }


  static final ParseField MASK = new ParseField("mask");
  private String _mask;
  public String getMask() { return this._mask; }
  public IpRangeAggregationRange setMask(String val) { this._mask = val; return this; }


  static final ParseField TO = new ParseField("to");
  private String _to;
  public String getTo() { return this._to; }
  public IpRangeAggregationRange setTo(String val) { this._to = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IpRangeAggregationRange fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IpRangeAggregationRange.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IpRangeAggregationRange, Void> PARSER =
    new ConstructingObjectParser<>(IpRangeAggregationRange.class.getName(), false, args -> new IpRangeAggregationRange());

  static {
    PARSER.declareString(IpRangeAggregationRange::setFrom, FROM);
    PARSER.declareString(IpRangeAggregationRange::setMask, MASK);
    PARSER.declareString(IpRangeAggregationRange::setTo, TO);
  }

}
