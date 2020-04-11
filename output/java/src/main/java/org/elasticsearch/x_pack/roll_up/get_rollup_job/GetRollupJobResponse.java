
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

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
import org.elasticsearch.x_pack.roll_up.get_rollup_job.*;

public class GetRollupJobResponse  implements XContentable<GetRollupJobResponse> {
  
  static final ParseField JOBS = new ParseField("jobs");
  private List<RollupJobInformation> _jobs;
  public List<RollupJobInformation> getJobs() { return this._jobs; }
  public GetRollupJobResponse setJobs(List<RollupJobInformation> val) { this._jobs = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRollupJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupJobResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRollupJobResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetRollupJobResponse.class.getName(), false, args -> new GetRollupJobResponse());

  static {
    PARSER.declareObjectArray(GetRollupJobResponse::setJobs, (p, t) -> RollupJobInformation.PARSER.apply(p, t), JOBS);
  }

}
