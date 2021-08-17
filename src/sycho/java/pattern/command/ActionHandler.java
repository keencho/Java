package sycho.java.pattern.command;

public class ActionHandler {
    public void action(Order order) {
        String message = null;

        if (order.getOrderStatus() == OrderStatus.RECEIPT) {
            message = "접수 완료 되었습니다.";
            dispatch(order); // 기사에게 배차
        } else if (order.getOrderStatus() == OrderStatus.DISPATCH) {
            sendPushToDriver(order); // 기사에게 배차되었음을 알리는 push 메시지 발송
        } else if (order.getOrderStatus() == OrderStatus.START) {
            message = "배송이 시작되었습니다.";
        } else if (order.getOrderStatus() == OrderStatus.COMPLETE) {
            message = "배송이 완료되었습니다.";
        }

        if (message != null) {
            sendMessage(order, message);
        }
    }

    private void dispatch(Order order) {
        // ....

        System.out.println(order.getToName() + " 고객에게 배송될 물건 배차 완료");
    }


    private void sendPushToDriver(Order order) {
        // ...

        System.out.println(order.getDriverName() + " 기사에게 푸시 발신성공");
    }

    private void sendMessage(Order order, String message) {
        String number = order.getToNumber();

        // .....

        System.out.println(number + " 에게 메시지 발신 성공");
    }
}
