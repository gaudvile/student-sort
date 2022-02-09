package model;

public enum Algorithm {
    BUBBLE, HEAP, MERGE;

    public static boolean isValidAlgorithm(String name) {
        for (Algorithm a : values()) {
            if(a.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
