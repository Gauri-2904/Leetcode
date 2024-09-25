class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int i = 0;
        while (i < s.length()) {
            // Check for subtraction cases first
            if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                num += 900;
                i += 2; // Skip both characters
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                num += 400;
                i += 2;
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                num += 90;
                i += 2;
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                num += 40;
                i += 2;
            } else if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                num += 9;
                i += 2;
            } else if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                num += 4;
                i += 2;
            } else {
                // Regular cases
                if (s.charAt(i) == 'M') {
                    num += 1000;
                } else if (s.charAt(i) == 'D') {
                    num += 500;
                } else if (s.charAt(i) == 'C') {
                    num += 100;
                } else if (s.charAt(i) == 'L') {
                    num += 50;
                } else if (s.charAt(i) == 'X') {
                    num += 10;
                } else if (s.charAt(i) == 'V') {
                    num += 5;
                } else if (s.charAt(i) == 'I') {
                    num += 1;
                }
                i++; // Move to the next character
            }
        }
        return num;
    }
}
