package com.ctrip.xpipe.redis.console.console;

import com.ctrip.xpipe.endpoint.HostPort;
import com.ctrip.xpipe.redis.console.healthcheck.actions.interaction.HEALTH_STATE;
import com.ctrip.xpipe.redis.console.model.consoleportal.UnhealthyInfoModel;

import java.util.Map;

/**
 * @author wenchao.meng
 *         <p>
 *         Jun 07, 2017
 */
public interface ConsoleService {

    HEALTH_STATE getInstanceStatus(String ip, int port);

    Boolean getInstancePingStatus(String ip, int port);

    Long getInstanceDelayStatus(String ip, int port);

    Map<HostPort, Long> getAllInstanceDelayStatus();

    UnhealthyInfoModel getActiveClusterUnhealthyInstance();

}
