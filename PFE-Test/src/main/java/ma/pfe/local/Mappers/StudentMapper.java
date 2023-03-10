package ma.pfe.local.Mappers;

import ma.pfe.local.Dtos.StudentDto;
import ma.pfe.local.Entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    StudentDto converttoDto(StudentEntity entity)
    {
        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }
    StudentEntity converttoEntity(StudentDto dto)
    {
        StudentEntity  entity= new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    List<StudentEntity> converttoEntities(List<StudentDto> dtos)
    {
        return dtos.stream().map(dto -> converttoEntity(dto)).collect(Collectors.toList());
    }
    List<StudentDto> coverttoDtos(List<StudentEntity> l)
    {
        return l.stream().map(entity -> converttoDto(entity)).collect(Collectors.toList());
    }

}
