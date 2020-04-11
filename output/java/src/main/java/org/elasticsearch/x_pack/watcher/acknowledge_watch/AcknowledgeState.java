
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

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
import org.elasticsearch.x_pack.watcher.acknowledge_watch.*;
import org.elasticsearch.internal.*;

public class AcknowledgeState  implements XContentable<AcknowledgeState> {
  
  static final ParseField STATE = new ParseField("state");
  private AcknowledgementState _state;
  public AcknowledgementState getState() { return this._state; }
  public AcknowledgeState setState(AcknowledgementState val) { this._state = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public AcknowledgeState setTimestamp(Date val) { this._timestamp = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AcknowledgeState fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AcknowledgeState.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AcknowledgeState, Void> PARSER =
    new ConstructingObjectParser<>(AcknowledgeState.class.getName(), false, args -> new AcknowledgeState());

  static {
    PARSER.declareObject(AcknowledgeState::setState, (p, t) -> AcknowledgementState.PARSER.apply(p), STATE);
    PARSER.declareObject(AcknowledgeState::setTimestamp, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TIMESTAMP);
  }

}
