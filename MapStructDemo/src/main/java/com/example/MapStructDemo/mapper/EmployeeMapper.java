package com.example.MapStructDemo.mapper;

import com.example.MapStructDemo.model.Employee;
import com.example.MapStructDemo.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    /// mappin with di
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
//    @Mapping(target = "employeeId", source = "entity.id")
//    @Mapping(target = "employeeName", source = "entity.name")
//    EmployeeDTO employeeToEmployeeDTO(Employee entity);
//
//    @Mapping(target = "id", source = "dto.employeeId")
//    @Mapping(target = "name", source = "dto.employeeName")
//    Employee employeeDTOtoEmployee(EmployeeDTO dto);

    // mappin with type conversion

    @Mapping(target="employeeId", source = "entity.id")
    @Mapping(target="employeeName", source = "entity.name")
    @Mapping(target="employeeStartDt", source = "entity.startDt",
            dateFormat = "dd-MM-yyyy HH:mm:ss")
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mapping(target="id", source="dto.employeeId")
    @Mapping(target="name", source="dto.employeeName")
    @Mapping(target="startDt", source="dto.employeeStartDt",
            dateFormat="dd-MM-yyyy HH:mm:ss")
    Employee employeeDTOtoEmployee(EmployeeDTO dto);




}

