package space.jachen.couponapp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;

/**
 * <p>
 * 优惠券定	义表
 * </p>
 *
 * @author jachen
 * @since 2023-03-01
 */
@Data
public class TCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 优惠券码
     */
    private String code;

    /**
     * 优惠券图
     */
    private String picUrl;

    /**
     * 达到满减资格⾦金金额
     */
    private Integer achieveAmount;

    /**
     * 所减⾦金金额
     */
    private Integer reduceAmount;

    /**
     * 库存，当库存为0不不可领取
     */
    private Integer stock;

    /**
     * 优惠券名称
     */
    private String title;

    /**
     * 状态为0表示可⽤用，1为不可用
     */
    private Integer status;

    private LocalDateTime createTime;


}
