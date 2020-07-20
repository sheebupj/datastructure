package com.paremal.sheebu.algorithms;

public class pr {
	 public boolean subscribePromotion(String customerid, String promoId)throws InvalidCustomerException,InvalidPromotionExcetption {
		 
		 if(customerid==null) {
			 throw new InvalidCustomerException("Customer id is null");
		 }
		 if(promoId==null) {
			 throw new InvalidPromotionExcetption("Promotion id is null");
		 }
	    	Promotion promotion = promotionService.getById(promoId);
	    	// PromotionCustomer class hold mapping for customer and promotion. PromotionCustomer
	    	promotionCustomer = new PromotionCustomer(customerid, promotion.getPromotionId(),
	    	promotion.getDescription());
	} 

}
