package space.jachen.couponapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import space.jachen.couponapp.entity.TCoupon;
import space.jachen.couponapp.service.TCouponService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JaChen
 * @date 2023/3/1 20:13
 */
@SpringBootTest
public class Test1 {
    @Resource
    private TCouponService tCouponService;

    @Test
    public void test(){
        List<TCoupon> couponList = tCouponService.getAll();
        System.out.println("couponList = " + couponList);
    }

}
