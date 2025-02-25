package irita.sdk.client;

import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannelBuilder;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.exception.IritaSDKException;

public class GrpcFactory {
    private static final String HTTP_PREFIX = "http://";
    private static final String HTTPS_PREFIX = "https://";

    public static Channel createGrpcClient(ClientConfig cliConfig, OpbConfig opbConfig) {
        return createGrpcClient(cliConfig.getGrpcAddr(), opbConfig);
    }

    public static Channel createGrpcClient(String grpcAddr, OpbConfig opbConfig) {
        grpcAddr = removePrefix(grpcAddr);

        String[] split = grpcAddr.split(":");
        if (split.length != 2) {
            throw new IritaSDKException("grpcAddr:\t" + grpcAddr + "is not correct");
        }
        return createGrpcClient(split[0], Integer.parseInt(split[1]), opbConfig);
    }

    public static Channel createGrpcClient(String name, int port, OpbConfig opbConfig) {
        name = removePrefix(name);
        Channel channel = ManagedChannelBuilder.forAddress(name, port).usePlaintext().build();
        channel = ClientInterceptors.intercept(channel, new GrpcBSNInterceptor(opbConfig));
        return channel;
    }

    private static String removePrefix(String grpcAddr) {
        if (grpcAddr.startsWith(HTTP_PREFIX)) {
            grpcAddr = grpcAddr.substring(HTTP_PREFIX.length());
        }
        if (grpcAddr.startsWith(HTTPS_PREFIX)) {
            grpcAddr = grpcAddr.substring(HTTPS_PREFIX.length());
        }
        return grpcAddr;
    }
}
