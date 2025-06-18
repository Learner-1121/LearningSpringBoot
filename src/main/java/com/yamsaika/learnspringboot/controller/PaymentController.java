package com.yamsaika.learnspringboot.controller;

import com.yamsaika.learnspringboot.DTO.PaymentRequest;
import com.yamsaika.learnspringboot.DTO.PaymentResponse;
import com.yamsaika.learnspringboot.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentDetailsById(@PathVariable long id)
    {
        PaymentRequest internalObjectRequest = new PaymentRequest();
        internalObjectRequest.setPaymentId(id);

        PaymentResponse payment = paymentService.getPaymentDetailsById(internalObjectRequest);
        return ResponseEntity.ok(payment);

    }


}
