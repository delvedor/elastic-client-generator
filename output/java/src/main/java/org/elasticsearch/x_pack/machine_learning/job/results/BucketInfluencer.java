
package org.elasticsearch.x_pack.machine_learning.job.results;

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
import org.elasticsearch.internal.*;

public class BucketInfluencer  implements XContentable<BucketInfluencer> {
  
  static final ParseField BUCKET_SPAN = new ParseField("bucket_span");
  private Long _bucketSpan;
  public Long getBucketSpan() { return this._bucketSpan; }
  public BucketInfluencer setBucketSpan(Long val) { this._bucketSpan = val; return this; }


  static final ParseField INFLUENCER_FIELD_NAME = new ParseField("influencer_field_name");
  private String _influencerFieldName;
  public String getInfluencerFieldName() { return this._influencerFieldName; }
  public BucketInfluencer setInfluencerFieldName(String val) { this._influencerFieldName = val; return this; }


  static final ParseField INFLUENCER_FIELD_VALUE = new ParseField("influencer_field_value");
  private String _influencerFieldValue;
  public String getInfluencerFieldValue() { return this._influencerFieldValue; }
  public BucketInfluencer setInfluencerFieldValue(String val) { this._influencerFieldValue = val; return this; }


  static final ParseField INFLUENCER_SCORE = new ParseField("influencer_score");
  private Double _influencerScore;
  public Double getInfluencerScore() { return this._influencerScore; }
  public BucketInfluencer setInfluencerScore(Double val) { this._influencerScore = val; return this; }


  static final ParseField INITIAL_INFLUENCER_SCORE = new ParseField("initial_influencer_score");
  private Double _initialInfluencerScore;
  public Double getInitialInfluencerScore() { return this._initialInfluencerScore; }
  public BucketInfluencer setInitialInfluencerScore(Double val) { this._initialInfluencerScore = val; return this; }


  static final ParseField IS_INTERIM = new ParseField("is_interim");
  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public BucketInfluencer setIsInterim(Boolean val) { this._isInterim = val; return this; }


  static final ParseField JOB_ID = new ParseField("job_id");
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public BucketInfluencer setJobId(String val) { this._jobId = val; return this; }


  static final ParseField PROBABILITY = new ParseField("probability");
  private Double _probability;
  public Double getProbability() { return this._probability; }
  public BucketInfluencer setProbability(Double val) { this._probability = val; return this; }


  static final ParseField RESULT_TYPE = new ParseField("result_type");
  private String _resultType;
  public String getResultType() { return this._resultType; }
  public BucketInfluencer setResultType(String val) { this._resultType = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public BucketInfluencer setTimestamp(Date val) { this._timestamp = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public BucketInfluencer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return BucketInfluencer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<BucketInfluencer, Void> PARSER =
    new ConstructingObjectParser<>(BucketInfluencer.class.getName(), false, args -> new BucketInfluencer());

  static {
    PARSER.declareLong(BucketInfluencer::setBucketSpan, BUCKET_SPAN);
    PARSER.declareString(BucketInfluencer::setInfluencerFieldName, INFLUENCER_FIELD_NAME);
    PARSER.declareString(BucketInfluencer::setInfluencerFieldValue, INFLUENCER_FIELD_VALUE);
    PARSER.declareDouble(BucketInfluencer::setInfluencerScore, INFLUENCER_SCORE);
    PARSER.declareDouble(BucketInfluencer::setInitialInfluencerScore, INITIAL_INFLUENCER_SCORE);
    PARSER.declareBoolean(BucketInfluencer::setIsInterim, IS_INTERIM);
    PARSER.declareString(BucketInfluencer::setJobId, JOB_ID);
    PARSER.declareDouble(BucketInfluencer::setProbability, PROBABILITY);
    PARSER.declareString(BucketInfluencer::setResultType, RESULT_TYPE);
    PARSER.declareObject(BucketInfluencer::setTimestamp, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TIMESTAMP);
  }

}
