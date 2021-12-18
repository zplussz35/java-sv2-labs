package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {
    static PrimarySchoolChild of(int age){
        if(age>5&&age<11){
            return new LowerClassSchoolChild(age);
        }
        else if(age>10&&age<15){
            return new UpperClassSchoolChild(age);
        }
        else{
            throw new IllegalArgumentException("It's not a schoolchild with this age!");
        }
    }
}
