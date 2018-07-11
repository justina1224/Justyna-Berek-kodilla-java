package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;
    private Delivery delivery;
    private PaymentMethod paymentMethod;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final InformationService informationService, final Delivery delivery, final PaymentMethod paymentMethod,
                          final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.delivery = delivery;
        this.paymentMethod = paymentMethod;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isProceed = orderService.orderCreated(orderRequest);

        if (isProceed) {
            delivery.chooseDeliveryOption();
            System.out.println("Adding shipping fee " + delivery.getAdditionalFee() + ", total price: " + orderRequest.getTotalPrice());
            paymentMethod.pay();
            orderRepository.create(orderRequest.getOrder(), orderRequest.getBuyer());
            informationService.inform(orderRequest.getBuyer());

            System.out.println("Order in progress");
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getOrder(), true);

        } else {

            System.out.println("Order cancelled");
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getOrder(), false);
        }
    }
}
