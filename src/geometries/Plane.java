package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane {
    final Point3D _q0;
    final Vector _normal;

    public Plane(Point3D q0, Vector normal) {
        _q0 = q0;
        _normal = normal;
    }

    public Plane(Point3D vertex, Point3D vertex1, Point3D vertex2) {
        _q0=vertex;
        _normal = null;
    }

    public Vector getNormal() {
        //ToDo
        return _normal;
    }
}
