import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FitNesseExpediter implements ResponseSender {
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Response response;
    private FitnesseContext context;
    protected long requestParsingTimeLimit;
    private long requestProgres;
    private long requestParsingDeadLine;
    private Boolean hasError;
} 
