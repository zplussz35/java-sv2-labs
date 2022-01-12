package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private List<Feature> features= new ArrayList<>();
    private String registrationNumber;
    private int price;

    public CatalogItem(String registrationNumber, int price,Feature... features) {
        this.features.addAll(Arrays.stream(features).toList());
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    public int fullLengthAtOneItem(){
        int result=0;
        for (Feature f: features) {
            if(f instanceof AudioFeatures){
                result+=((AudioFeatures) f).getLength();
            }
        }
        return result;
    }

    public List<String> getContributors(){
        List<String> result=new ArrayList<>();
        for (Feature f:features) {
            result.addAll(f.getContributors());
        }
        return result;
    }
    public List<String> getTitles(){
        List<String> result=new ArrayList<>();
        for (Feature f:features) {
            result.add(f.getTitle());
        }
        return result;
    }
    public boolean hasAudioFeature(){
        if(!features.isEmpty()){

            for (Feature f:features) {
                if(f instanceof AudioFeatures){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    public boolean hasPrintedFeature(){
        if(!features.isEmpty()){

            for (Feature f:features) {
                if(f instanceof PrintedFeatures){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int numberOfPagesAtOneItem(){
        int result=0;
        for (Feature f: features) {
            if(f instanceof PrintedFeatures){
                result+=((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return result;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

}
