package solid.interfaceSegregation;

import java.util.ArrayList;

public class Amazon implements CloudHostingProvider, CloudStorageProvider, CDNProvider
{
    ArrayList<Region> regions;

    public Amazon()
    {
        this.regions = new ArrayList<>();
    }

    @Override
    public void storeFile(String name)
    {
        System.out.println("Amazon is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Amazon file " + name;
    }

    @Override
    public void createServer(Region region, String serverName)
    {
        region.addServer(serverName);
    }

    @Override
    public void listServers(Region region)
    {
        System.out.println("Amazon region " + region.getName() + " contains the following servers: ");

        for (String server: region.getServers()) {
            System.out.println(server);
        }
    }

    @Override
    public String getCDNAddress()
    {
        return "Amazon CDN Address";
    }
}
