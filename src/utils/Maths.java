package utils;

import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;

/**
 * Created by one on 9/17/16.
 */
public class Maths {

    public static Matrix4f createTransformationMatrix(Vector2f position, Vector3f rotation, float scale) {
        return new Matrix4f()
                .identity()
                .translate(position.x, position.y, 0);

    }

}