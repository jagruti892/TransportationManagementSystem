public class Route
{
    private int routeId;
    private string source;
    private string destination;
    private double distance;
    private string estimatedTime;

    public Route(int routeId, string source, string destination,double distance, string estimatedTime)
    {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
    }

    // Displays route details including ID, source, destination,
    // distance, and estimated time
    public void displayRouteDetails()
    {
        Console.WriteLine("\n----------- Route Details -----------");
        Console.WriteLine("Route ID : " + routeId);
        Console.WriteLine("Source : " + source);
        Console.WriteLine("Destination : " + destination);
        Console.WriteLine("Distance : " + distance + " km");
        Console.WriteLine("Estimated Time : " + estimatedTime);
    }
}