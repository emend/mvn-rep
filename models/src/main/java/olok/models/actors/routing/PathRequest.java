package olok.models.actors.routing;


import java.io.Serializable;

public final class PathRequest implements Serializable {

    public double fromLatitude;
    public double fromLongitude;

    public double toLatitude;
    public double toLongitude;

    public PathRequest(final double fromLatitude, final double fromLongitude, final double toLatitude, final double toLongitude) {

        this.fromLatitude = fromLatitude;
        this.fromLongitude = fromLongitude;

        this.toLatitude = toLatitude;
        this.toLongitude = toLongitude;

    }

}
