
package org.elasticsearch.cluster.cluster_allocation_explain;

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
import org.elasticsearch.cluster.cluster_allocation_explain.*;

public class AllocationDecision  implements XContentable<AllocationDecision> {
  
  static final ParseField DECIDER = new ParseField("decider");
  private String _decider;
  public String getDecider() { return this._decider; }
  public AllocationDecision setDecider(String val) { this._decider = val; return this; }


  static final ParseField DECISION = new ParseField("decision");
  private AllocationExplainDecision _decision;
  public AllocationExplainDecision getDecision() { return this._decision; }
  public AllocationDecision setDecision(AllocationExplainDecision val) { this._decision = val; return this; }


  static final ParseField EXPLANATION = new ParseField("explanation");
  private String _explanation;
  public String getExplanation() { return this._explanation; }
  public AllocationDecision setExplanation(String val) { this._explanation = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AllocationDecision fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AllocationDecision.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AllocationDecision, Void> PARSER =
    new ConstructingObjectParser<>(AllocationDecision.class.getName(), false, args -> new AllocationDecision());

  static {
    PARSER.declareString(AllocationDecision::setDecider, DECIDER);
    PARSER.declareObject(AllocationDecision::setDecision, (p, t) -> AllocationExplainDecision.PARSER.apply(p), DECISION);
    PARSER.declareString(AllocationDecision::setExplanation, EXPLANATION);
  }

}
