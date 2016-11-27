cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -rn | awk '{print $2" "$1}'

#tr -s: 使用指定字符串替换出现一次或者连续出现的目标字符串（把一个或多个连续空格用换行符代替）

#sort: 将单词从小到大排序

#uniq -c: uniq用来对连续出现的行去重，-c参数为计数

#sort -rn: -r 倒序排列， -n 按照数值大小排序（感谢网友 长弓1990 指正）

#awk '{ print $2, $1 }': 格式化输出，将每一行的内容用空格分隔成若干部分，$i为第i个部分。

#出处：

#http://bookshadow.com/weblog/2015/03/24/leetcode-word-frequency/