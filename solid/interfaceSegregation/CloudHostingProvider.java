package solid.interfaceSegregation;

public interface CloudHostingProvider {
	void createServer(Region region, String serverName);
    void listServers(Region region);
}
