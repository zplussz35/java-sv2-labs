package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    protected List<CatalogItem> catalogItems = new ArrayList<>();


    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }
    public double averagePageNumberOver(int limit){
        double result=0.0;
        int db=0;
        for (CatalogItem c:catalogItems) {
            for (Feature f:c.getFeatures()) {
                if(f instanceof PrintedFeatures){
                    if(((PrintedFeatures) f).getNumberOfPages()<1){
                        throw new IllegalArgumentException("Page number must be positive");
                    }
                    if(((PrintedFeatures) f).getNumberOfPages()>limit){
                        result+=((PrintedFeatures) f).getNumberOfPages()*1.0;
                        db++;
                    }

                }
            }
        }
        if(result==0.0){
            throw new IllegalArgumentException("No page");
        }
        if(result<1){
            throw new IllegalArgumentException("Page number must be positive");
        }
        return result/db;
    }
    public void deleteItemByRegistrationNumber(String regNumber){
        catalogItems.removeIf(c -> c.getRegistrationNumber().equals(regNumber));
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
            List<CatalogItem> result=new ArrayList<>();
        for (CatalogItem c:catalogItems) {
            if(c.getContributors().contains(searchCriteria.getContributor())||c.getTitles().contains(searchCriteria.getTitle())){
                result.add(c);
            }
        }
        return result;
    }
    public int getAllPageNumber(){
        int result=0;
        for (CatalogItem c:catalogItems) {
            for (Feature f:c.getFeatures()) {
                if(f instanceof PrintedFeatures){
                    result+=((PrintedFeatures) f).getNumberOfPages();
                }
            }
        }
        return result;
    }
    public List<CatalogItem> getAudioLibraryItems(){
        List<CatalogItem> result=new ArrayList<>();
        for (CatalogItem c: catalogItems) {
            for (Feature f :c.getFeatures()){
                if(f instanceof AudioFeatures){
                    result.add(c);
                    break;
                }
            }
        }
        return result;
    }
    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> result=new ArrayList<>();
        for (CatalogItem c: catalogItems) {
            for (Feature f :c.getFeatures()){
                if(f instanceof PrintedFeatures){
                    result.add(c);
                    break;
                }
            }
        }
        return result;
    }

    public int getFullLength(){
        int result=0;
        for (CatalogItem c:catalogItems) {
            for (Feature f:c.getFeatures()) {
                if(f instanceof AudioFeatures){
                    result+=((AudioFeatures) f).getLength();
                }
            }
        }
        return result;
    }
}
