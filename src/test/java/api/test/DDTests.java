package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;



import api.endpoints.UserEndPoints;
import api.payload.ClaimModule;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {
	
	
	@Test(priority=1, dataProvider="Data", dataProviderClass=DataProviders.class)
	public void testPostUser(String billDate, String billNo, String description, String remarks, String setAmount)
	{
		
		ClaimModule claimpayload= new ClaimModule();
		claimpayload.setBillDate(Integer.parseInt(billDate));
		claimpayload.setBillNo(billNo);
		claimpayload.setDescription(description);
		claimpayload.setRemarks(remarks);
		claimpayload.setAmount(setAmount);
		
		
	Response response= (Response) UserEndPoints.createUser(claimpayload);
	
	Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	@Test(priority=2, dataProvider= "UserName", dataProviderClass=DataProviders.class)
	public void testDeleteUserById(String claimId)
	{

	Response response=	UserEndPoints.DeleteUser(claimId);
	
	
	}
}
