package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp){
        for (DnsEntry d:dnsEntries) {
            if(d.getName().equals(hostName) || d.getHostIp().equals(hostIp)){
                throw new IllegalArgumentException("Already exists");
            }
        }
        this.dnsEntries.add(new DnsEntry(hostName,hostIp));
    }

    public void  removeEntryByName(String hostName){
        for (DnsEntry d:dnsEntries) {
            if(d.getName().equals(hostName)){
                dnsEntries.remove(d);
                break;
            }
        }
    }

    public void removeEntryByIp(String hostIp){
        for (DnsEntry d:dnsEntries) {
            if(d.getHostIp().equals(hostIp)){
                dnsEntries.remove(d);
                break;
            }
        }
    }
    public String getIpByName(String name){
        for (DnsEntry d:dnsEntries) {
            if(d.getName().equals(name)){
                return d.getHostIp();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp){
        for (DnsEntry d:dnsEntries) {
            if(d.getHostIp().equals(hostIp)){
                return d.getName();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private static class DnsEntry{
        private String name;
        private String hostIp;

        public DnsEntry(String name,String hostIp){
            this.name=name;
            this.hostIp=hostIp;
        }

        public String getName() {
            return name;
        }

        public String getHostIp() {
            return hostIp;
        }
    }
}
