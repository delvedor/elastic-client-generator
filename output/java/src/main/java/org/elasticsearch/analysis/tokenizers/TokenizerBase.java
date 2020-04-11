
package org.elasticsearch.analysis.tokenizers;

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


public class TokenizerBase  implements XContentable<TokenizerBase> {
  
  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public TokenizerBase setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private String _version;
  public String getVersion() { return this._version; }
  public TokenizerBase setVersion(String val) { this._version = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TokenizerBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TokenizerBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TokenizerBase, Void> PARSER =
    new ConstructingObjectParser<>(TokenizerBase.class.getName(), false, args -> new TokenizerBase());

  static {
    PARSER.declareString(TokenizerBase::setType, TYPE);
    PARSER.declareString(TokenizerBase::setVersion, VERSION);
  }

}
