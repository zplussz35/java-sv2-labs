package catalog;

public class SearchCriteria {
    public String contributor;
    public String title;


    public static SearchCriteria createByBoth(String title,String contributor){
        if(Validators.isBlank(contributor)||Validators.isBlank(title)){
            throw new IllegalArgumentException("Contributor or title should not be null or empty!");
        }
        return new SearchCriteria(contributor,title);
    }
    public static SearchCriteria createByContributor(String contributor){
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Contributor should not be null or empty!");
        }
        return new SearchCriteria(contributor,"");
    }
    public static SearchCriteria createByTitle(String title){
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title should not be null or empty!");
        }
        return new SearchCriteria("",title);
    }

    public boolean hasTitle(){
        if(Validators.isBlank(title)){
            return false;
        }
        return true;
    }
    public boolean hasContributor(){
        if(Validators.isBlank(contributor)){
            return false;
        }
        return true;
    }


    private SearchCriteria(String contributor, String title){

        this.contributor=contributor;
        this.title=title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

}
