package gr.unipi.client.boundary;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("init")
public class InitResource {

  @POST
  public String init() {
    return "";
  }
}
