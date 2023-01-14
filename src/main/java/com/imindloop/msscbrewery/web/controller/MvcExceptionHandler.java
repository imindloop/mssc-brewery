package com.imindloop.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;


/**
 * This replaces @ExceptionHandler instances in controllers, centralizing exception handling.
 */
@ControllerAdvice()
public class MvcExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException cve) {

        List<String> errors = new ArrayList<>();

        cve.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath() + ":" + constraintViolation.getMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<List> handleBindException(BindException bex) {
        return new ResponseEntity<List>(bex.getAllErrors(), HttpStatus.BAD_REQUEST);
    }
}
