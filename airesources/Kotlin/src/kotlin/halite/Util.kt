package halite

object Util {

    fun angleRadToDegClipped(angleRad: Double): Int {
        val degUnclipped = (Math.toDegrees(angleRad) + 0.5).toInt()
        // Make sure return value is in [0, 360) as required by game engine.
        return (degUnclipped % 360 + 360) % 360
    }
}
