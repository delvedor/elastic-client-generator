
package org.elasticsearch.document.multiple.delete_by_query;

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
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.search.scroll.scroll.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class DeleteByQueryRequest  implements XContentable<DeleteByQueryRequest> {
  
  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public DeleteByQueryRequest setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField SLICE = new ParseField("slice");
  private SlicedScroll _slice;
  public SlicedScroll getSlice() { return this._slice; }
  public DeleteByQueryRequest setSlice(SlicedScroll val) { this._slice = val; return this; }


  static final ParseField MAX_DOCS = new ParseField("max_docs");
  private Long _maxDocs;
  public Long getMaxDocs() { return this._maxDocs; }
  public DeleteByQueryRequest setMaxDocs(Long val) { this._maxDocs = val; return this; }


  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public DeleteByQueryRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField ANALYZE_WILDCARD = new ParseField("analyze_wildcard");
  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public DeleteByQueryRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public DeleteByQueryRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField CONFLICTS = new ParseField("conflicts");
  private Conflicts _conflicts;
  public Conflicts getConflicts() { return this._conflicts; }
  public DeleteByQueryRequest setConflicts(Conflicts val) { this._conflicts = val; return this; }


  static final ParseField DEFAULT_OPERATOR = new ParseField("default_operator");
  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public DeleteByQueryRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  static final ParseField DF = new ParseField("df");
  private String _df;
  public String getDf() { return this._df; }
  public DeleteByQueryRequest setDf(String val) { this._df = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public DeleteByQueryRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField FROM = new ParseField("from");
  private Long _from;
  public Long getFrom() { return this._from; }
  public DeleteByQueryRequest setFrom(Long val) { this._from = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public DeleteByQueryRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField LENIENT = new ParseField("lenient");
  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public DeleteByQueryRequest setLenient(Boolean val) { this._lenient = val; return this; }


  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public DeleteByQueryRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField QUERY_ON_QUERY_STRING = new ParseField("query_on_query_string");
  private String _queryOnQueryString;
  public String getQueryOnQueryString() { return this._queryOnQueryString; }
  public DeleteByQueryRequest setQueryOnQueryString(String val) { this._queryOnQueryString = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public DeleteByQueryRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  static final ParseField REQUEST_CACHE = new ParseField("request_cache");
  private Boolean _requestCache;
  public Boolean getRequestCache() { return this._requestCache; }
  public DeleteByQueryRequest setRequestCache(Boolean val) { this._requestCache = val; return this; }


  static final ParseField REQUESTS_PER_SECOND = new ParseField("requests_per_second");
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public DeleteByQueryRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public DeleteByQueryRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SCROLL = new ParseField("scroll");
  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public DeleteByQueryRequest setScroll(Time val) { this._scroll = val; return this; }


  static final ParseField SCROLL_SIZE = new ParseField("scroll_size");
  private Long _scrollSize;
  public Long getScrollSize() { return this._scrollSize; }
  public DeleteByQueryRequest setScrollSize(Long val) { this._scrollSize = val; return this; }


  static final ParseField SEARCH_TIMEOUT = new ParseField("search_timeout");
  private Time _searchTimeout;
  public Time getSearchTimeout() { return this._searchTimeout; }
  public DeleteByQueryRequest setSearchTimeout(Time val) { this._searchTimeout = val; return this; }


  static final ParseField SEARCH_TYPE = new ParseField("search_type");
  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public DeleteByQueryRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Long _size;
  public Long getSize() { return this._size; }
  public DeleteByQueryRequest setSize(Long val) { this._size = val; return this; }


  static final ParseField SLICES = new ParseField("slices");
  private Long _slices;
  public Long getSlices() { return this._slices; }
  public DeleteByQueryRequest setSlices(Long val) { this._slices = val; return this; }


  static final ParseField SORT = new ParseField("sort");
  private List<String> _sort;
  public List<String> getSort() { return this._sort; }
  public DeleteByQueryRequest setSort(List<String> val) { this._sort = val; return this; }


  static final ParseField SOURCE_ENABLED = new ParseField("source_enabled");
  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public DeleteByQueryRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  static final ParseField SOURCE_EXCLUDES = new ParseField("source_excludes");
  private List<Field> _sourceExcludes;
  public List<Field> getSourceExcludes() { return this._sourceExcludes; }
  public DeleteByQueryRequest setSourceExcludes(List<Field> val) { this._sourceExcludes = val; return this; }


  static final ParseField SOURCE_INCLUDES = new ParseField("source_includes");
  private List<Field> _sourceIncludes;
  public List<Field> getSourceIncludes() { return this._sourceIncludes; }
  public DeleteByQueryRequest setSourceIncludes(List<Field> val) { this._sourceIncludes = val; return this; }


  static final ParseField STATS = new ParseField("stats");
  private List<String> _stats;
  public List<String> getStats() { return this._stats; }
  public DeleteByQueryRequest setStats(List<String> val) { this._stats = val; return this; }


  static final ParseField TERMINATE_AFTER = new ParseField("terminate_after");
  private Long _terminateAfter;
  public Long getTerminateAfter() { return this._terminateAfter; }
  public DeleteByQueryRequest setTerminateAfter(Long val) { this._terminateAfter = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteByQueryRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public DeleteByQueryRequest setVersion(Boolean val) { this._version = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public DeleteByQueryRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  static final ParseField WAIT_FOR_COMPLETION = new ParseField("wait_for_completion");
  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public DeleteByQueryRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteByQueryRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteByQueryRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteByQueryRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteByQueryRequest.class.getName(), false, args -> new DeleteByQueryRequest());

  static {
    PARSER.declareObject(DeleteByQueryRequest::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, t), QUERY);
    PARSER.declareObject(DeleteByQueryRequest::setSlice, (p, t) -> SlicedScroll.PARSER.apply(p, t), SLICE);
    PARSER.declareLong(DeleteByQueryRequest::setMaxDocs, MAX_DOCS);
    PARSER.declareBoolean(DeleteByQueryRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareBoolean(DeleteByQueryRequest::setAnalyzeWildcard, ANALYZE_WILDCARD);
    PARSER.declareString(DeleteByQueryRequest::setAnalyzer, ANALYZER);
    PARSER.declareObject(DeleteByQueryRequest::setConflicts, (p, t) -> Conflicts.PARSER.apply(p), CONFLICTS);
    PARSER.declareObject(DeleteByQueryRequest::setDefaultOperator, (p, t) -> DefaultOperator.PARSER.apply(p), DEFAULT_OPERATOR);
    PARSER.declareString(DeleteByQueryRequest::setDf, DF);
    PARSER.declareObject(DeleteByQueryRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareLong(DeleteByQueryRequest::setFrom, FROM);
    PARSER.declareBoolean(DeleteByQueryRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(DeleteByQueryRequest::setLenient, LENIENT);
    PARSER.declareString(DeleteByQueryRequest::setPreference, PREFERENCE);
    PARSER.declareString(DeleteByQueryRequest::setQueryOnQueryString, QUERY_ON_QUERY_STRING);
    PARSER.declareBoolean(DeleteByQueryRequest::setRefresh, REFRESH);
    PARSER.declareBoolean(DeleteByQueryRequest::setRequestCache, REQUEST_CACHE);
    PARSER.declareLong(DeleteByQueryRequest::setRequestsPerSecond, REQUESTS_PER_SECOND);
    PARSER.declareObject(DeleteByQueryRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareObject(DeleteByQueryRequest::setScroll, (p, t) -> Time.PARSER.apply(p, t), SCROLL);
    PARSER.declareLong(DeleteByQueryRequest::setScrollSize, SCROLL_SIZE);
    PARSER.declareObject(DeleteByQueryRequest::setSearchTimeout, (p, t) -> Time.PARSER.apply(p, t), SEARCH_TIMEOUT);
    PARSER.declareObject(DeleteByQueryRequest::setSearchType, (p, t) -> SearchType.PARSER.apply(p), SEARCH_TYPE);
    PARSER.declareLong(DeleteByQueryRequest::setSize, SIZE);
    PARSER.declareLong(DeleteByQueryRequest::setSlices, SLICES);
    PARSER.declareStringArray(DeleteByQueryRequest::setSort, SORT);
    PARSER.declareBoolean(DeleteByQueryRequest::setSourceEnabled, SOURCE_ENABLED);
    PARSER.declareObjectArray(DeleteByQueryRequest::setSourceExcludes, (p, t) -> Field.createFrom(p), SOURCE_EXCLUDES);
    PARSER.declareObjectArray(DeleteByQueryRequest::setSourceIncludes, (p, t) -> Field.createFrom(p), SOURCE_INCLUDES);
    PARSER.declareStringArray(DeleteByQueryRequest::setStats, STATS);
    PARSER.declareLong(DeleteByQueryRequest::setTerminateAfter, TERMINATE_AFTER);
    PARSER.declareObject(DeleteByQueryRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
    PARSER.declareBoolean(DeleteByQueryRequest::setVersion, VERSION);
    PARSER.declareString(DeleteByQueryRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
    PARSER.declareBoolean(DeleteByQueryRequest::setWaitForCompletion, WAIT_FOR_COMPLETION);
  }

}
