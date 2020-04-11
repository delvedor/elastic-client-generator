
package org.elasticsearch.query_dsl.compound.function_score.functions;

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
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.internal.*;

public class ScoreFunction  implements XContentable<ScoreFunction> {
  
  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public ScoreFunction setFilter(QueryContainer val) { this._filter = val; return this; }


  static final ParseField WEIGHT = new ParseField("weight");
  private Double _weight;
  public Double getWeight() { return this._weight; }
  public ScoreFunction setWeight(Double val) { this._weight = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ScoreFunction fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ScoreFunction.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ScoreFunction, Void> PARSER =
    new ConstructingObjectParser<>(ScoreFunction.class.getName(), false, args -> new ScoreFunction());

  static {
    PARSER.declareObject(ScoreFunction::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, t), FILTER);
    PARSER.declareDouble(ScoreFunction::setWeight, WEIGHT);
  }

}
