package ma.pfe.local.Services;

import ma.pfe.local.Dtos.StudentDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final static Logger LOG = LoggerFactory.getLogger(StudentService.class);

    @Override
    public long create(StudentDto dto) {
        LOG.debug("start methode create");
        return 22;
    }

    @Override
    public boolean update(StudentDto dto) {
        LOG.debug("start methode update");
        return false;
    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start methode delete");
        return false;
    }

    @Override
    public StudentDto save(StudentDto dto) {
        LOG.debug("start methode save");
        return null;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode readAll");
        return new ArrayList<>();
    }
    
}
