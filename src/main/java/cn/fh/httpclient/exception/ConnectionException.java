package cn.fh.httpclient.exception;

/**
 * Created by whf on 8/5/15.
 */
public class ConnectionException extends Exception {
    private String msg;

    public ConnectionException(String msg) {
        super(msg);
    }

    public String getMessage() {
        return this.msg;
    }
}
