package ma.pfe.local.Services;

import ma.pfe.local.Dtos.StudentDto;

import java.util.List;

public interface StudentService {

    long create (StudentDto dto);
    boolean update(StudentDto dto);
    boolean delete(Long id);
    
    StudentDto save(StudentDto dto);
    List<StudentDto> readAll();
}
