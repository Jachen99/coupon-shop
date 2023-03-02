package space.jachen.couponapp.mapper;

import org.apache.ibatis.annotations.Mapper;
import space.jachen.couponapp.entity.TCoupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 优惠券定	义表 Mapper 接口
 * </p>
 *
 * @author jachen
 * @since 2023-03-01
 */
@Mapper
public interface TCouponMapper extends BaseMapper<TCoupon> {

}
