package com.shariqparwez.cxfdemo.orders;

import com.shariqparwez.schema.order.OrderInquiryResponseType;

public interface OrderService {

	OrderInquiryResponseType processOrder(int uniqueOrderId, int orderQuantity,
			int accountId, long ean13);
	
}
