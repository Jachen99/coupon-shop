package space.jachen.couponapp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import space.jachen.couponapp.entity.TCoupon;
import space.jachen.couponapp.mapper.TCouponMapper;
import space.jachen.couponapp.service.TCouponService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 优惠券定	义表 服务实现类
 * </p>
 *
 * @author jachen
 * @since 2023-03-01
 */
@Service
public class TCouponServiceImpl extends ServiceImpl<TCouponMapper, TCoupon> implements TCouponService {

    @Resource
    private TCouponMapper tCouponMapper;

    @Override
    public List<TCoupon> getAll() {

        return tCouponMapper.selectList(null);
    }
}
