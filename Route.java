public class Route {
    private int routeId;
    private String source;
    private String destination;
    private double distance;
    private String estimatedTime;

    public Route(int routeId, String source, String destination,double distance, String estimatedTime) {

        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
    }
// displays route details including id source destination distance and estimated time
    public void displayRouteDetails() {

        System.out.println("\n----------- Route Details -----------");
        System.out.println("Route ID : " + routeId);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Distance : " + distance + " km");
        System.out.println("Estimated Time : " + estimatedTime);
    }
}