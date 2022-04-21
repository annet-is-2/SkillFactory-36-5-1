public class DepartmentDto {
    private String id;

    private String name;

    @Override
    public String toString(){
        return "Department "+this.id+" "+this.name;
    }

}
