import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target = "number", source = "entity.id"),
            @Mapping(target = "lastName", source = "entity.employeeLastName"),
            @Mapping(target = "departmentDto", source = "entity.department")
    }
    )
    EmployeeDto entityToDto(Employee employee);

    @Mappings({
            @Mapping(target = "id", source = "entity.number"),
            @Mapping(target = "employeeLastName", source = "entity.lastName"),
            @Mapping(target = "department", source = "entity.departmentDto")
    }
    )
    Employee dtoToEntity(EmployeeDto employeeDto);
}