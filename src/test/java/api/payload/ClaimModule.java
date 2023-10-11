package api.payload;


//pojo => Plain Old Java Object

//Json= > java Script object notation
public class ClaimModule {
	String claimId;
	int   billDate;
	String billNo;
	String  category;
	String project; 
	String description;
	String remarks;
	String amount;
	String  status;
	String rejectReason;
	String approvedAmount;
	String paymentMode;

	public String getClaimId() {
		return claimId;
	}
	public void setclaimID(String claimId) {
		this.claimId = claimId;
	}
	public int getBillDate() {
		return billDate;
	}
	public void setBillDate(int billDate) {
		this.billDate = billDate;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getApprovedAmount() {
		return approvedAmount;
	}
	public void setApprovedAmount(String approvedAmount) {
		this.approvedAmount = approvedAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
}
