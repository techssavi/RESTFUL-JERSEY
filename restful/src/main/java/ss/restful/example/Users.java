package ss.restful.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import ss.restful.example.service.UserService;


@Path("/users")
public class Users implements UserService {

	/* (non-Javadoc)
	 * @see ss.restful.example.UserService#welcomeMessage(java.lang.String)
	 */
	@GET
	@Path("/{name}")
	public String welcomeMessage(@PathParam("name") String name) {
		return "Hello!! " + name;
	}
	
	
	
	
}
