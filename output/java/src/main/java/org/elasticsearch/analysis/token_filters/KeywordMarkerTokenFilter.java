
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class KeywordMarkerTokenFilter  implements XContentable<KeywordMarkerTokenFilter> {
  
  static final ParseField IGNORE_CASE = new ParseField("ignore_case");
  private Boolean _ignoreCase;
  public Boolean getIgnoreCase() { return this._ignoreCase; }
  public KeywordMarkerTokenFilter setIgnoreCase(Boolean val) { this._ignoreCase = val; return this; }


  static final ParseField KEYWORDS = new ParseField("keywords");
  private List<String> _keywords;
  public List<String> getKeywords() { return this._keywords; }
  public KeywordMarkerTokenFilter setKeywords(List<String> val) { this._keywords = val; return this; }


  static final ParseField KEYWORDS_PATH = new ParseField("keywords_path");
  private String _keywordsPath;
  public String getKeywordsPath() { return this._keywordsPath; }
  public KeywordMarkerTokenFilter setKeywordsPath(String val) { this._keywordsPath = val; return this; }


  static final ParseField KEYWORDS_PATTERN = new ParseField("keywords_pattern");
  private String _keywordsPattern;
  public String getKeywordsPattern() { return this._keywordsPattern; }
  public KeywordMarkerTokenFilter setKeywordsPattern(String val) { this._keywordsPattern = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KeywordMarkerTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KeywordMarkerTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KeywordMarkerTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KeywordMarkerTokenFilter.class.getName(), false, args -> new KeywordMarkerTokenFilter());

  static {
    PARSER.declareBoolean(KeywordMarkerTokenFilter::setIgnoreCase, IGNORE_CASE);
    PARSER.declareStringArray(KeywordMarkerTokenFilter::setKeywords, KEYWORDS);
    PARSER.declareString(KeywordMarkerTokenFilter::setKeywordsPath, KEYWORDS_PATH);
    PARSER.declareString(KeywordMarkerTokenFilter::setKeywordsPattern, KEYWORDS_PATTERN);
  }

}
