package ma.pfe.local.Controllers;

import ma.pfe.local.Dtos.StudentDto;
import ma.pfe.local.Services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")

public class StudentController {

    private final static Logger LOG =  LoggerFactory.getLogger(StudentController.class);
    private StudentService service;
    StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto)
    {
        LOG.debug("start method create");
        long id = service.create(dto);
        LOG.debug("end method create");
        return dto;
    }

    @PutMapping
    public boolean update(@RequestBody StudentDto dto)
    {
        LOG.debug("start method update");
        boolean id = service.update(dto);
        LOG.debug("end method update");
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id)
    {
        LOG.debug("start method delete");
        LOG.debug("end method delete");
        return service.delete(id);
    }

    @GetMapping
    public List<StudentDto> selectAll()
    {
        LOG.debug("start method update");
        LOG.debug("end method update");
        return service.readAll();
    }
    /*
    Log.debug("Start méthod name");
    long result = service.create(dto);
    Long.debug("End method name");
    return result;

    *
     */
}
