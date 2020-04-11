
package org.elasticsearch.x_pack.watcher.condition;

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


public class Condition  implements XContentable<Condition> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Condition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Condition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Condition, Void> PARSER =
    new ConstructingObjectParser<>(Condition.class.getName(), false, args -> new Condition());

  static {
    
  }

}
