package courseManagement;

public abstract class CourseType {
    private String name;
    public CourseType(String name){
        this.name = name;
    }
    
    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public abstract void evaluate();
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " name : " + name;
    }
}
