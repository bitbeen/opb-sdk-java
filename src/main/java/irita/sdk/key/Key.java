package irita.sdk.key;

import java.io.InputStream;
import java.math.BigInteger;

public interface Key {
    void add() throws Exception;

    void recover(String mnemonic);

    void recover(BigInteger privKey);

    void recover(InputStream keystore, String password);

    void recoverFromCA(InputStream caKeystore, String password);

    String export(String password);
}
