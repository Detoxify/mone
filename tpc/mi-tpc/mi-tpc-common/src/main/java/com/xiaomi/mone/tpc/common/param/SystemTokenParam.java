package com.xiaomi.mone.tpc.common.param;

import com.xiaomi.mone.tpc.common.enums.SystemStatusEnum;
import lombok.Data;
import lombok.ToString;

/**
 * @project: mi-tpc
 * @author: zgf1
 * @date: 2022/3/3 19:52
 */
@Data
@ToString(callSuper = true)
public class SystemTokenParam extends BaseParam {

    private Long id;

    @Override
    public boolean argCheck() {
        if (id == null) {
            return false;
        }
        return true;
    }
}
