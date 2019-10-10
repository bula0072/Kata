package com.kata.StackedBalls3D;

public class MySolution {
    public static double stackHeight3d(int layers) {
        return layers == 0 ? 0 : 1d + ((layers-1)*0.816);
    }
}
