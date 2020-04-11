
package org.elasticsearch.cluster.nodes_stats;

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

public class ThreadCountStats  implements XContentable<ThreadCountStats> {
  
  static final ParseField ACTIVE = new ParseField("active");
  private Long _active;
  public Long getActive() { return this._active; }
  public ThreadCountStats setActive(Long val) { this._active = val; return this; }


  static final ParseField COMPLETED = new ParseField("completed");
  private Long _completed;
  public Long getCompleted() { return this._completed; }
  public ThreadCountStats setCompleted(Long val) { this._completed = val; return this; }


  static final ParseField LARGEST = new ParseField("largest");
  private Long _largest;
  public Long getLargest() { return this._largest; }
  public ThreadCountStats setLargest(Long val) { this._largest = val; return this; }


  static final ParseField QUEUE = new ParseField("queue");
  private Long _queue;
  public Long getQueue() { return this._queue; }
  public ThreadCountStats setQueue(Long val) { this._queue = val; return this; }


  static final ParseField REJECTED = new ParseField("rejected");
  private Long _rejected;
  public Long getRejected() { return this._rejected; }
  public ThreadCountStats setRejected(Long val) { this._rejected = val; return this; }


  static final ParseField THREADS = new ParseField("threads");
  private Long _threads;
  public Long getThreads() { return this._threads; }
  public ThreadCountStats setThreads(Long val) { this._threads = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ThreadCountStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ThreadCountStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ThreadCountStats, Void> PARSER =
    new ConstructingObjectParser<>(ThreadCountStats.class.getName(), false, args -> new ThreadCountStats());

  static {
    PARSER.declareLong(ThreadCountStats::setActive, ACTIVE);
    PARSER.declareLong(ThreadCountStats::setCompleted, COMPLETED);
    PARSER.declareLong(ThreadCountStats::setLargest, LARGEST);
    PARSER.declareLong(ThreadCountStats::setQueue, QUEUE);
    PARSER.declareLong(ThreadCountStats::setRejected, REJECTED);
    PARSER.declareLong(ThreadCountStats::setThreads, THREADS);
  }

}
