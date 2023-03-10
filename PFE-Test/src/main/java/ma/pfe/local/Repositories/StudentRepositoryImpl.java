package ma.pfe.local.Repositories;

import javassist.bytecode.stackmap.TypeData;
import ma.pfe.local.Entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements  StudentRepository{

    private final static Logger LOG = LoggerFactory.getLogger(TypeData.ClassName.class);

    @Override
    public long create(StudentEntity e) {
        LOG.debug("start methode create");
        return 14;
    }

    @Override
    public boolean update(StudentEntity e) {
        LOG.debug("start methode update");
        return true;
    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start methode delete");
        return true;
    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start methode readAll");
        return new ArrayList<>();
    }



}
