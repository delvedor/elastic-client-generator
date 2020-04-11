
package org.elasticsearch.search.search;

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
import org.elasticsearch.common.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.search.search.collapsing.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.search.search.rescoring.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.search.scroll.scroll.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.search.search.source_filtering.*;
import org.elasticsearch.search.suggesters.*;

public class SearchRequest  implements XContentable<SearchRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SearchRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField ALLOW_PARTIAL_SEARCH_RESULTS = new ParseField("allow_partial_search_results");
  private Boolean _allowPartialSearchResults;
  public Boolean getAllowPartialSearchResults() { return this._allowPartialSearchResults; }
  public SearchRequest setAllowPartialSearchResults(Boolean val) { this._allowPartialSearchResults = val; return this; }


  static final ParseField ANALYZE_WILDCARD = new ParseField("analyze_wildcard");
  private Boolean _analyzeWildcard;
  public Boolean getAnalyzeWildcard() { return this._analyzeWildcard; }
  public SearchRequest setAnalyzeWildcard(Boolean val) { this._analyzeWildcard = val; return this; }


  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public SearchRequest setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField BATCHED_REDUCE_SIZE = new ParseField("batched_reduce_size");
  private Long _batchedReduceSize;
  public Long getBatchedReduceSize() { return this._batchedReduceSize; }
  public SearchRequest setBatchedReduceSize(Long val) { this._batchedReduceSize = val; return this; }


  static final ParseField CCS_MINIMIZE_ROUNDTRIPS = new ParseField("ccs_minimize_roundtrips");
  private Boolean _ccsMinimizeRoundtrips;
  public Boolean getCcsMinimizeRoundtrips() { return this._ccsMinimizeRoundtrips; }
  public SearchRequest setCcsMinimizeRoundtrips(Boolean val) { this._ccsMinimizeRoundtrips = val; return this; }


  static final ParseField DEFAULT_OPERATOR = new ParseField("default_operator");
  private DefaultOperator _defaultOperator;
  public DefaultOperator getDefaultOperator() { return this._defaultOperator; }
  public SearchRequest setDefaultOperator(DefaultOperator val) { this._defaultOperator = val; return this; }


  static final ParseField DF = new ParseField("df");
  private String _df;
  public String getDf() { return this._df; }
  public SearchRequest setDf(String val) { this._df = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SearchRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_THROTTLED = new ParseField("ignore_throttled");
  private Boolean _ignoreThrottled;
  public Boolean getIgnoreThrottled() { return this._ignoreThrottled; }
  public SearchRequest setIgnoreThrottled(Boolean val) { this._ignoreThrottled = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SearchRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField LENIENT = new ParseField("lenient");
  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public SearchRequest setLenient(Boolean val) { this._lenient = val; return this; }


  static final ParseField MAX_CONCURRENT_SHARD_REQUESTS = new ParseField("max_concurrent_shard_requests");
  private Long _maxConcurrentShardRequests;
  public Long getMaxConcurrentShardRequests() { return this._maxConcurrentShardRequests; }
  public SearchRequest setMaxConcurrentShardRequests(Long val) { this._maxConcurrentShardRequests = val; return this; }


  static final ParseField PRE_FILTER_SHARD_SIZE = new ParseField("pre_filter_shard_size");
  private Long _preFilterShardSize;
  public Long getPreFilterShardSize() { return this._preFilterShardSize; }
  public SearchRequest setPreFilterShardSize(Long val) { this._preFilterShardSize = val; return this; }


  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public SearchRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField REQUEST_CACHE = new ParseField("request_cache");
  private Boolean _requestCache;
  public Boolean getRequestCache() { return this._requestCache; }
  public SearchRequest setRequestCache(Boolean val) { this._requestCache = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public SearchRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SCROLL = new ParseField("scroll");
  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public SearchRequest setScroll(Time val) { this._scroll = val; return this; }


  static final ParseField SEARCH_TYPE = new ParseField("search_type");
  private SearchType _searchType;
  public SearchType getSearchType() { return this._searchType; }
  public SearchRequest setSearchType(SearchType val) { this._searchType = val; return this; }


  static final ParseField SEQUENCE_NUMBER_PRIMARY_TERM = new ParseField("sequence_number_primary_term");
  private Boolean _sequenceNumberPrimaryTerm;
  public Boolean getSequenceNumberPrimaryTerm() { return this._sequenceNumberPrimaryTerm; }
  public SearchRequest setSequenceNumberPrimaryTerm(Boolean val) { this._sequenceNumberPrimaryTerm = val; return this; }


  static final ParseField STATS = new ParseField("stats");
  private List<String> _stats;
  public List<String> getStats() { return this._stats; }
  public SearchRequest setStats(List<String> val) { this._stats = val; return this; }


  static final ParseField SUGGEST_FIELD = new ParseField("suggest_field");
  private Field _suggestField;
  public Field getSuggestField() { return this._suggestField; }
  public SearchRequest setSuggestField(Field val) { this._suggestField = val; return this; }


  static final ParseField SUGGEST_MODE = new ParseField("suggest_mode");
  private SuggestMode _suggestMode;
  public SuggestMode getSuggestMode() { return this._suggestMode; }
  public SearchRequest setSuggestMode(SuggestMode val) { this._suggestMode = val; return this; }


  static final ParseField SUGGEST_SIZE = new ParseField("suggest_size");
  private Long _suggestSize;
  public Long getSuggestSize() { return this._suggestSize; }
  public SearchRequest setSuggestSize(Long val) { this._suggestSize = val; return this; }


  static final ParseField SUGGEST_TEXT = new ParseField("suggest_text");
  private String _suggestText;
  public String getSuggestText() { return this._suggestText; }
  public SearchRequest setSuggestText(String val) { this._suggestText = val; return this; }


  static final ParseField TOTAL_HITS_AS_INTEGER = new ParseField("total_hits_as_integer");
  private Boolean _totalHitsAsInteger;
  public Boolean getTotalHitsAsInteger() { return this._totalHitsAsInteger; }
  public SearchRequest setTotalHitsAsInteger(Boolean val) { this._totalHitsAsInteger = val; return this; }


  static final ParseField TYPED_KEYS = new ParseField("typed_keys");
  private Boolean _typedKeys;
  public Boolean getTypedKeys() { return this._typedKeys; }
  public SearchRequest setTypedKeys(Boolean val) { this._typedKeys = val; return this; }


  static final ParseField AGGS = new ParseField("aggs");
  private NamedContainer<String, AggregationContainer> _aggs;
  public NamedContainer<String, AggregationContainer> getAggs() { return this._aggs; }
  public SearchRequest setAggs(NamedContainer<String, AggregationContainer> val) { this._aggs = val; return this; }


  static final ParseField COLLAPSE = new ParseField("collapse");
  private FieldCollapse _collapse;
  public FieldCollapse getCollapse() { return this._collapse; }
  public SearchRequest setCollapse(FieldCollapse val) { this._collapse = val; return this; }


  static final ParseField DOCVALUE_FIELDS = new ParseField("docvalue_fields");
  private List<Field> _docvalueFields;
  public List<Field> getDocvalueFields() { return this._docvalueFields; }
  public SearchRequest setDocvalueFields(List<Field> val) { this._docvalueFields = val; return this; }


  static final ParseField EXPLAIN = new ParseField("explain");
  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public SearchRequest setExplain(Boolean val) { this._explain = val; return this; }


  static final ParseField FROM = new ParseField("from");
  private Integer _from;
  public Integer getFrom() { return this._from; }
  public SearchRequest setFrom(Integer val) { this._from = val; return this; }


  static final ParseField HIGHLIGHT = new ParseField("highlight");
  private Highlight _highlight;
  public Highlight getHighlight() { return this._highlight; }
  public SearchRequest setHighlight(Highlight val) { this._highlight = val; return this; }


  static final ParseField INDICES_BOOST = new ParseField("indices_boost");
  private NamedContainer<IndexName, Double> _indicesBoost;
  public NamedContainer<IndexName, Double> getIndicesBoost() { return this._indicesBoost; }
  public SearchRequest setIndicesBoost(NamedContainer<IndexName, Double> val) { this._indicesBoost = val; return this; }


  static final ParseField MIN_SCORE = new ParseField("min_score");
  private Double _minScore;
  public Double getMinScore() { return this._minScore; }
  public SearchRequest setMinScore(Double val) { this._minScore = val; return this; }


  static final ParseField POST_FILTER = new ParseField("post_filter");
  private QueryContainer _postFilter;
  public QueryContainer getPostFilter() { return this._postFilter; }
  public SearchRequest setPostFilter(QueryContainer val) { this._postFilter = val; return this; }


  static final ParseField PROFILE = new ParseField("profile");
  private Boolean _profile;
  public Boolean getProfile() { return this._profile; }
  public SearchRequest setProfile(Boolean val) { this._profile = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public SearchRequest setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField RESCORE = new ParseField("rescore");
  private List<Rescore> _rescore;
  public List<Rescore> getRescore() { return this._rescore; }
  public SearchRequest setRescore(List<Rescore> val) { this._rescore = val; return this; }


  static final ParseField SCRIPT_FIELDS = new ParseField("script_fields");
  private NamedContainer<String, ScriptField> _scriptFields;
  public NamedContainer<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public SearchRequest setScriptFields(NamedContainer<String, ScriptField> val) { this._scriptFields = val; return this; }


  static final ParseField SEARCH_AFTER = new ParseField("search_after");
  private List<Object> _searchAfter;
  public List<Object> getSearchAfter() { return this._searchAfter; }
  public SearchRequest setSearchAfter(List<Object> val) { this._searchAfter = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public SearchRequest setSize(Integer val) { this._size = val; return this; }


  static final ParseField SLICE = new ParseField("slice");
  private SlicedScroll _slice;
  public SlicedScroll getSlice() { return this._slice; }
  public SearchRequest setSlice(SlicedScroll val) { this._slice = val; return this; }


  static final ParseField SORT = new ParseField("sort");
  private List<Sort> _sort;
  public List<Sort> getSort() { return this._sort; }
  public SearchRequest setSort(List<Sort> val) { this._sort = val; return this; }


  static final ParseField SOURCE = new ParseField("_source");
  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public SearchRequest setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  static final ParseField STORED_FIELDS = new ParseField("stored_fields");
  private List<Field> _storedFields;
  public List<Field> getStoredFields() { return this._storedFields; }
  public SearchRequest setStoredFields(List<Field> val) { this._storedFields = val; return this; }


  static final ParseField SUGGEST = new ParseField("suggest");
  private NamedContainer<String, SuggestBucket> _suggest;
  public NamedContainer<String, SuggestBucket> getSuggest() { return this._suggest; }
  public SearchRequest setSuggest(NamedContainer<String, SuggestBucket> val) { this._suggest = val; return this; }


  static final ParseField TERMINATE_AFTER = new ParseField("terminate_after");
  private Long _terminateAfter;
  public Long getTerminateAfter() { return this._terminateAfter; }
  public SearchRequest setTerminateAfter(Long val) { this._terminateAfter = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public SearchRequest setTimeout(String val) { this._timeout = val; return this; }


  static final ParseField TRACK_SCORES = new ParseField("track_scores");
  private Boolean _trackScores;
  public Boolean getTrackScores() { return this._trackScores; }
  public SearchRequest setTrackScores(Boolean val) { this._trackScores = val; return this; }


  static final ParseField TRACK_TOTAL_HITS = new ParseField("track_total_hits");
  private Boolean _trackTotalHits;
  public Boolean getTrackTotalHits() { return this._trackTotalHits; }
  public SearchRequest setTrackTotalHits(Boolean val) { this._trackTotalHits = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public SearchRequest setVersion(Boolean val) { this._version = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SearchRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SearchRequest, Void> PARSER =
    new ConstructingObjectParser<>(SearchRequest.class.getName(), false, args -> new SearchRequest());

  static {
    PARSER.declareBoolean(SearchRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareBoolean(SearchRequest::setAllowPartialSearchResults, ALLOW_PARTIAL_SEARCH_RESULTS);
    PARSER.declareBoolean(SearchRequest::setAnalyzeWildcard, ANALYZE_WILDCARD);
    PARSER.declareString(SearchRequest::setAnalyzer, ANALYZER);
    PARSER.declareLong(SearchRequest::setBatchedReduceSize, BATCHED_REDUCE_SIZE);
    PARSER.declareBoolean(SearchRequest::setCcsMinimizeRoundtrips, CCS_MINIMIZE_ROUNDTRIPS);
    PARSER.declareObject(SearchRequest::setDefaultOperator, (p, t) -> DefaultOperator.PARSER.apply(p), DEFAULT_OPERATOR);
    PARSER.declareString(SearchRequest::setDf, DF);
    PARSER.declareObject(SearchRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(SearchRequest::setIgnoreThrottled, IGNORE_THROTTLED);
    PARSER.declareBoolean(SearchRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(SearchRequest::setLenient, LENIENT);
    PARSER.declareLong(SearchRequest::setMaxConcurrentShardRequests, MAX_CONCURRENT_SHARD_REQUESTS);
    PARSER.declareLong(SearchRequest::setPreFilterShardSize, PRE_FILTER_SHARD_SIZE);
    PARSER.declareString(SearchRequest::setPreference, PREFERENCE);
    PARSER.declareBoolean(SearchRequest::setRequestCache, REQUEST_CACHE);
    PARSER.declareObject(SearchRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareObject(SearchRequest::setScroll, (p, t) -> Time.PARSER.apply(p, t), SCROLL);
    PARSER.declareObject(SearchRequest::setSearchType, (p, t) -> SearchType.PARSER.apply(p), SEARCH_TYPE);
    PARSER.declareBoolean(SearchRequest::setSequenceNumberPrimaryTerm, SEQUENCE_NUMBER_PRIMARY_TERM);
    PARSER.declareStringArray(SearchRequest::setStats, STATS);
    PARSER.declareObject(SearchRequest::setSuggestField, (p, t) -> Field.createFrom(p), SUGGEST_FIELD);
    PARSER.declareObject(SearchRequest::setSuggestMode, (p, t) -> SuggestMode.PARSER.apply(p), SUGGEST_MODE);
    PARSER.declareLong(SearchRequest::setSuggestSize, SUGGEST_SIZE);
    PARSER.declareString(SearchRequest::setSuggestText, SUGGEST_TEXT);
    PARSER.declareBoolean(SearchRequest::setTotalHitsAsInteger, TOTAL_HITS_AS_INTEGER);
    PARSER.declareBoolean(SearchRequest::setTypedKeys, TYPED_KEYS);
    PARSER.declareObject(SearchRequest::setAggs, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> AggregationContainer.PARSER.apply(pp, null)), AGGS);
    PARSER.declareObject(SearchRequest::setCollapse, (p, t) -> FieldCollapse.PARSER.apply(p, t), COLLAPSE);
    PARSER.declareObjectArray(SearchRequest::setDocvalueFields, (p, t) -> Field.createFrom(p), DOCVALUE_FIELDS);
    PARSER.declareBoolean(SearchRequest::setExplain, EXPLAIN);
    PARSER.declareInt(SearchRequest::setFrom, FROM);
    PARSER.declareObject(SearchRequest::setHighlight, (p, t) -> Highlight.PARSER.apply(p, t), HIGHLIGHT);
    PARSER.declareObject(SearchRequest::setIndicesBoost, (p, t) -> new NamedContainer<>(n -> () -> new IndexName(n),pp -> pp.doubleValue()), INDICES_BOOST);
    PARSER.declareDouble(SearchRequest::setMinScore, MIN_SCORE);
    PARSER.declareObject(SearchRequest::setPostFilter, (p, t) -> QueryContainer.PARSER.apply(p, t), POST_FILTER);
    PARSER.declareBoolean(SearchRequest::setProfile, PROFILE);
    PARSER.declareObject(SearchRequest::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, t), QUERY);
    PARSER.declareObjectArray(SearchRequest::setRescore, (p, t) -> Rescore.PARSER.apply(p, t), RESCORE);
    PARSER.declareObject(SearchRequest::setScriptFields, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> ScriptField.PARSER.apply(pp, null)), SCRIPT_FIELDS);
    PARSER.declareObjectArray(SearchRequest::setSearchAfter, (p, t) -> p.objectText(), SEARCH_AFTER);
    PARSER.declareInt(SearchRequest::setSize, SIZE);
    PARSER.declareObject(SearchRequest::setSlice, (p, t) -> SlicedScroll.PARSER.apply(p, t), SLICE);
    PARSER.declareObjectArray(SearchRequest::setSort, (p, t) -> Sort.PARSER.apply(p, t), SORT);
    PARSER.declareObject(SearchRequest::setSource, (p, t) ->  new Either<Boolean, SourceFilter>() /* TODO UnionOf */, SOURCE);
    PARSER.declareObjectArray(SearchRequest::setStoredFields, (p, t) -> Field.createFrom(p), STORED_FIELDS);
    PARSER.declareObject(SearchRequest::setSuggest, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> SuggestBucket.PARSER.apply(pp, null)), SUGGEST);
    PARSER.declareLong(SearchRequest::setTerminateAfter, TERMINATE_AFTER);
    PARSER.declareString(SearchRequest::setTimeout, TIMEOUT);
    PARSER.declareBoolean(SearchRequest::setTrackScores, TRACK_SCORES);
    PARSER.declareBoolean(SearchRequest::setTrackTotalHits, TRACK_TOTAL_HITS);
    PARSER.declareBoolean(SearchRequest::setVersion, VERSION);
  }

}
