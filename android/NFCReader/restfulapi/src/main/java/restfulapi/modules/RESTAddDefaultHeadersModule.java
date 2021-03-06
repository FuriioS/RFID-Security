package restfulapi.modules;

import restfulapi.HttpMethod;
import restfulapi.RESTfulAPI;

public class RESTAddDefaultHeadersModule extends RESTfulAPIModule {

    private static final String TAG = "RESTAddHeadersModule";

    public RESTAddDefaultHeadersModule() {
        super(TAG);
    }

    @Override
    public void onPreExecute(RESTfulAPI restApi, HttpMethod request, boolean sync) {
        request.addHeader("Connection", "Keep-Alive");
        request.addHeader("Content-Type", "application/json");
    }
}
