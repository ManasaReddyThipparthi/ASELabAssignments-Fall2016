/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/SIService")
public class SimpleInterestService {
 

		@GET
		@Path("/si/{amount}/{years}/{rate}")
		@Produces("application/json")
		public Response calculateSimpleInterest(@PathParam("amount") Double p,@PathParam("years") Double t,@PathParam("rate") Double r)
		{
			JSONObject jsonObject = new JSONObject();
			Double si;
			si = (p*t*r)/100;
			jsonObject.put("Amount", p); 
			jsonObject.put("Years", t); 
			jsonObject.put("Rate", r); 
			jsonObject.put("Simple Interest", si);
			String result = "@Produces(\"application/json\") Output: \n\nSimple Interest Output: \n\n" + jsonObject;
		//	return "<Interest Calculator>" + "<Amount>" + p + "</Amount>" + "<No. of Years>" + t + "</No. of Years>" + "<Interest Rate>" + r + "</Interest Rate>" + "<Simple Interest>" + si + "</Simple Interest>" + "</Interest Calculator>";
				return Response.status(200).entity(result).build();
		}
}