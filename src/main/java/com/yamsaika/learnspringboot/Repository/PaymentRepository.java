package com.yamsaika.learnspringboot.Repository;

import com.yamsaika.learnspringboot.DTO.PaymentRequest;
import org.springframework.stereotype.Repository;
import com.yamsaika.learnspringboot.Entity.PaymentEntity;
@Repository
public class PaymentRepository {
    public PaymentEntity getPaymentById(PaymentRequest request)
    {
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }
    public PaymentEntity executeQuery(PaymentRequest request)
    {
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setId(request.getPaymentId());
        paymentEntity.setCurrency("INR");
        paymentEntity.setPaymentAmount(100.00);
        return paymentEntity;
    }
}
