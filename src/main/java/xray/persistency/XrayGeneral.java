package xray.persistency;

import com.jfrog.xray.client.services.summary.General;

/**
 * Created by romang on 4/12/17.
 */
public class XrayGeneral {
    public String componentId;
    public String name;
    public String path;
    public String pkgType;
    public String sha256;

    public XrayGeneral() {
    }

    public XrayGeneral(General general) {
        componentId = general.getComponentId();
        name = general.getName();
        path = general.getPath();
        pkgType = general.getPkgType();
        sha256 = general.getSha256();
    }
}
