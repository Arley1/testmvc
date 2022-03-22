import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMQTest {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void testSendMessage2SimpleQueue(){
        String queueName="simple.queue";
        String message ="hello.spring amqp";
        rabbitTemplate.convertAndSend(message);
    }

    @Test
    public void testSendFanoutExchange(){
        //交换机名称
        String exchangeName ="exchange.fanout";
        //消息
        String message="hello ,every one";
        //发送消息
        rabbitTemplate.convertAndSend(exchangeName,"",message);
    }

    @Test
    public void testSendDirectExchange(){
        //交换机名称
        String exchangeName="exchange.direct";
        //消息
        String message ="hello,red";
        //发送消息
        rabbitTemplate.convertAndSend(exchangeName,"red",message);
    }

}
