public interface ITDepartment extends School {
    //between 2 interfaces we use extends
    public static final  String DEPARTMENTNAME="IT Department";

    public abstract Instructor instructor();

    public abstract Student student();


    public String labName();


    public boolean isLabAvailable();


}
