package com.codeyz.kernel.net;

import com.codeyz.kernel.file.FileHandler;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadFile {

    private String url;
    private String path;

    public DownloadFile(String url, String path) {
        this.url = url;
        this.path = path;
    }

    public void carry() {
        if (FileHandler.checkDirectory(path)) {
            try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream())) {
                FileOutputStream fos = new FileOutputStream(path);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer, 0, 1024)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
