package api.endpoints;

//https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller

// post create A claim https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller/createClaim
// GET https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller/getClaims
// EDIT https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller/editClaim
// DELETE https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller/deleteClaim





public class Routes {
	
	
	public static String base_URL= "https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller";

	
	//Claim Module
	
	//public static String post_url=base_URL+"/createClaim";
	public static String post_url ="https://mid.buybooma.in:8081/swagger-ui/index.html#/claim-controller/createClaim";
	
	public static String Get_url=base_URL+"/getClaims/{claimId}";
	
	public static String Edit_url=base_URL+"/editClaim/{claimId}";
	
	public static String Delete_url=base_URL+"/deleteClaim/{claimId}";
	
}
