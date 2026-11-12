
class Solution {
public:
    vector<vector<int>> result;
    vector<int> temp;

    void backtrack(int start, int n, int k) {

        // Base case: combination contains k numbers
        if (temp.size() == k) {
            result.push_back(temp);
            return;
        }

        // Try all possible numbers
        for (int i = start; i <= n; i++) {

            // Choose a number
            temp.push_back(i);

            // Recursively find remaining numbers
            backtrack(i + 1, n, k);

            // Backtrack: remove the last number
            temp.pop_back();
        }
    }

    vector<vector<int>> combine(int n, int k) {
        backtrack(1, n, k);
        return result;
    }
};
