/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
 
@Path("/CIService")
public class CompoundInterestService {
	@GET
	@Path("/ci/{amount}/{years}/{rate}")
	@Produces("application/json")
	public Response calculateCompInterest(@PathParam("amount") Double p,@PathParam("years") Double t,@PathParam("rate") Double r)
	{
		JSONObject jsonObject = new JSONObject();
		Double ci;
		ci = p * Math.pow((1 + r/100),t);
		jsonObject.put("Amount", p); 
		jsonObject.put("Years", t); 
		jsonObject.put("Rate", r); 
		jsonObject.put("Compound Interest", ci);
		String result = "@Produces(\"application/json\") Output: \n\nCompound Interest Output: \n\n" + jsonObject;
	//	return "<Compound Calculator>" + "<Amount>" + p + "</Amount>" + "<No. of Years>" + t + "</No. of Years>" + "<Interest Rate>" + r + "</Interest Rate>" + "<Simple Interest>" + ci + "</Compound Interest>" + "</Interest Calculator>";
		return Response.status(200).entity(result).build();
	}
}