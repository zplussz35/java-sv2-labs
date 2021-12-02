package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> members;

    public Family(List<FamilyMember> members) {
        this.members = members;
    }

    public List<FamilyMember> getMembers() {
        return members;
    }

    public void addFamilyMember(FamilyMember member){
        this.members.add(member);
    }

    public List<Integer> agesOfFamilyMembersWithNameGive(String name){
        List<Integer> ages= new ArrayList<>();
        for (FamilyMember fm:this.members) {
            if(fm.getName().contains(name)){
                ages.add(fm.getAge());
            }
        }
        return ages;
    }
}
