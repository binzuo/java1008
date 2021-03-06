package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/8 0008.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "namodizangpusamohesa";
        //1:charAt 返回指定索引处的 char 值。
        System.out.println(s.charAt(0));   // n
        System.out.println(s.charAt(1));   // a
        System.out.println(s.charAt(2));   // m
        System.out.println(s.length());//20
        System.out.println(s.charAt(s.length()-1));//a
        System.out.println("南无地藏菩萨摩诃萨!");
        //2:concat 将指定字符串连接到此字符串的结尾。
        String s1 = "namo";
        String s2 = "";
        System.out.println(s.concat(s1));   // namodizangpusamohesanamo
        System.out.println(s+s1);//namodizangpusamohesanamo
        System.out.println(s2.concat(s1));  // namo
        System.out.println(s.concat(s2));   // namodizangpusamohesa
        System.out.println(s1.concat(s2));  // namo
        System.out.println("南无地藏菩萨摩诃萨!");
        //3:contains 当且仅当此字符串包含指定的 char 值序列时，返回 true。
        System.out.println(s.contains("amo"));   // true
        System.out.println(s.contains("pusa"));  // true
        System.out.println(s.contains("p"));     // true
        System.out.println(s.contains("psa"));   // false
        System.out.println("南无地藏菩萨摩诃萨!");
        //4:endsWith 测试此字符串是否以指定的后缀结束。
        //15:startwith 测试此字符串是否以指定的前缀开始。
        //             测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
        System.out.println(s.endsWith("sa"));    // true
        System.out.println(s.endsWith("mohesa"));// true
        System.out.println(s.endsWith("a"));     // true
        System.out.println(s.endsWith("hsa"));   // false
        System.out.println(s.startsWith("na"));  // true
        System.out.println(s.startsWith("m",2)); // true
        System.out.println("南无地藏菩萨摩诃萨！");
        //5:equals 将此字符串与指定的对象比较。
        String s3 = "namoamituofo";
        String s4 = "namodizangpusamohesa";
        System.out.println(s.equals(s3));       // false
        System.out.println(s.equals(s4));       // true
        System.out.println("南无地藏菩萨摩诃萨");
        //6:equalsIgnoreCase
        String s5 = "namobenshishijiamounifo";
        String s6 = "NAMODIZANGPUSAMOHESA";
        System.out.println(s.equalsIgnoreCase(s5));// false
        System.out.println(s.equalsIgnoreCase(s6));// true
        System.out.println("南无地藏菩萨摩诃萨");
//        7:format
//        JAVA String.format 方法使用介绍
//        1.对整数进行格式化：%[index$][标识][最小宽度]转换方式
//        我们可以看到，格式化字符串由4部分组成，其中%[index$]的含义我们上面已经讲过，[最小宽度]的含义也很好理解，就是最终该整数转化的字符串最少包含多少位数字。我们来看看剩下2个部分的含义吧：
//
//        标识：
//        '-'    在最小宽度内左对齐，不可以与“用0填充”同时使用
//        '#'    只适用于8进制和16进制，8进制时在结果前面增加一个0，16进制时在结果前面增加0x
//        '+'    结果总是包括一个符号（一般情况下只适用于10进制，若对象为BigInteger才可以用于8进制和16进制）
//        '  '    正值前加空格，负值前加负号（一般情况下只适用于10进制，若对象为BigInteger才可以用于8进制和16进制）
//        '0'    结果将用零来填充
//        ','    只适用于10进制，每3位数字之间用“，”分隔
//        '('    若参数是负数，则结果中不添加负号而是用圆括号把数字括起来（同‘+’具有同样的限制）
//
//        转换方式：
//        d-十进制   o-八进制   x或X-十六进制
//        上面的说明过于枯燥，我们来看几个具体的例子。需要特别注意的一点是：大部分标识字符可以同时使用。
//
//        System.out.println(String.format("%1$,09d", -3123));
//        System.out.println(String.format("%1$9d", -31));
//        System.out.println(String.format("%1$-9d", -31));
//        System.out.println(String.format("%1$(9d", -31));
//        System.out.println(String.format("%1$#9x", 5689));
//        结果为：
//-0003,123
//      -31
//-31
//     (31)
//   0x1639
//        2.对浮点数进行格式化：%[index$][标识][最少宽度][.精度]转换方式
//        我们可以看到，浮点数的转换多了一个“精度”选项，可以控制小数点后面的位数。
//
//        标识：
//        '-'    在最小宽度内左对齐，不可以与“用0填充”同时使用
//        '+'    结果总是包括一个符号
//        '  '    正值前加空格，负值前加负号
//        '0'    结果将用零来填充
//        ','    每3位数字之间用“，”分隔（只适用于fgG的转换）
//        '('    若参数是负数，则结果中不添加负号而是用圆括号把数字括起来（只适用于eEfgG的转换）
//
//        转换方式：
//        'e', 'E'  --  结果被格式化为用计算机科学记数法表示的十进制数
//        'f'          --  结果被格式化为十进制普通表示方式
//        'g', 'G'    --  根据具体情况，自动选择用普通表示方式还是科学计数法方式
//        'a', 'A'    --   结果被格式化为带有效位数和指数的十六进制浮点数
//        3.对字符进行格式化：
//        对字符进行格式化是非常简单的，c表示字符，标识中'-'表示左对齐，其他就没什么了。
//        4.对百分比符号进行格式化：
//        看了上面的说明，大家会发现百分比符号“%”是特殊格式的一个前缀。那么我们要输入一个百分比符号该怎么办呢？肯定是需要转义字符的,但是要注意的是，在这里转义字符不是“\”，而是“%”。换句话说，下面这条语句可以输出一个“12%”：
//        System.out.println(String.format("%1$d%%", 12));
//        5.取得平台独立的行分隔符：
//        System.getProperty("line.separator")可以取得平台独立的行分隔符，但是用在format中间未免显得过于烦琐了。于是format函数自带了一个平台独立的行分隔符那就是String.format("%n")。
//        6.对日期类型进行格式化：
//        以下日期和时间转换的后缀字符是为 't' 和 'T' 转换定义的。这些类型相似于但不完全等同于那些由 GNU date 和 POSIX strftime(3c) 定义的类型。提供其他转换类型是为了访问特定于 Java 的功能（如将 'L' 用作秒中的毫秒）。
//        以下转换字符用来格式化时间：
//        'H'     24 小时制的小时，被格式化为必要时带前导零的两位数，即 00 - 23。
//        'I'     12 小时制的小时，被格式化为必要时带前导零的两位数，即 01 - 12。
//        'k'     24 小时制的小时，即 0 - 23。
//        'l'     12 小时制的小时，即 1 - 12。
//        'M'     小时中的分钟，被格式化为必要时带前导零的两位数，即 00 - 59。
//        'S'     分钟中的秒，被格式化为必要时带前导零的两位数，即 00 - 60 （"60" 是支持闰秒所需的一个特殊值）。
//        'L'     秒中的毫秒，被格式化为必要时带前导零的三位数，即 000 - 999。
//        'N'     秒中的毫微秒，被格式化为必要时带前导零的九位数，即 000000000 - 999999999。
//        'p'     特定于语言环境的 上午或下午 标记以小写形式表示，例如 "am" 或 "pm"。使用转换前缀 'T' 可以强行将此输出转换为大写形式。
//        'z'     相对于 GMT 的 RFC 822 格式的数字时区偏移量，例如 -0800。
//        'Z'     表示时区缩写形式的字符串。Formatter 的语言环境将取代参数的语言环境（如果有）。
//        's'     自协调世界时 (UTC) 1970 年 1 月 1 日 00:00:00 至现在所经过的秒数，即 Long.MIN_VALUE/1000 与 Long.MAX_VALUE/1000 之间的差值。
//        'Q'     自协调世界时 (UTC) 1970 年 1 月 1 日 00:00:00 至现在所经过的毫秒数，即 Long.MIN_VALUE 与 Long.MAX_VALUE 之间的差值。
//        以下转换字符用来格式化日期：
//        'B'     特定于语言环境的月份全称，例如 "January" 和 "February"。
//        'b'     特定于语言环境的月份简称，例如 "Jan" 和 "Feb"。
//        'h'     与 'b' 相同。
//        'A'     特定于语言环境的星期几全称，例如 "Sunday" 和 "Monday"
//        'a'     特定于语言环境的星期几简称，例如 "Sun" 和 "Mon"
//        'C'     除以 100 的四位数表示的年份，被格式化为必要时带前导零的两位数，即 00 - 99
//        'Y'     年份，被格式化为必要时带前导零的四位数（至少），例如，0092 等于格里高利历的 92 CE。
//        'y'     年份的最后两位数，被格式化为必要时带前导零的两位数，即 00 - 99。
//        'j'     一年中的天数，被格式化为必要时带前导零的三位数，例如，对于格里高利历是 001 - 366。
//        'm'     月份，被格式化为必要时带前导零的两位数，即 01 - 13。
//        'd'     一个月中的天数，被格式化为必要时带前导零两位数，即 01 - 31
//        'e'     一个月中的天数，被格式化为两位数，即 1 - 31。
//        以下转换字符用于格式化常见的日期/时间组合。
//        'R'     24 小时制的时间，被格式化为 "%tH:%tM"
//        'T'     24 小时制的时间，被格式化为 "%tH:%tM:%tS"。
//        'r'     12 小时制的时间，被格式化为 "%tI:%tM:%tS %Tp"。上午或下午标记 ('%Tp') 的位置可能与语言环境有关。
//        'D'     日期，被格式化为 "%tm/%td/%ty"。
//        'F'     ISO 8601 格式的完整日期，被格式化为 "%tY-%tm-%td"。
//        'c'     日期和时间，被格式化为 "%ta %tb %td %tT %tZ %tY"，例如 "Sun Jul 20 16:17:00 EDT 1969"。
        System.out.println("南无地藏菩萨摩诃萨");
        //8:getBytes 使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        //9:indexOf (1)返回指定字符在此字符串中第一次出现处的索引。
//                  (2)从指定的索引开始搜索(包含指定的索引),返回在此字符串中第一次出现指定字符处的索引,如果此字符串中 fromIndex 或之后的位置没有这样的字符出现，则返回 -1。
//         :lastIndexOf 返回指定字符在此字符串中最后一次出现处的索引。
        //String s="namodizangpusamohesa";
        System.out.println(s.indexOf('n'));   // 0
        System.out.println(s.indexOf('m'));  //  2
        System.out.println(s.indexOf('m', 1)); // 2
        System.out.println(s.indexOf('m', 2)); // 2
        System.out.println(s.indexOf('m', 3)); // 14
        System.out.println(s.indexOf('m', 5)); // 14
        System.out.println(s.indexOf('m', 15)); // -1
        System.out.println(s.indexOf('m', 16)); // -1
        System.out.println(s.lastIndexOf('a'));// 19
        System.out.println("南无地藏菩萨摩诃萨！");
        //10:isEmpty 当且仅当 length() 为 0 时返回 true。
        String s7 = "";
        System.out.println(s.isEmpty());   // false
        System.out.println(s7.isEmpty());  // true
        System.out.println("南无地藏菩萨摩诃萨！");
        //11:length  返回此字符串的长度。
        System.out.println(s.length());   // 20
        System.out.println("南无地藏菩萨摩诃萨！");
        //12:matches 告知此字符串是否匹配给定的正则表达式。
        //13:replace 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        //      ：replaceAll
        //      ：replaceFirst
        String s8 = "asdf1234";
        System.out.println(s8.replace('a', 'b'));   // bsdf1234
        System.out.println(s8.replace('1', '9'));   //  asdf9234
        System.out.println(s8.replace("asdf", "hjkl"));//hjkl1234
        System.out.println(s8.replace("asdf", "zx"));//zx1234
        System.out.println(s8.replace("asdf", "z"));//z1234
        System.out.println(s8.replace("1234", "asdf"));//asdfasdf
        System.out.println("南无地藏菩萨摩诃萨！");
        //14:split 根据给定正则表达式的匹配拆分此字符串。
        String s10 = "a b  c d e";
        String[] strings = s10.split("  ");//""之间的空格个数小于等于指定的字符串中的空格个数，就拆分。
        for (String string : strings) {
            System.out.println(string);// a b
        }                             //  c d e
        System.out.println("南无地藏菩萨摩诃萨");
        //16:substring
        // (1)返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始(包括指定索引处的字符)，直到此字符串末尾。
        // (2)返回一个新字符串，它是此字符串的一个子字符串。该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。因此，该子字符串的长度为 endIndex-beginIndex。
        System.out.println(s.substring(2));  // modizangpusamohesa
        System.out.println(s.substring(2,4));//mo
        System.out.println(s.substring(s.indexOf('d'),s.indexOf('p')));// dizang
        System.out.println(s.substring(s.indexOf('p'),s.indexOf('p')+4));//pusa
        System.out.println("南无地藏菩萨摩诃萨");
        //17:toCharArray 将此字符串转换为一个新的字符数组。

        System.out.println("南无地藏菩萨摩诃萨");
        //18:toLowerCase 使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。大小写映射关系基于 Character 类指定的 Unicode 标准版。由于大小写映射关系并不总是 1:1 的字符映射关系，因此所得 String 的长度可能不同于原 String。
        String s9="NAMOAMITUOFO";
        System.out.println(s9.toLowerCase());//namoamituofo
        System.out.println("南无地藏菩萨摩诃萨");
        //19:toUpperCase 使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。大小写映射关系基于 Character 类指定的 Unicode 标准版。由于大小写映射关系并不总是 1:1 的字符映射关系，因此所得 String 的长度可能不同于原 String。
        System.out.println(s.toUpperCase());
        String s11="NAMOdizangpusamohesa";
        System.out.println(s11.toLowerCase().toUpperCase());/*先变小写，后变大写*/ // NAMODIZANGPUSAMOHESA
        System.out.println("南无地藏菩萨摩诃萨");
        //20:toCharArray 将此字符串转换为一个新的字符数组。
        char[]cs=s.toCharArray();// 必须以 char[]定义。
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] >= 'a' && cs[i] <= 'z') {
                cs[i] -= 32;
            }

            System.out.println(cs[i]);//n
            //a
            //m
            //o
            //d
            //i
            //z
            //a
            //n
            //g
            //p
            //u
            //s
            //a
            //m
            //o
            //h
            //e
            //s
            //a

        }
        System.out.println(cs[0]);// n
        // 21:valueOf 返回 int/boolean/char/double/float/long/Object 参数的字符串表示形式。
        //
        int i=100;
        String s12=String.valueOf(i);
        System.out.println(s12);//100



    }
}
