package com.iBanking.Functionalinterface;

public class LoanProcessorClient {
	
	
	public static void main(String args[]) {
	Loan loanlan = () -> {
		System.out.println("gfvjkeagfjhv");
       return "jhbfyubgv";
       
	}	;
    loanlan.createLoan();		
    
    Loan loanlangl = () -> {
		System.out.println("GLLLLvjkeagfjhv");
       return "jhbfyubgv";
       
	}	;
    loanlangl.createLoan();	

    LoanDaoImpl loanDaoImpl = new LoanDaoImpl();
    LoanPojo loanPojo = new LoanPojo();
    loanPojo.setAge(25);
    loanPojo.setCustomerName("rahul");
    loanPojo.setGender("m");
    
    LoanType loanTypes = (loanPojoObj) -> {
    	if(loanPojoObj.getGender().equals("m")) {
    		int interestRate=9;
    	}
    	else {
    		int interestRate=7;}
		return loanPojoObj;
    };
    loanDaoImpl.createLoan(loanTypes, loanlangl);

	}

	
}
	
