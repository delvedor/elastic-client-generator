
package org.elasticsearch.cat.cat_master;

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


public class CatMasterRecord  implements XContentable<CatMasterRecord> {
  
  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public CatMasterRecord setId(String val) { this._id = val; return this; }


  static final ParseField IP = new ParseField("ip");
  private String _ip;
  public String getIp() { return this._ip; }
  public CatMasterRecord setIp(String val) { this._ip = val; return this; }


  static final ParseField NODE = new ParseField("node");
  private String _node;
  public String getNode() { return this._node; }
  public CatMasterRecord setNode(String val) { this._node = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatMasterRecord fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatMasterRecord.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatMasterRecord, Void> PARSER =
    new ConstructingObjectParser<>(CatMasterRecord.class.getName(), false, args -> new CatMasterRecord());

  static {
    PARSER.declareString(CatMasterRecord::setId, ID);
    PARSER.declareString(CatMasterRecord::setIp, IP);
    PARSER.declareString(CatMasterRecord::setNode, NODE);
  }

}
