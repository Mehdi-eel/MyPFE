package ma.pfe.local.Repositories;

import ma.pfe.local.Entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    long create(StudentEntity e);
    boolean update(StudentEntity e);
    boolean delete(Long id);
    List<StudentEntity> readAll();
}
