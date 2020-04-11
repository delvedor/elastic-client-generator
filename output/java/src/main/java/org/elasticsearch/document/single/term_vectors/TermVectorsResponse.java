
package org.elasticsearch.document.single.term_vectors;

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
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.document.single.term_vectors.*;
import org.elasticsearch.internal.*;

public class TermVectorsResponse  implements XContentable<TermVectorsResponse> {
  
  static final ParseField IS_VALID = new ParseField("is_valid");
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public TermVectorsResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  static final ParseField FOUND = new ParseField("found");
  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public TermVectorsResponse setFound(Boolean val) { this._found = val; return this; }


  static final ParseField ID = new ParseField("_id");
  private String _id;
  public String getId() { return this._id; }
  public TermVectorsResponse setId(String val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("_index");
  private String _index;
  public String getIndex() { return this._index; }
  public TermVectorsResponse setIndex(String val) { this._index = val; return this; }


  static final ParseField TERM_VECTORS = new ParseField("term_vectors");
  private NamedContainer<Field, TermVector> _termVectors;
  public NamedContainer<Field, TermVector> getTermVectors() { return this._termVectors; }
  public TermVectorsResponse setTermVectors(NamedContainer<Field, TermVector> val) { this._termVectors = val; return this; }


  static final ParseField TOOK = new ParseField("took");
  private Long _took;
  public Long getTook() { return this._took; }
  public TermVectorsResponse setTook(Long val) { this._took = val; return this; }


  static final ParseField TYPE = new ParseField("_type");
  private String _type;
  public String getType() { return this._type; }
  public TermVectorsResponse setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("_version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public TermVectorsResponse setVersion(Long val) { this._version = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermVectorsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermVectorsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermVectorsResponse, Void> PARSER =
    new ConstructingObjectParser<>(TermVectorsResponse.class.getName(), false, args -> new TermVectorsResponse());

  static {
    PARSER.declareBoolean(TermVectorsResponse::setIsValid, IS_VALID);
    PARSER.declareBoolean(TermVectorsResponse::setFound, FOUND);
    PARSER.declareString(TermVectorsResponse::setId, ID);
    PARSER.declareString(TermVectorsResponse::setIndex, INDEX);
    PARSER.declareObject(TermVectorsResponse::setTermVectors, (p, t) -> new NamedContainer<>(n -> () -> new Field(n),pp -> TermVector.PARSER.apply(pp, null)), TERM_VECTORS);
    PARSER.declareLong(TermVectorsResponse::setTook, TOOK);
    PARSER.declareString(TermVectorsResponse::setType, TYPE);
    PARSER.declareLong(TermVectorsResponse::setVersion, VERSION);
  }

}
