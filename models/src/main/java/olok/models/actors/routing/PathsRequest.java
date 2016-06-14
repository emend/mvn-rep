package olok.models.actors.routing;


import java.io.Serializable;

public final class PathsRequest implements Serializable {

    public double[][] latLngs;

    public PathsRequest(final double[][] latLngs) {

        this.latLngs = latLngs;

    }

}
