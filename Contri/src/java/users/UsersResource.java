/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
//meet and ist
        

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
    
    File file = new File("users.txt");
    
    
    @GET
   // @Path("/users/allUsers")
    @Produces(MediaType.TEXT_HTML)
    public File getHTML() throws FileNotFoundException, IOException {
     FileReader fr = new FileReader(file);
     fr.close();
        
     return file;
    }

    /**
     * PUT method for updating or creating an instance of UsersResource
     * @param content representation for the resource
     * @return 
     * @throws java.io.IOException
     */
    @PUT
    @Path("/users/updateUsers")
    @Consumes(MediaType.TEXT_HTML)
    public File putHTML(String content) throws IOException {
      FileWriter writer = new FileWriter(file); 
      writer.write(content + "\n"); 
      writer.close();
      
      return file;
    }
    
    @POST
    @Path("/users/createUsers")
    @Consumes(MediaType.TEXT_HTML)
    public File postHTML(String content) throws IOException {
     file.createNewFile();
      
     return file;
    }
    
    @DELETE
    @Path("/users/deleteUsers")
    @Consumes(MediaType.TEXT_HTML)
    public File deleteHTML(String content) {
     
        
      
     return file;
    } 
}
