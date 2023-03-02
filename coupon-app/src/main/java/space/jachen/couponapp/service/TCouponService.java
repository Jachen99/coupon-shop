package space.jachen.couponapp.service;

import space.jachen.couponapp.entity.TCoupon;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 优惠券定	义表 服务类
 * </p>
 *
 * @author jachen
 * @since 2023-03-01
 */
public interface TCouponService extends IService<TCoupon> {

    List<TCoupon> getAll();

}
