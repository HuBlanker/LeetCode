//给定一个整数数组，判断是否存在重复元素。 
//
// 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。 
//
// 
//
// 示例 1: 
//
// 输入: [1,2,3,1]
//输出: true 
//
// 示例 2: 
//
// 输入: [1,2,3,4]
//输出: false 
//
// 示例 3: 
//
// 输入: [1,1,1,3,3,4,3,2,4,2]
//输出: true 
// Related Topics 数组 哈希表 
// 👍 292 👎 0

#include <unordered_map>
#include <iostream>
#include <vector>

using std::vector;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
public:
    bool containsDuplicate(vector<int> &nums) {
        std::unordered_map<int, int> map;
        for (int n : nums) {
            map[n]++;
            if (map[n] > 1) return true;
        }
        return false;
    }
};
//leetcode submit region end(Prohibit modification and deletion)


int main(int argc, char **argv) {

    auto *s = new Solution();
    auto *pVector = new vector<int>();
    pVector->push_back(1);
    pVector->push_back(2);
    pVector->push_back(3);
    pVector->push_back(1);

    std::cout << s->containsDuplicate(*pVector) << "\n";

}
