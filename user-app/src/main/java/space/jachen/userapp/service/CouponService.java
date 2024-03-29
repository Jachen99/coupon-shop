package space.jachen.userapp.service;

import org.springframework.stereotype.Service;
import space.jachen.userapp.domain.TCoupon;
import space.jachen.userapp.domain.TCouponExample;
import space.jachen.userapp.mapper.TCouponMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CouponService {

    @Resource
    private TCouponMapper tCouponMapper;

    public void print(){
        System.err.println("enter coupon service");
    }


    public String query(){
        TCouponExample example = new TCouponExample();
        example.createCriteria().andCodeEqualTo("0057da3c-f2ad-42bd-b6d2-8bb58b6dbc90");
        List<TCoupon> tCoupon =  tCouponMapper.selectByExample(example);
        return tCoupon.get(0).toString();
    }


}
