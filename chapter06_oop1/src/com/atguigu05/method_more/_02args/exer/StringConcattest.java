package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConcattest
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 * @Author skk
 * @Create 2023/3/3 22:17
 * @Version 1.0
 */
public class StringConcattest {
    public static void main(String[] args) {
        StringConcattest test = new StringConcattest();
        System.out.println(test.concat("-", "tom", "is", "boy"));

    }
    public String concat(String operatir,String ... strs){
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if(i==0){
                result += strs[i];
            }else {
                result += (operatir + strs[i]);
            }
        }
        return result;
    }
}
