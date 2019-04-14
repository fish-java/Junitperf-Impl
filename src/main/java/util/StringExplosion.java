package util;

public class StringExplosion {
    private static int defaultTimes = 1000;

    public static void stringAppend(String string){
        stringAppend(string, defaultTimes);
    }
    public static void stringAppend(String string, int times){
        String s = "";
        for (int i = 0; i < times; i++) {
            s += string;
        };
    }

    public static void stringBuilderAppend(String string){
        stringBuilderAppend(string, defaultTimes);
    }
    public static void stringBuilderAppend(String s, int times){
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sBuilder.append(s);
        }
    }
}
