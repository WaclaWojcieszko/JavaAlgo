package org.wojcieszko.commonString;

public class CommonString {


    public String[] strings;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public String beginningString() {
        String result = strings[0];
        for (String s : strings) {
            int commonChars = 0;
            for (int i = 0; i < result.length() && i < s.length(); ++i) {
                if (s.charAt(i) == result.charAt(i)) {
                    commonChars = i + 1;
                } else {
                    break;
                }
            }
            result = s.substring(0, commonChars);
        }
        return result;
    }


}
