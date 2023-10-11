package api.test;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.ClaimModule;

import io.restassured.response.Response;

public class ClaimTests {
	
	Faker faker;
	ClaimModule claimpayload;
	
	public Logger logger;
	
	@BeforeClass
	public void setup()
	{
		faker = new Faker();
		
		claimpayload=new ClaimModule();
		
		//claimpayload.setBillDate("5/10/2023");
		claimpayload.setBillNo("5");
		claimpayload.setCategory("Site Visite");
		claimpayload.setProject("Guide Villa");
		claimpayload.setDescription("good");
		claimpayload.setRemarks("food expense");
		claimpayload.setAmount("200");
		
		// logs

		logger= LogManager.getLogger(this.getClass());
	}
	@Test(priority=1)
	public void testPostClaim()
	{
		Response response= UserEndPoints.createUser(claimpayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=2)
	public void testGetUserById()
	{
		logger.info("*****creating User******");
		Response response= UserEndPoints.readUser(this.claimpayload.getClaimId(), claimpayload);
		response.then().log().all();
		
	//response.statusCode();
		
		
		Assert.assertEquals(response.statusCode(), 200);
		logger.info("*****User claim created******");
	}
	@Test(priority=3)
	public void testUpdateUserById()
	{
		logger.info("*****get user update by id******");
		claimpayload.setRemarks("travel expense");
		claimpayload.setAmount("300");
		
		Response response= UserEndPoints.UpdateUser(this.claimpayload.getClaimId(), claimpayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("*****get messages updated successfully******");
		//checking after Update
		
		logger.info("***********");
		Response responseAfterUpdate= UserEndPoints.UpdateUser(this.claimpayload.getClaimId(), claimpayload);
		
		response.then().log().all();
		
		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
	}
	@Test(priority=4)
	public void testDeleteUserByName()
	{
		 Response response= UserEndPoints.DeleteUser(this.claimpayload.getClaimId());
		 Assert.assertEquals(response.getStatusCode(), 200);
		 	
	}
	

	
}
 