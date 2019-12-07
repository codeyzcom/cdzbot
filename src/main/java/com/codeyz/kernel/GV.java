package com.codeyz.kernel;


public class GV {

    private static String secretKey;

    private static Integer updateId = 0;
    private static String pathToStore;

    private static Boolean enhancementSecure;

    public static final String VOICE = "voice";
    public static final String DOCUMENT = "document";
    public static final String VIDEO = "video";
    public static final String PHOTO = "photo";
    public static final String AUDIO = "audio";
    public static final String ANIMATION = "animation";

    public static String getSecretKey() {
        return secretKey;
    }

    public static void setSecretKey(String secretKey) {
        GV.secretKey = secretKey;
    }

    public static synchronized Integer getUpdateId() {
        return updateId;
    }

    public static synchronized void setUpdateId(Integer updateIdIn) {
        if (updateId < updateIdIn) {
            GV.updateId = updateIdIn;
        }
    }

    public static String getPathToStore() {
        return pathToStore;
    }

    public static void setPathToStore(String pathToStore) {
        GV.pathToStore = pathToStore;
    }

    public static Boolean getEnhancementSecure() {
        return enhancementSecure;
    }

    public static void setEnhancementSecure(Boolean enhancementSecure) {
        GV.enhancementSecure = enhancementSecure;
    }
}
