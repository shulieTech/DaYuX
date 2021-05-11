package io.shulie.amdb.adaptors.connector;

import io.shulie.amdb.adaptors.common.Closeable;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

/**
 * 连接类接口
 *
 * @author vincent
 */
public interface Connector extends Closeable {

    static final int DEFAULT_PORT = NumberUtils.toInt(System.getenv().get("default.http.port"), 8080);


    /**
     * 使用默认端口初始化
     *
     * @throws Exception
     */
    public void init() throws Exception;

    /**
     * 使用预设端口初始化
     *
     * @throws Exception
     */
    public void init(int... ports) throws Exception;

    /**
     * 使用预设端口初始化
     *
     * @throws Exception
     */
    public void init(String zookeepers, int connectionTimeout, int sessionTimeout) throws Exception;


    /**
     * 使用预设端口初始化
     *
     * @throws Exception
     */
    public <T> void addPath(String path, Class<T> paramsClazz, Processor processor) throws Exception;


    /**
     * 获取子路径
     * @param path
     * @return
     */
    public List<String> getChildrenPath(String path) throws Exception;
    /**
     * 初始化connector
     */
    public void start() throws Exception;


    /**
     * @return
     */
    public ConnectorType getType();

    public enum ConnectorType {
        JETTY,
        ZOOKEEPER_PATH,
        ZOOKEEPER_NODE,
        RMQ_CONSUMER,
        KFK_CONSUMER,
        NETTY_REMOTING,
    }

}
