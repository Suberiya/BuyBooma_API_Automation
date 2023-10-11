package api.endpoints;
import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.ClaimModule;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints2 {

	//private static final Response Response = null;
	
	
	
	// method created for getting URl From Properties 
	public static ResourceBundle getURL()
	{
		ResourceBundle routes =ResourceBundle.getBundle("routes");
		return routes;
	}
	

	public static Response createUser(ClaimModule payload)
	{
		String post_URL= getURL().getString("post_url");
		
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)

				.when()
				.post(post_URL);

		return response;
	}

	public static Response readUser(String claimId)
	{
		
		String Get_URL= getURL().getString("Get_url");
		Response response = given()
				.pathParam("ClaimId", claimId)
				.when()
				.get(Get_URL); 
		return response;

	}
	public static Response UpdateUser(String claimId, ClaimModule payload)
	{
		
		String edit_url= getURL().getString("Edit_url");
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("ClaimId", claimId)
				.body(payload)

				.when()
				.post(edit_url);

		return response;
	}
	public static Response DeleteUser(String claimId)
	{
		String delete_url= getURL().getString("Delete_url");
		Response response = given()
				.pathParam("ClaimId", claimId)
				.when()
				.post(delete_url);

		return response;
	}

}
