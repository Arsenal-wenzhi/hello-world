// HJ4 字符串分隔
/*
 * 描述
•连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

输入描述：
连续输入字符串(输入多次,每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：
abc
123456789
复制
输出：
abc00000
12345678
90000000
 * */

#include <iostream>
using namespace std;

int main() {
    string str;
    while (getline(cin, str)) {
        while (str.size() > 8) {
            cout << str.substr(0, 8) << endl;
            str = str.substr(8);
        }
        cout << str.append(8-str.size(), '0') << endl;
    }
}


// #include <string>
// #include <vector>
// #include <iostream>
// using namespace std;
//
// int main() {
//     string s;
//     getline(cin, s);
//     while (true) {
//         int len = s.size();
//         if (len <= 8) {
//             s.insert(s.end(), 8-len, '0');
//             cout << s << endl;
//             if (!getline(cin, s)) break;
//         }
//         else {
//             cout << s.substr(0, 8) << endl;
//             s = s.substr(8, len-8);
//         }
//     }
//
//     return 0;
// }

// c++怎么写成一个方法??
