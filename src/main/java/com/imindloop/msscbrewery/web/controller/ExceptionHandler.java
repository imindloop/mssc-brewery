package com.imindloop.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;


/**
 * This replaces @ExceptionHandler instances in controllers, centralizing exception handling.
 */
@ControllerAdvice()
public class ExceptionHandler {

    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException cve) {

        List<String> errors = new ArrayList<>();

        cve.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath() + ":" + constraintViolation.getMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
