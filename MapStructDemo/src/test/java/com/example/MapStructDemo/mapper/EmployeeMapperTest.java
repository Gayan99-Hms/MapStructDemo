package com.example.MapStructDemo.mapper;

import com.example.MapStructDemo.model.Employee;
import com.example.MapStructDemo.model.EmployeeDTO;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeMapperTest {

    private EmployeeMapper mapper = EmployeeMapper.INSTANCE;
    private static final String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";

    @Test
    public void givenEmpStartDtMappingToEmpDTO_whenMaps_thenCorrect() throws ParseException {
        Employee entity = new Employee();
        entity.setStartDt(new Date());
        EmployeeDTO dto = mapper.employeeToEmployeeDTO(entity);
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);

        assertEquals(format.parse(dto.getEmployeeStartDt()).toString(),
                entity.getStartDt().toString());
    }
    @Test
    public void givenEmpDTOStartDtMappingToEmp_whenMaps_thenCorrect() throws ParseException {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeStartDt("01-04-2016 01:00:00");
        Employee entity = mapper.employeeDTOtoEmployee(dto);
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);

        assertEquals(format.parse(dto.getEmployeeStartDt()).toString(),
                entity.getStartDt().toString());
    }
//    @Test
//    public void givenEmployeeDTOwithDiffNametoEmployee_whenMaps_thenCorrect() {
//        EmployeeDTO dto = new EmployeeDTO();
//        dto.setEmployeeId(1);
//        dto.setEmployeeName("John");

//        Employee entity = mapper.employeeDTOtoEmployee(dto);

//        assertEquals(dto.getEmployeeId(), entity.getId());
//        assertEquals(dto.getEmployeeName(), entity.getName());
//    }
}

