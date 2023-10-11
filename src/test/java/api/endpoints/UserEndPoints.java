package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.ClaimModule;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {

	private static final Response Response = null;

	public static Response createUser(ClaimModule payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)

				.when()
				.post(Routes.post_url);

		return response;
	}

	public static Response readUser(String claimId, ClaimModule payload)
	{
		Response response = given()
				.pathParam("ClaimId", claimId)
				.when()
				.get(Routes.Get_url);
		return Response;

	}
	public static Response UpdateUser(String claimId, ClaimModule payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("ClaimId", claimId)
				.body(payload)

				.when()
				.post(Routes.Edit_url);

		return response;
	}
	public static Response DeleteUser(String claimId)
	{
		Response response = given()
				.pathParam("ClaimId", claimId)
				.when()
				.post(Routes.Delete_url);

		return response;
	}

}
