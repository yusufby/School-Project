public interface LanguageDepartment extends School {

    public static final  String DEPARTMENTNAME="Language Department";

    public abstract Instructor instructor();

    public abstract Student student();


    public String labName();


    public boolean isLabAvailable();


}
