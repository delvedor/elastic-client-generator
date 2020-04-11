
package org.elasticsearch.modules.indices.fielddata;

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
import org.elasticsearch.common_options.time_unit.*;

public class FielddataSettings  implements XContentable<FielddataSettings> {
  
  static final ParseField CACHE_EXPIRE = new ParseField("cache_expire");
  private Time _cacheExpire;
  public Time getCacheExpire() { return this._cacheExpire; }
  public FielddataSettings setCacheExpire(Time val) { this._cacheExpire = val; return this; }


  static final ParseField CACHE_SIZE = new ParseField("cache_size");
  private String _cacheSize;
  public String getCacheSize() { return this._cacheSize; }
  public FielddataSettings setCacheSize(String val) { this._cacheSize = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FielddataSettings fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FielddataSettings.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FielddataSettings, Void> PARSER =
    new ConstructingObjectParser<>(FielddataSettings.class.getName(), false, args -> new FielddataSettings());

  static {
    PARSER.declareObject(FielddataSettings::setCacheExpire, (p, t) -> Time.PARSER.apply(p, t), CACHE_EXPIRE);
    PARSER.declareString(FielddataSettings::setCacheSize, CACHE_SIZE);
  }

}
