/**
 * Created by rama on 18/01/16.
 * Binary search
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product
 * fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the
 * first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return helper(1, n);
    }

    public int helper(int l, int r) {
        int m = l + (r - l) / 2;
        if (l == r) {
            return l;
        }
        if (r - l == 1) {
            return isBadVersion(l) ? l : r;
        }
        if (!isBadVersion(m - 1)) {
            return helper(m, r);
        } else {
            return helper(l, m - 1);
        }

    }

    public boolean isBadVersion(int k) {
        //fake function
        return k % 27 == 0;
    }
}
