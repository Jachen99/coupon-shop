package space.jachen.couponapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.jachen.couponapp.entity.TCoupon;
import space.jachen.couponapp.service.TCouponService;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TCouponService tCouponService;
    @RequestMapping("/test")
    public List<TCoupon> test(){
        List<TCoupon> couponList = tCouponService.getAll();
        return couponList;
    }
}
