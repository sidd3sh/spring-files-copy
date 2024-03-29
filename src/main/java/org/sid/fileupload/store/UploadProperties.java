package org.sid.fileupload.store;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author siddesh
 * @since 18 Dec 2019
 */


@ConfigurationProperties("upload")
public class UploadProperties {

    /**
     * folder location for storing files
     */
    private String location="upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
