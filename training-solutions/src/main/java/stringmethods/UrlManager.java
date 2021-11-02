package stringmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UrlManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol=getProtocolFromUrl(url);
        this.port=getPortFromUrl(url);
        this.host=getHostFromUrl(url);
        this.path=getPathFromUrl(url);
        this.query=getQueryFromUrl(url);


    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }
    public boolean hasProperty(String key){
        if(!this.query.equals("")){
            String[] queries=this.query.split("&");
            List<String> keys = new ArrayList<>();
            for (String s : queries) {
                keys.add(s.substring(0, s.indexOf('=')));
            }
            for (String k : keys) {
                if(k.equals(key)){
                    return true;
                }
            }
            return false;
        }
        else{
            return false;
        }
    }
    public String getProperty(String key){
        if(hasProperty(key)){
            String[] queries=this.query.split("&");
            List<String> keys = new ArrayList<>();
            List<String> values= new ArrayList<>();
            for (String s : queries) {
                keys.add(s.substring(0, s.indexOf('=')));
                values.add(s.substring(s.indexOf("=")+1,s.length()));
            }
            for (int i=0;i<keys.size();i++) {
                if (keys.get(i).equals(key)) {
                    return values.get(i);
                }
            }
            return "Nincs ilyen kulcs!";
        }
        else{
            return "Nincs ilyen kulcs";
        }
    }

    private String getProtocolFromUrl(String url){
        return url.toLowerCase().substring(0,url.indexOf(":"));
    }
    private int getPortFromUrl(String url){
        int protLen=getProtocolFromUrl(url).length();
        int hostLen=getHostFromUrl(url).length();
        if(url.indexOf(':',protLen+1)==-1){
            return -1;
        }
        int start=protLen+hostLen+4;
        String solution=url.substring(start,url.indexOf('/',start));
        return Integer.parseInt(solution);
    }

    private String getHostFromUrl(String url){
        int start=url.indexOf("//")+2;
        String solution=url.toLowerCase().substring(start,url.indexOf("/",start));
        if(solution.contains(":")){
            solution=solution.substring(0,solution.indexOf(":"));
        }
        return solution;
    }
    private String getPathFromUrl(String url){
        int protLen=getProtocolFromUrl(url).length();
        int hostLen=getHostFromUrl(url).length();
        int portLen=0;
        if(getPortFromUrl(url)!=0)
            portLen=String.valueOf(getPortFromUrl(url)).length();
        String solution=url.substring(protLen+hostLen+portLen+4,url.indexOf('?'));
        return solution;
    }
    private String getQueryFromUrl(String url){
        if(url.contains("?"))
            return url.substring(url.indexOf("?")+1,url.length());
        else
            return "";
    }

    @Override
    public String toString() {
        String result="protocol: " + protocol + '\n' +
                "port: " + port +"\n"+
                "host: " + host + '\n' +
                "path: " + path + '\n' +
                "query: " + query;
        String result2="protocol: " + protocol + '\n' +
                "port: Nincs\n"+
                "host: " + host + '\n' +
                "path: " + path + '\n' +
                "query: " + query;
        if(this.port!=-1){
            return result;
        }
        else{
            return result2;
        }

    }

    public static void main(String[] args) {
        String url="https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        String url2="https://earthquake.usgs.gov:8080/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);
        System.out.println(urlManager);

        System.out.println();

        UrlManager urlManager2= new UrlManager(url2);
        System.out.println(urlManager2);

        System.out.println();

        System.out.println("'format' értékének lekérdezése: "+urlManager.getProperty("format"));
        System.out.println("'starttime' értékének lekérdezése: "+urlManager.getProperty("starttime"));
        System.out.println("'endtime' értékének lekérdezése: "+urlManager.getProperty("endtime"));

        System.out.println("'valami' értékének lekérdezése: "+urlManager2.getProperty("valami"));

    }

}
