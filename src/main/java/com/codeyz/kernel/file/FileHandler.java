package com.codeyz.kernel.file;

import com.codeyz.kernel.GV;

import java.io.File;

public class FileHandler {

    public static boolean checkUserDirectory(Long id) {
        String path = GV.getPathToStore() + "/files/" + id;
        File file = new File(path);
        return file.exists();
    }

    public static boolean checkDirectory(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static void initUserDirectory(Long id) {
        String path = GV.getPathToStore() + "files/" + id + "/";

        File root = new File(path);
        File document = new File(path + "document");
        File voice = new File(path + "voice");
        File video = new File(path + "video");
        File photo = new File(path + "photo");
        File audio = new File(path + "audio");
        File animation = new File(path + "animation");

        root.mkdirs();
        document.mkdir();
        voice.mkdir();
        video.mkdir();
        photo.mkdir();
        audio.mkdir();
        animation.mkdir();
    }

    public static String formPath(Long userId, String type) {
        return GV.getPathToStore() + "/files/" + userId + "/" + type + "/";
    }
}
