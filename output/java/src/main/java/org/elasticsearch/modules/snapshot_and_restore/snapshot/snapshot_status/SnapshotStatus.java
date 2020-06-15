
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status.*;

public class SnapshotStatus  implements XContentable<SnapshotStatus> {
  
  static final ParseField INCLUDE_GLOBAL_STATE = new ParseField("include_global_state");
  private Boolean _includeGlobalState;
  public Boolean getIncludeGlobalState() { return this._includeGlobalState; }
  public SnapshotStatus setIncludeGlobalState(Boolean val) { this._includeGlobalState = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<String, SnapshotIndexStats> _indices;
  public NamedContainer<String, SnapshotIndexStats> getIndices() { return this._indices; }
  public SnapshotStatus setIndices(NamedContainer<String, SnapshotIndexStats> val) { this._indices = val; return this; }


  static final ParseField REPOSITORY = new ParseField("repository");
  private String _repository;
  public String getRepository() { return this._repository; }
  public SnapshotStatus setRepository(String val) { this._repository = val; return this; }


  static final ParseField SHARDS_STATS = new ParseField("shards_stats");
  private SnapshotShardsStats _shardsStats;
  public SnapshotShardsStats getShardsStats() { return this._shardsStats; }
  public SnapshotStatus setShardsStats(SnapshotShardsStats val) { this._shardsStats = val; return this; }


  static final ParseField SNAPSHOT = new ParseField("snapshot");
  private String _snapshot;
  public String getSnapshot() { return this._snapshot; }
  public SnapshotStatus setSnapshot(String val) { this._snapshot = val; return this; }


  static final ParseField STATE = new ParseField("state");
  private String _state;
  public String getState() { return this._state; }
  public SnapshotStatus setState(String val) { this._state = val; return this; }


  static final ParseField STATS = new ParseField("stats");
  private SnapshotStats _stats;
  public SnapshotStats getStats() { return this._stats; }
  public SnapshotStatus setStats(SnapshotStats val) { this._stats = val; return this; }


  static final ParseField UUID = new ParseField("uuid");
  private String _uuid;
  public String getUuid() { return this._uuid; }
  public SnapshotStatus setUuid(String val) { this._uuid = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SnapshotStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SnapshotStatus.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SnapshotStatus, Void> PARSER =
    new ConstructingObjectParser<>(SnapshotStatus.class.getName(), false, args -> new SnapshotStatus());

  static {
    PARSER.declareBoolean(SnapshotStatus::setIncludeGlobalState, INCLUDE_GLOBAL_STATE);
    PARSER.declareObject(SnapshotStatus::setIndices, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> SnapshotIndexStats.PARSER.apply(pp, null)), INDICES);;
    PARSER.declareString(SnapshotStatus::setRepository, REPOSITORY);
    PARSER.declareObject(SnapshotStatus::setShardsStats, (p, t) -> SnapshotShardsStats.PARSER.apply(p, null), SHARDS_STATS);
    PARSER.declareString(SnapshotStatus::setSnapshot, SNAPSHOT);
    PARSER.declareString(SnapshotStatus::setState, STATE);
    PARSER.declareObject(SnapshotStatus::setStats, (p, t) -> SnapshotStats.PARSER.apply(p, null), STATS);
    PARSER.declareString(SnapshotStatus::setUuid, UUID);
  }

}
