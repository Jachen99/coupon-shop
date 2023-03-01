package space.jachen.couponapp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * ⽤用户优惠	券
 * </p>
 *
 * @author jachen
 * @since 2023-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUserCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * ⽤用户优惠券	码
     */
    private String userCouponCode;

    /**
     * 优惠券图
     */
    private String picUrl;

    /**
     * t_coupon表外键ID
     */
    private Integer couponId;

    /**
     * 所领取⽤用户id
     */
    private Integer userId;

    /**
     * 状态为0表示未使⽤用，1为已使⽤用
     */
    private Integer status;

    /**
     * 对应t_order表外键
     */
    private Integer orderId;

    private LocalDateTime createTime;


}
