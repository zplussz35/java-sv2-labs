package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements  Feature{
    private List<String> composers = new ArrayList<>();
    private int length;
    private List<String>performers= new ArrayList<>();
    private String title;


    public AudioFeatures(String title, int length,List<String> performers) {
        if(length<1){
            throw new IllegalArgumentException("Dont correct length!");
        }
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title should be filled!");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Should be performers!");
        }
        this.title = title;
        this.length = length;
        this.performers.addAll(performers);
    }

    public AudioFeatures(String title, int length, List<String> performers,List<String> composers) {
        if(length<1){
            throw new IllegalArgumentException("Dont correct length!");
        }
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Title should be filled!");
        }
        if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Should be performers!");
        }
        this.title = title;
        this.length = length;
        this.performers.addAll(performers);
        this.composers.addAll(composers);
    }

    @Override
    public List<String> getContributors() {
        List<String> result=new ArrayList<>();
        result.addAll(composers);
        result.addAll(performers);

        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
