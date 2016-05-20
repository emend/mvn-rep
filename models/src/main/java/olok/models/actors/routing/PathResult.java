package olok.models.actors.routing;

import java.io.Serializable;

public final class PathResult implements Serializable {

    public final long time;

    public final double distance;

    public PathResult(final long time, final double distance) {
        this.time = time;
        this.distance = distance;
    }

}
