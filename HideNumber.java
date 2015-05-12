    /*
     * 0123456789  ->  0123***789
     */
    public static String hideNumber(String origin, int beginStart, int beginEnd, int endStart) {
        String subBegin = origin.substring(beginStart, beginEnd);
        String subEnd = origin.substring(endStart);
        String star = "****";
        return subBegin + star + subEnd;
    }