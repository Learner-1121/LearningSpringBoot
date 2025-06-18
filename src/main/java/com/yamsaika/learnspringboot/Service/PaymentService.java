package com.yamsaika.learnspringboot.Service;

import com.yamsaika.learnspringboot.DTO.PaymentRequest;
import com.yamsaika.learnspringboot.DTO.PaymentResponse;
import com.yamsaika.learnspringboot.Entity.PaymentEntity;
import com.yamsaika.learnspringboot.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj)
    {
        PaymentEntity paymentModel = paymentRepository.getPaymentById(internalRequestObj);

        PaymentResponse paymentResponse = mapModelToResponseDTO(paymentModel);
        return paymentResponse;
    }
    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity)
    {
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setPaymentAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getCurrency());
        return response;
    }
}
