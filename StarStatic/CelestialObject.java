public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    
    // Public constant for kilometers in one Astronomical Unit
    public static final double KM_IN_ONE_AU = 150000000.0;
    
    // Default constructor - no parameters
    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }
    
    // Constructor with four parameters
    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // Getters
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getZ() {
        return z;
    }
    
    public String getName() {
        return name;
    }
    
    // Setters
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setZ(double z) {
        this.z = z;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Static method to calculate distance between two celestial objects in AU
    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double deltaX = obj2.getX() - obj1.getX();
        double deltaY = obj2.getY() - obj1.getY();
        double deltaZ = obj2.getZ() - obj1.getZ();
        
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }
    
    // Static method to calculate distance between two celestial objects in kilometers
    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        double distanceInAU = getDistanceBetween(obj1, obj2);
        return distanceInAU * KM_IN_ONE_AU;
    }
}