class Solution {
    public boolean checkIfPangram(String a) {
        int bitmask = 0;
        
        for (char c : a.toCharArray()) {
            bitmask |= (1 << (c - 'a'));
        }

        return bitmask == ((1 << 26) - 1);
    }
}
