package com.shariqparwez.cxfdemo.orders;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.shariqparwez.schema.order.AccountType;
import com.shariqparwez.schema.order.ObjectFactory;
import com.shariqparwez.schema.order.OrderInquiryResponseType;
import com.shariqparwez.schema.order.OrderInquiryType;
import com.shariqparwez.service.orders.Orders;

@WebService(portName="OrdersSOAP", serviceName="Orders",
endpointInterface="com.shariqparwez.service.orders.Orders",
targetNamespace="http://www.shariqparwez.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {

	@Autowired
	private OrderService orderService;
	
	@Override
	public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {

		OrderInquiryResponseType response = orderService.processOrder(orderInquiry.getUniqueOrderId(), orderInquiry.getOrderQuantity(), orderInquiry.getAccountId(), orderInquiry.getEan13());
		
		return response;
	}

}
