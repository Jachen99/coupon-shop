package space.jachen.couponapp.mapper;

import org.apache.ibatis.annotations.Mapper;
import space.jachen.couponapp.entity.TUserCoupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * ⽤用户优惠	券 Mapper 接口
 * </p>
 *
 * @author jachen
 * @since 2023-03-01
 */
@Mapper
public interface TUserCouponMapper extends BaseMapper<TUserCoupon> {

}
