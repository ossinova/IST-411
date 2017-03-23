/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author OscarDyremyhr
 */
@Path("users")
public class UsersResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsersResource
     */
    public UsersResource() {
    }

    /**
     * Retrieves representation of an instance of users.UsersResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/users/allUsers")
    @Produces(MediaType.TEXT_HTML)
    public String getHTML() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of UsersResource
     * @param content representation for the resource
     */
    @PUT
    @Path("/users/updateUsers")
    @Consumes(MediaType.TEXT_HTML)
    public void putHTML(String content) {
        
    }
    
    @POST
    @Path("/users/createUsers")
    @Consumes(MediaType.TEXT_HTML)
    public void postHTML(String content) {
        
    }
    
    @DELETE
    @Path("/users/deleteUsers")
    
}
