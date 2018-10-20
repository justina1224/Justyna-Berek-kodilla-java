package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Processing order..");
        LOGGER.info("Class: " + object.getClass().getName());
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)))")
    public Object measureTimeForProcessingOrder(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object totalTime;
        try {
            long begin = System.currentTimeMillis();
            totalTime = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Processing order time: " + (end - begin) + "[ms]");
        } catch (Throwable throwable){
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return totalTime;
    }

    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(order, userId)")
    public void logEventAfter(OrderDto order, Long userId) {
        LOGGER.info("Order processing is closed");
    }
}
