
package org.elasticsearch.indices.monitoring.indices_stats;

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

public class ShardQueryCache  implements XContentable<ShardQueryCache> {
  
  static final ParseField CACHE_COUNT = new ParseField("cache_count");
  private Long _cacheCount;
  public Long getCacheCount() { return this._cacheCount; }
  public ShardQueryCache setCacheCount(Long val) { this._cacheCount = val; return this; }


  static final ParseField CACHE_SIZE = new ParseField("cache_size");
  private Long _cacheSize;
  public Long getCacheSize() { return this._cacheSize; }
  public ShardQueryCache setCacheSize(Long val) { this._cacheSize = val; return this; }


  static final ParseField EVICTIONS = new ParseField("evictions");
  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public ShardQueryCache setEvictions(Long val) { this._evictions = val; return this; }


  static final ParseField HIT_COUNT = new ParseField("hit_count");
  private Long _hitCount;
  public Long getHitCount() { return this._hitCount; }
  public ShardQueryCache setHitCount(Long val) { this._hitCount = val; return this; }


  static final ParseField MEMORY_SIZE_IN_BYTES = new ParseField("memory_size_in_bytes");
  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public ShardQueryCache setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }


  static final ParseField MISS_COUNT = new ParseField("miss_count");
  private Long _missCount;
  public Long getMissCount() { return this._missCount; }
  public ShardQueryCache setMissCount(Long val) { this._missCount = val; return this; }


  static final ParseField TOTAL_COUNT = new ParseField("total_count");
  private Long _totalCount;
  public Long getTotalCount() { return this._totalCount; }
  public ShardQueryCache setTotalCount(Long val) { this._totalCount = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardQueryCache fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardQueryCache.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardQueryCache, Void> PARSER =
    new ConstructingObjectParser<>(ShardQueryCache.class.getName(), false, args -> new ShardQueryCache());

  static {
    PARSER.declareLong(ShardQueryCache::setCacheCount, CACHE_COUNT);
    PARSER.declareLong(ShardQueryCache::setCacheSize, CACHE_SIZE);
    PARSER.declareLong(ShardQueryCache::setEvictions, EVICTIONS);
    PARSER.declareLong(ShardQueryCache::setHitCount, HIT_COUNT);
    PARSER.declareLong(ShardQueryCache::setMemorySizeInBytes, MEMORY_SIZE_IN_BYTES);
    PARSER.declareLong(ShardQueryCache::setMissCount, MISS_COUNT);
    PARSER.declareLong(ShardQueryCache::setTotalCount, TOTAL_COUNT);
  }

}
