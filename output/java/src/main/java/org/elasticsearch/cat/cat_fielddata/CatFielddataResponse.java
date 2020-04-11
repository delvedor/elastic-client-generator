
package org.elasticsearch.cat.cat_fielddata;

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
import org.elasticsearch.cat.cat_fielddata.*;

public class CatFielddataResponse  implements XContentable<CatFielddataResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatFielddataRecord> _records;
  public List<CatFielddataRecord> getRecords() { return this._records; }
  public CatFielddataResponse setRecords(List<CatFielddataRecord> val) { this._records = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatFielddataResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatFielddataResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatFielddataResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatFielddataResponse.class.getName(), false, args -> new CatFielddataResponse());

  static {
    PARSER.declareObjectArray(CatFielddataResponse::setRecords, (p, t) -> CatFielddataRecord.PARSER.apply(p, t), RECORDS);
  }

}
