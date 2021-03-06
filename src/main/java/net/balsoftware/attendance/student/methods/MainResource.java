package net.balsoftware.attendance.student.methods;

import net.balsoftware.attendance.student.service.StudentService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 * http://localhost:8080/myapp/myresource
 */
@Path("myresource")
public class MainResource {

//    private final StudentService studentService;
//
//    @Inject
//    public MainResource(StudentService studentService) {
//        this.studentService = studentService;
//    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }


//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getStudent(int id)
//    {
//        return studentService.getStudentById(id);
//    }

}
